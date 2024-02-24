package com.daniel.prueba;

import java.util.Scanner;

public class RecursividadDivision {
    public static int DivisionRecursiva(int num) {

        int r = 0;
        if (num <= 1) {
            return 1;
        }else if (num % 2 != 0){
            System.out.println("El numero no puede llegar a 1");
        }else {
            r = DivisionRecursiva(num / 2);
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digita un numero: ");
        int valor = scan.nextInt();
        System.out.println(DivisionRecursiva(valor));
    }
}
