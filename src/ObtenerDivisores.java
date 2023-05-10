/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author omara
 */

import java.util.Scanner;
public class ObtenerDivisores {
    static void esDivisor(){
        Scanner entrada = new Scanner(System.in);

        int num, divisor = 1, count = 0;

        do {
            System.out.print("Ingresa un número mayor a 20: ");
            num = entrada.nextInt();
        } while (num <= 20);

        System.out.print("Los primeros 3 divisores de " + num + " son: ");

        do {
            divisor++;
            if (num % divisor == 0) {
                System.out.print(divisor + " ");
                count++;
            }
        } while (count < 3 && divisor <= num / 2);

        if (count == 0) {
            System.out.println("El número " + num + " no tiene divisores.");
        }
    
    }

    public static void main(String[] args) {
        esDivisor();
    }
}


