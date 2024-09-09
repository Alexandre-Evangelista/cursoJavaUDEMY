package model;

import model.Exception.DomainException;

public class ContaBancaria {
    private  int numero;
    private String usuario;
    private  double saldo;
    private  double limiteSaque;

    public ContaBancaria(int numero,String usuario, double saldo, double limiteSaque) {
        this.numero = numero;
        this.usuario = usuario;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    public void desposito(double valor){
        setSaldo(valor);
    }
    public void sacar(double valor){
       if (valor>limiteSaque){
           throw new DomainException("valor ultrapassa seu limite de saque");
       }
       if (valor>saldo){
           throw new DomainException("saldo insuficiente para realizar o saque");
       }
       setSaldo(getSaldo()-valor);
        System.out.println("saldo atual =" + saldo);
    }


}
