package com.weg.wequipamentos.model;

public class MotorEletrico extends Equipamento{

    private Double potencia;

    public MotorEletrico(){
        super();
        this.potencia = null;
    }

    public MotorEletrico(String codigo, String nome, Integer quantidade, Double preco, Double potencia){
        super(codigo, nome, quantidade, preco);
        this.potencia = potencia;
    }

    public Double getPotencia() {
        return potencia;
    }

    public void setPotencia(Double potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString(){
        return String.format("\n===============================" +
                    "\nCódigo do equipamento: %s" +
                    "\n\nNome do equipamento: %s" +
                    "\nQuantidade do equipamento: %d" +
                    "\nPreço do equipamento: %.2f" +
                    "\nPotência: %.2f",
                    codigo, nome, quantidade, preco, potencia);
    }
}
