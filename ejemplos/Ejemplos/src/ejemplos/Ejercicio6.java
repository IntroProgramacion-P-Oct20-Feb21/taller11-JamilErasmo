/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        int limite = 5;
        int contador = 1;
        double numerador;
        double denominador;
        
        while(contador <= limite){
            numerador = obtenerNumerador (contador);
            denominador = obtenerDenominador(contador);
            System.out.printf("%.lf/%.1f\t\t", numerador, denominador);
            contador = contador + 1;
        }
    }
    
    public static double obtenerDenominador(int numero){
        
        double valor = Math.pow(numero, 3);
        
        return valor;
    }
    private static double obtenerNumerador (int numero){
        double valor = Math.pow(numero, 2);
        return valor;
    }
}
