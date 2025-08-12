package com.weg.wequipamentos.service;

import com.weg.wequipamentos.model.Equipamento;
import com.weg.wequipamentos.model.MotorEletrico;
import com.weg.wequipamentos.model.PainelControle;
import com.weg.wequipamentos.view.InterfaceErros;
import com.weg.wequipamentos.view.InterfaceUsuario;

import java.util.List;
import java.util.ArrayList;

public class EstoqueService {

    List<Equipamento> equipamentos = new ArrayList<>();
    int valorFinal, contador = 0;
    int qtdMovimentada, movimentacao; // para a mov. do estoque
    boolean valorEncontrado = false;
    String codigoMovimentar;

    public boolean menuBack(boolean programa, int escolha, InterfaceUsuario interfaceUsuario, InterfaceErros interfaceErros, MotorEletrico motorEletrico, PainelControle painelControle){
        switch(escolha){
            case 1 -> {
                String escolhaCadastro = interfaceUsuario.escolhaGeral();

                valorFinal = TratamentoErros.tratarErro(escolhaCadastro);

                switch(valorFinal){
                    case 1:
                        equipamentos.add(interfaceUsuario.cadastrarMotor(motorEletrico));
                        interfaceErros.sucesso();
                        break;

                    case 2:
                        equipamentos.add(interfaceUsuario.cadastrarPainel(painelControle));
                        interfaceErros.sucesso();
                        break;

                    default:
                        interfaceErros.erroNotFound();
                        break;
                }
            }

            case 2 -> {
                if(equipamentos.isEmpty()){
                    interfaceErros.erroNothingRegistered();
                    break;
                }

                String escolhaListagem = interfaceUsuario.tipoListagem();

                valorFinal = TratamentoErros.tratarErro(escolhaListagem);

                switch (valorFinal){
                case 1:
                    for(Equipamento valorEquipamento : equipamentos){
                        interfaceUsuario.listarTudo(contador, equipamentos);
                        contador++;
                    }
                    contador = 0; // reseta o contador
                    break;

                case 2:
                    String escolhaTipo = interfaceUsuario.escolhaGeral();

                    valorFinal = TratamentoErros.tratarErro(escolhaTipo);

                    switch (valorFinal){
                    case 1:
                        for(Equipamento valorEquipamento : equipamentos){
                            if(valorEquipamento instanceof MotorEletrico){
                                interfaceUsuario.listarMotor(contador, equipamentos);
                                contador++;
                            }
                        }

                    case 2:
                        for(Equipamento valorEquipamento : equipamentos){
                            if(valorEquipamento instanceof PainelControle){
                                interfaceUsuario.listarPainel(contador, equipamentos);
                                contador++;
                            }
                        }
                    }
                }
                contador = 0;
            }

            case 3 -> {
                if(equipamentos.isEmpty()){
                    interfaceErros.erroNothingRegistered();
                    break;
                }

                String pesquisaPorCodigo = interfaceUsuario.pesquisaCodigo();

                for(Equipamento valorEquipamento : equipamentos){
                    if(valorEquipamento.getCodigo().equalsIgnoreCase(pesquisaPorCodigo)){
                        interfaceUsuario.listarEquipamento(contador, equipamentos);
                        contador++;
                    }else{
                        interfaceErros.erroNotFound();
                    }
                }
                contador = 0;
            }

            case 4 -> {
                if(equipamentos.isEmpty()){
                    interfaceErros.erroNothingRegistered();
                    break;
                }

                String remocaoPorCodigo = interfaceUsuario.pesquisaCodigo();

                for(contador = 0; contador < equipamentos.size(); contador++){
                    for(Equipamento valorEquipamento : equipamentos){
                        if(valorEquipamento.getCodigo().equalsIgnoreCase(remocaoPorCodigo)){
                            equipamentos.remove(contador);
                            valorEncontrado = true;
                            interfaceErros.sucesso();
                            break;
                        }
                    }
                }

                if(!valorEncontrado){
                    interfaceErros.erroNotFound();
                }
                contador = 0;
            }

            case 5 -> {
                if(equipamentos.isEmpty()){
                    interfaceErros.erroNothingRegistered();
                    break;
                }

                String movimentacaoEstoqueEscolha = interfaceUsuario.escolhaGeral();

                valorFinal = TratamentoErros.tratarErro(movimentacaoEstoqueEscolha);

                switch (valorFinal){
                case 1:
                    codigoMovimentar = interfaceUsuario.pesquisaCodigo();

                    for(contador = 0; contador < equipamentos.size(); contador++) {
                        for (Equipamento valorEquipamento : equipamentos) {
                            if (valorEquipamento.getCodigo().equalsIgnoreCase(codigoMovimentar) && valorEquipamento instanceof MotorEletrico) {
                                int tipoMovimentacao = interfaceUsuario.tipoMovimentacao();

                                switch (tipoMovimentacao) {
                                case 1:
                                    qtdMovimentada = interfaceUsuario.quantidadeMovimentada();
                                    movimentacao = valorEquipamento.getQuantidade() + qtdMovimentada;

                                    valorEquipamento.setQuantidade(movimentacao);
                                    equipamentos.set(contador, valorEquipamento);
                                    break;

                                case 2:
                                    qtdMovimentada = interfaceUsuario.quantidadeMovimentada();
                                    movimentacao = valorEquipamento.getQuantidade() - qtdMovimentada;

                                    if(movimentacao < 0){
                                        interfaceErros.erroLessThanZero();
                                        break;
                                    }

                                    valorEquipamento.setQuantidade(movimentacao);
                                    equipamentos.set(contador, valorEquipamento);
                                    break;

                                default:
                                    interfaceErros.erroNotFound();
                                    break;
                                }
                                // quem sabe eu adiciono o tratamento de erros aqui
                            }
                        }
                    }
                    contador = 0;
                    break;

                case 2:
                    codigoMovimentar = interfaceUsuario.pesquisaCodigo();

                    for(contador = 0; contador < equipamentos.size(); contador++){
                        for(Equipamento valorEquipamento : equipamentos){
                            if(valorEquipamento.getCodigo().equalsIgnoreCase(codigoMovimentar) && valorEquipamento instanceof PainelControle){
                                int tipoMovimentacao = interfaceUsuario.tipoMovimentacao();

                                switch (tipoMovimentacao){
                                case 1:
                                    qtdMovimentada = interfaceUsuario.quantidadeMovimentada();
                                    movimentacao = valorEquipamento.getQuantidade() + qtdMovimentada;

                                    valorEquipamento.setQuantidade(movimentacao);
                                    equipamentos.set(contador, valorEquipamento);
                                    break;

                                case 2:
                                    qtdMovimentada = interfaceUsuario.quantidadeMovimentada();
                                    movimentacao = valorEquipamento.getQuantidade() - qtdMovimentada;

                                    if(movimentacao < 0){
                                        interfaceErros.erroLessThanZero();
                                        break;
                                    }

                                    valorEquipamento.setQuantidade(movimentacao);
                                    equipamentos.set(contador, valorEquipamento);
                                    break;
                                }
                            }
                        }
                    }
                    contador = 0;
                    break;
                }
            }
            case 0 -> {
                programa = false;
                interfaceUsuario.fecharScanner();
                return programa;
            }

            case -1 -> {  }

            default -> { interfaceErros.erroNotFound(); }
        }

        return programa;
    }
}