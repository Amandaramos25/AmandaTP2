/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.amandatp2;

/**
 *
 * @author aluno
 */
public class Conta {
    private int numConta;
    private Operacoes
            operacoes;
    private double saldoAtual;

    public Conta() {
        operacoes = null;
        saldoAtual = 0;
    }

    public Conta(int numConta, Operacoes operacao) {
        this.numConta = numConta;
        this.operacoes = operacao;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public Operacoes getOperacao() {
        return operacoes;
    }

    public void setOperacao(Operacoes operacao) {
        this.operacoes = operacao;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }
    
    public void criarConta(int nConta){
        Conta con = new Conta();
        Lista listaContas = new Lista();
        
        listaContas.insereInicio(nConta);
    }
    public Conta procure(int c){
        for()
    }
    public void addOperacao(Operacoes opera){
        Operacoes op = new Operacoes();
        op.criar(opera);
    }


}
