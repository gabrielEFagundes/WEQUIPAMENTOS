package com.weg.wequipamentos.model;

public class PainelControle extends Equipamento{

    private String tensao;

    public PainelControle(){
        super();
        this.tensao = null;
    }

    public PainelControle(String codigo, String nome, Integer quantidade, Double preco, String tensao){
        super(codigo, nome, quantidade, preco);
        this.tensao = tensao;
    }

    public String getTensao() {
        return tensao;
    }

    public void setTensao(String tensao) {
        this.tensao = tensao;
    }

    @Override
    public String toString(){
        return String.format("\n===============================" +
                "\nCódigo do equipamento: %s" +
                "\n\nNome do equipamento: %s" +
                "\nQuantidade do equipamento: %d" +
                "\nPreço do equipamento: %.2f" +
                "\nTensão: %s",
                codigo, nome, quantidade, preco, tensao);
    }
}
