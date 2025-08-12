package com.weg.wequipamentos.view;

import com.weg.wequipamentos.model.Equipamento;
import com.weg.wequipamentos.model.MotorEletrico;
import com.weg.wequipamentos.model.PainelControle;

import java.util.List;
import java.util.Scanner;

public class InterfaceUsuario {

    Scanner scan = new Scanner(System.in);

    public String mainMenu(){

        System.out.print("\n\n===============================\n" +
                "  Sistema de Controle WEG 1.0  " +
                "\n===============================" +
                "\n\n1 - Cadastrar Equipamento" +
                "\n2 - Listar Equipamentos" +
                "\n3 - Pesquisar Equipamentos" +
                "\n4 - Remover Equipamentos por Código" +
                "\n5 - Movimentar Estoque" +
                "\n6 - Gerar Relatório de Estoque" +
                "\n0 - Sair" +
                "\n\nSua opção -> ");

        return scan.next();
    }

    public String escolhaGeral(){
        System.out.print("\n===============================" +
                "\nEm qual equipamento você deseja fazer a ação?" +
                "\n1 - Motor Elétrico" +
                "\n2 - Painel de Controle" +
                "\n-> ");

        return scan.next();
    }

    // <-- Cadastro -->
    public MotorEletrico cadastrarMotor(MotorEletrico motorEletrico){

        System.out.print("\n===============================");

        System.out.print("\nCódigo do motor elétrico: ");
        String codigo = scan.next();

        scan.nextLine();

        System.out.print("\nNome do motor elétrico: ");
        String nome = scan.nextLine();

        System.out.print("\nQuantidade do motor elétrico: ");
        int quantidade = scan.nextInt();

        System.out.print("\nPreço do motor elétrico: ");
        double preco = scan.nextDouble();

        System.out.print("\nPotência do motor elétrico: ");
        double potencia = scan.nextDouble();

        return new MotorEletrico(codigo, nome, quantidade, preco, potencia);
    }

    public PainelControle cadastrarPainel(PainelControle painelControle){

        System.out.print("\n===============================");

        System.out.print("\nCódigo do painel: ");
        String codigo = scan.next();

        scan.nextLine();

        System.out.print("\nNome do painel: ");
        String nome = scan.nextLine();

        System.out.print("\nQuantidade do painel: ");
        int quantidade = scan.nextInt();

        System.out.print("\nPreço do painel: ");
        double preco = scan.nextDouble();

        System.out.print("\nTensão do painel: ");
        String tensaoPainel = scan.next();

        return new PainelControle(codigo, nome, quantidade, preco, tensaoPainel);
    }

    // <-- Listagem -->
    public String tipoListagem(){
        System.out.print("\n===============================" +
                "\nComo você deseja fazer a listagem?" +
                "\n1 - Listar tudo" +
                "\n2 - Listar por tipo" +
                "\n-> ");

        return scan.next();
    }

    public void listarTudo(int contador, List<Equipamento> equipamentos){
        System.out.print(equipamentos.get(contador));
    }

    public void listarMotor(int contador, List<Equipamento> equipamentos){
        System.out.print(equipamentos.get(contador));
    }

    public void listarPainel(int contador, List<Equipamento> equipamentos){
        System.out.println(equipamentos.get(contador));
    }

    public void listarEquipamento(int contador, List<Equipamento> equipamentos){
        System.out.println(equipamentos.get(contador));
    }

    // <-- Pesquisa -->
    public String pesquisaCodigo(){
        System.out.print("\n===============================" +
                "\nQual o código?" +
                "\n-> ");

        return scan.next();
    }

    // <-- Movimentação do estoque -->
    public int tipoMovimentacao(){
        System.out.print("\n===============================" +
                "\nComo você deseja movimentar o estoque?" +
                "\n1 - Adicionar" +
                "\n2 - Remover" +
                "\n-> ");

        return scan.nextInt();
    }

    public int quantidadeMovimentada(){
        System.out.print("\n===============================" +
                "\nO quanto você quer movimentar?" +
                "\n-> ");

        return scan.nextInt();
    }

    // <-- Relatórios de Estoque -->
    public char relatorioEstoque(){
        System.out.print("\n===============================" +
                "\nDeseja gerar um relatório de estoque? (s/n)" +
                "\n-> ");

        return scan.next().charAt(0);
    }

    public void gerarRelatorio(int qtdTotal, String maiorPreco, String maiorQtd){
        System.out.printf("\n===============================" +
                "\nRELATÓRIO GERAL" +
                "\n===============================" +
                "\n > Total de equipamentos: %d" +
                "\n > Maior preço: %s" +
                "\n > Maior quantidade disponível: %s" +
                "\n > Equipamentos com menores estoques:\n",
                qtdTotal, maiorPreco, maiorQtd);
    }

    public void menoresEstoques(int contador, List<String> menoresEstoques){
        System.out.println(menoresEstoques.get(contador));
    }

    // <-- Finalizacao -->
    public void fecharScanner(){
        scan.close();
    }

}
