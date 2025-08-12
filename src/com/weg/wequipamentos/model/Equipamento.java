package com.weg.wequipamentos.model;

public class Equipamento {

    protected String codigo, nome;
    protected Integer quantidade;
    protected Double preco;

    public Equipamento(){
        this.codigo = null;
        this.nome = null;
        this.quantidade = null;
        this.preco = null;
    }

    public Equipamento(String codigo, String nome, Integer quantidade, Double preco){
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString(){
        return String.format("\n===============================" +
                "\nCódigo do equipamento: %s" +
                "\n\nNome do equipamento: %s" +
                "\nQuantidade do equipamento: %d" +
                "\nPreço do equipamento: %.2f",
                codigo, nome, quantidade, preco);
    }
}
