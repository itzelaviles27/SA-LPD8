package org.generation.arrayPrimos;
import java.util.Scanner;

public class array {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int[] numeros = new int[10];
	        
	        System.out.println("Ingresa 10 números:");
	        for (int i = 0; i < 10; i++) {
	            numeros[i] = scanner.nextInt();
	        }
	        
	        // Mostrar el array original
	        System.out.println("Array original mostrando la posición del array más el valor:");
	        for (int i = 0; i < 10; i++) {
	            System.out.println(i + " - " + numeros[i]);
	        }
	        
	        // Mover números primos al principio
	        int[] numerosPrimos = new int[10];
	        int[] otrosNumeros = new int[10];
	        int numPrimosCount = 0;
	        int otrosNumCount = 0;
	        
	        for (int i = 0; i < 10; i++) {
	            if (esPrimo(numeros[i])) {
	                numerosPrimos[numPrimosCount] = numeros[i];
	                numPrimosCount++;
	            } else {
	                otrosNumeros[otrosNumCount] = numeros[i];
	                otrosNumCount++;
	            }
	        }
	        
	        // Mostrar el array con números primos al principio
	        System.out.println("Array con los números primos en las primeras posiciones, mostrando la posición del array más el valor:");
	        for (int i = 0; i < numPrimosCount; i++) {
	            System.out.println(i + " - " + numerosPrimos[i]);
	        }
	        for (int i = 0; i < otrosNumCount; i++) {
	            System.out.println((i + numPrimosCount) + " - " + otrosNumeros[i]);
	        }
	    }

	    // Método para verificar si un número es primo
	    public static boolean esPrimo(int numero) {
	        if (numero <= 1) return false;
	        if (numero <= 3) return true;
	        if (numero % 2 == 0 || numero % 3 == 0) return false;
	        
	        for (int i = 5; i * i <= numero; i += 6) {
	            if (numero % i == 0 || numero % (i + 2) == 0) return false;
	        }
	        
	        return true;
	    }
	
}
