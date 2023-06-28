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
    public static void main(String[] args){
        
      String path = "C:\\Users\\Amanda\\Documents\\NetBeansProjects\\AmandaTP2\\arquivosDeTeste\\nove.txt";
      
      List<Operacoes> list = new ArrayList<Operacoes>();
      
      try (BufferedReader br = new BufferedReader(new FileReader(path))){
          
            String line = br.readLine();
            while(line!=null){
                
                String []vect = line.split(",");
                int numC = Integer.parseInt(vect[0]);
                int tipoOp = Integer.parseInt(vect[1]);
                double valor = Double.parseDouble(vect[2]);
                
                Operacoes op = new Operacoes(numC,tipoOp,valor);
                list.add(op);
                
                line = br.readLine();
            }
            System.out.println("OPERAÇÕES:");
            for(Operacoes o:list){
                System.out.println(o);
            }
      }
    catch(IOException e){
        System.out.println("Error: "+e.getMessage());
    }
    
        
}
}
