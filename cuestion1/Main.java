/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cuestion1;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author BySum
 */
public class Main {

    public static void main(String[] args) {
        //INSTANCIAR PERRO
        Perro perro1 = new Perro();
        perro1.PerroMorder();
        perro1.comer();
        

        //SOBRECARGA
        perro1.PerroComer("Kira");
        perro1.PerroComer("Max","Perro");
        
        //SOBREESCRITURA
        perro1.saltar("Max");
        perro1.saltar("Perico");
    
    
        
        //TIPOS DE COLECCIONES
        //ARRAYLIST
        ArrayList<String> nombres1 = new ArrayList<>(3);
        //Añadir elementos al arraylist:
        nombres1.add("Sergio");
        nombres1.add("Manolo");
        nombres1.add("Paco");
        //Eliminar un elemento:
        nombres1.remove(2);
        //Recorrer ArrayList:
        for(String nombres : nombres1){
            System.out.println(nombres);
        }       
        
        //STACK
        Stack pila1 = new Stack();
        pila1.push("Sergio");
        pila1.push("Pedro");
        pila1.push("Homer");
        //PINTAR ULTIMO ELEMENTO AÑADIDO A STACK:
        System.out.println(pila1.pop());
    
        //QUEUE
        Queue<String> cola1 = new LinkedList<String>();
        cola1.add("Juan");
        cola1.add("Alex");
        cola1.add("Javier");
        //PINTAR PRIMER ELEMENTO AÑADIDO A QUEUE:
        System.out.println(cola1.poll());
        
        //MAP
        Map<Integer, String> mapa1 = new HashMap<Integer, String>();
        mapa1.put(1, "Alvaro");
        mapa1.put(2, "Ruben");
        mapa1.put(3, "Carlos");
        System.out.println(mapa1);
    }//cierra main
}//cierra clase
