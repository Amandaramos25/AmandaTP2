/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.amandatp2;

public class Operacoes extends Conta{
    private int tipo;
    private int valor;
    private int saldo;

    public Operacoes() {
        
    }

    public Operacoes(int tipo, int valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    public void criar(Operacoes ope){
        int t = getTipo();
        int v = getValor();
        Lista listaTipoOp = new Lista();
        listaTipoOp.insereInicio(t);
        Lista listaValorOp = new Lista();
        listaValorOp.insereInicio(v);
    }
    
    
}
