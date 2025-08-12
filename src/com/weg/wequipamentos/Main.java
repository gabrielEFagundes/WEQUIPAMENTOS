package com.weg.wequipamentos;

import com.weg.wequipamentos.model.Equipamento;
import com.weg.wequipamentos.model.MotorEletrico;
import com.weg.wequipamentos.model.PainelControle;
import com.weg.wequipamentos.service.EstoqueService;
import com.weg.wequipamentos.service.TratamentoErros;
import com.weg.wequipamentos.view.InterfaceErros;
import com.weg.wequipamentos.view.InterfaceUsuario;

public class Main {
    public static void main(String[] args) {

        EstoqueService estoqueService = new EstoqueService();
        InterfaceUsuario interfaceUsuario = new InterfaceUsuario();
        InterfaceErros interfaceErros = new InterfaceErros();

        Equipamento equipamento = new Equipamento();
        MotorEletrico motorEletrico = new MotorEletrico();
        PainelControle painelControle = new PainelControle();

        String opcaoUsuario;
        int opcaoFinal;
        boolean programa = true;

        do{

            opcaoUsuario = interfaceUsuario.mainMenu();

            opcaoFinal = TratamentoErros.tratarErro(opcaoUsuario);

            programa = estoqueService.menuBack(programa,
                                    opcaoFinal,
                                    interfaceUsuario,
                                    interfaceErros,
                                    motorEletrico,
                                    painelControle
                                    );

        }while(programa);
    }
}