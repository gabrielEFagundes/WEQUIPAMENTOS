package com.weg.wequipamentos.service;

import com.weg.wequipamentos.view.InterfaceErros;

public class TratamentoErros {

    public static int tratarErro(String valor){

        try {
            return Integer.parseInt(valor);

        }catch(NumberFormatException erro){
            InterfaceErros.erroParse();
            return -1; // valor padrao
        }
    }

}
