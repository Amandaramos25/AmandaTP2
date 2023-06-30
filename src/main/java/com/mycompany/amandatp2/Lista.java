/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.amandatp2;


public class Lista<T> {
    private static class No<T>{
        public No<T> prox; // próximo nó na lista
        public T valor; // elemento (valor) armazenado na lista 
        
        public No (T val){ //construtor do nó da lista
            valor = val; prox = null;
        }
    }
    
    private No inicio; //representa a cabeça (início) da lista
    
    public Lista(){   // construtor da lista
        inicio = null;
    }

  public boolean isEmpty(){
    return inicio == null;
  }
    
public boolean procure( T elem){
    for(No nodo = inicio; nodo != null; nodo = nodo.prox)
       if (elem == nodo.valor) return true; //econtrou o elemento
    return false;                     // não encontrou o elemento
            
  }

  public void insereInicio(T elem){ //insere no início da lista
        No novoNo = new No(elem);
        novoNo.prox = inicio; //novoNo -> inicio antigo
        inicio = novoNo;      // inicio -> novoNo
    }
    
    public void removeInicio(){ //elimina o primiro item da lista
        inicio = inicio.prox; // elimina o elemento e reposiciona o início
    }
    
    public String exibeLista(){
        if(isEmpty()) return "Lista vazia\n"; //teste de lista vazia
        String str = "Lista Encadeada: ";
        for (No nodo = inicio; nodo != null; nodo = nodo.prox)
            str+= " "+ nodo.valor;
        return str + "\n";
    }
    
}