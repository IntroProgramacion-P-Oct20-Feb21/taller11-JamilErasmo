/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        System.out.println("Ingrese la primera nota");
        nota1 = entrada.nextDouble();
        System.out.println("Ingrese la segunda nota");
        nota2 = entrada.nextDouble();
        System.out.println("Ingrese la tercera nota");
        nota3 = entrada.nextDouble();
        System.out.println("Ingrese la cuarta nota");
        nota4 = entrada.nextDouble();
        String promedio = obtenerPromedio(nota1, nota2, nota3, nota4);
        System.out.println(promedio);
    }
    public static String obtenerPromedio(double a, double b, double c, double d){
        double suma = 0;
        String pro = "";
        suma = (a + b + c + d)/4;
        if((suma >= 0) && (suma <= 5)){
            pro = String.format("%sEl promedio de las notas: %.2f %.2f %.2f %.2f "
                    + "es: Regular", pro, a, b, c, d);
        }else{
            if((suma >= 5.1) && (suma <= 8)){
                pro = String.format("%sEl promedio de las notas: %.2f %.2f %.2f "
                        + "%.2f " + "es: Bueno", pro, a, b, c, d);
            }else{
                if((suma >= 8.1) && (suma <= 9)){
                     pro = String.format("%sEl promedio de las notas: %.2f %.2f "
                             + "%.2f %.2f es: Muy bueno", pro, a, b, c, d);
                }else{
                    if((suma >= 9.1) && (suma <= 10)){
                        pro = String.format("%sEl promedio de las notas: %.2f "
                               + "%.2f %.2f %.2f es: Sobresaliente", pro, a, b, c, d);
                    }           
                }
            }
        }
        return pro;
    }
    }
    
