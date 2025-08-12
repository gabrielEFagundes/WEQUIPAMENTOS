package com.weg.wequipamentos.view;

public class InterfaceErros {

    private static final String RESET_COR = "\033[0m";
    private static final String VERMELHO_ERRO = "\033[1;31m";
    private static final String VERDE_SUCESSO = "\033[1;32m";

    public void sucesso(){
        System.out.println(VERDE_SUCESSO +
                           "\nSucesso! A ação foi concluída com êxito."
                           + RESET_COR);
    }

    public void erroNotFound(){
        System.out.println(VERMELHO_ERRO +
                           "\nErro! Não encontrei a requisição..."
                           + RESET_COR);
    }

    public void erroNothingRegistered(){
        System.out.println(VERMELHO_ERRO +
                           "\nErro! Nada cadastrado..."
                           + RESET_COR);
    }

    public void erroLessThanZero(){
        System.out.println(VERMELHO_ERRO +
                           "\nErro! O valor não pode ser negativo..."
                           + RESET_COR);
    }

    public static void erroParse(){
        System.out.println(VERMELHO_ERRO +
                          "\nErro! Não entendi o que você digitou..."
                          + RESET_COR);
    }

}
