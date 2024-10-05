/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaevaluada1;

import javax.swing.JOptionPane;

/**
 *
 * @author AndrewFuentes
 */
public class PracticaEvaluada1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejercicio 1: Números Pares e Impares
//        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero positivo"));
//
//        int i = 1;
//        while (i <= num) {
//            if (i % 2 == 0) {
//                JOptionPane.showConfirmDialog(null, "el numero " + i
//                        + " es par");
//            } else {
//                JOptionPane.showConfirmDialog(null, "el numero " + i
//                        + " es impar");
//
//            }
//            i++;
//        }
//
//        // Ejercicio 2: Suma de Números
//        
//        int n;
//        
//        while (true){
//            n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero positivo o un negativo para salir"));
//            
//            if(n<0) {
//                break;
//            }
//            
//            int sumador = 0;
//            for (int j = 1; j<=n;j++){
//                sumador +=j;
//            }
//            
//             JOptionPane.showMessageDialog(null, "La suma de los números desde 1 hasta " + n + " es: " + sumador);
//        }
//        
        // Ejercicio 3: Tablas de Multiplicar
        while (true) {
            int numTabla = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero del 1 al 10 para obtener su tabla de multiplicar"));

            if (numTabla > 0 && numTabla <= 10) {
                for (int k = 1; k <= 10; k++) {
                    // El profe permitió usar print para el ejercicio de la tabla de multiplicar.
                    System.out.println(numTabla + " x " + k + " es: " + (k * numTabla));
                }
                break;
            } else{
                JOptionPane.showConfirmDialog(null, "Error el numero ingresado '"+ numTabla + "' no esta en el rango de 1 a 10");
            }
        }

    }

}
