/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.amandatp2;

public class Operacoes {
    private int numConta;
    private int tipo;
    private double valor;
    private double saldo;

    public Operacoes() {
        
    }

    public Operacoes(int numConta, int tipo, double valor) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.valor = valor;
    }
    
    public Operacoes(int numConta, int tipo, double valor, double saldo) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.valor = valor;
        this.saldo = saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Operacoes{" + "numConta=" + numConta + ", tipo=" + tipo + ", valor=" + valor + '}';
    }
}

    
    

    
