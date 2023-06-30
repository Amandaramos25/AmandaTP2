/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.amandatp2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class LerArquivo {
    public Lista<Operacoes> Ler() {
      String path = "C:\\Users\\Amanda\\Documents\\NetBeansProjects\\AmandaTP2\\arquivosDeTeste\\nove.txt";
      
      Lista<Operacoes> list = new Lista<Operacoes>();
      
      try (BufferedReader br = new BufferedReader(new FileReader(path))){
          
            String line = br.readLine();
            Conta c = new Conta();
            while(line!=null){
                
                String []vect = line.split(",");
                int numC = Integer.parseInt(vect[0]);
                int tipoOp = Integer.parseInt(vect[1]);
                double valor = Double.parseDouble(vect[2]);
                
                Operacoes op = new Operacoes(numC,tipoOp,valor);
                list.insereInicio(op);

                line = br.readLine();
            }
      }
    catch(IOException e){
        System.out.println("Error: "+e.getMessage());
    }
      return list;
    }
}
