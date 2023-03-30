package com.hedima.presentacion;

import java.util.Scanner;

public class ProbarScanner {
    public static void main(String[] args) {

        //Declarar una variable primitiva
//        int numero = 10;
        //Declarar un objeto Scanner
        Scanner sc = new Scanner(System.in);
//        System.out.println("Ingrese un numero->");
//        numero = sc.nextInt();
//        System.out.println("El numero es: " + numero);
//        //Solicitar  un nombre, si el nombre es  "Juan" le damos la bienvenida, si no sólo damos la bienvenida.
//        System.out.println("Ingrese un nombre->");
//        String nombre = sc.next();
//        if (nombre.equalsIgnoreCase("Juan")) {
//            System.out.println("Bienvenido " + nombre);
//        }

//        System.out.println("Numero 1");
//        int num1 = sc.nextInt();
//        System.out.println( "Numero 2");
//        int n2= sc.nextInt();
//        if (num1 == n2) {
//            System.out.println("Son iguales");
//        } else {
//            System.out.println("No son iguales");
//        }
        //Pedir dos números y decir cual es el mayor.
//        System.out.println("Numero 1:");
//        int n1 = sc.nextInt();
//        System.out.println( "Numero 2");
//        int n2= sc.nextInt();
//        if (n1 > n2) {
//            System.out.println(n1 + " es mayor");
//        } else {
//            System.out.println(n2 + " es mayor");
//        }
//        System.out.println("Numero 1:");
//        int n1 = sc.nextInt();
//        System.out.println( "Numero 2");
//        int n2= sc.nextInt();
//        if (n1 == n2) {
//            System.out.println("Los números son iguales");
//        } else if(n1>n2){
//            System.out.println(n1 + " es mayor");
//        }else{
//            System.out.println(n2 + " es mayor");
//        }
        //6.	Pedir dos números y mostrarlos ordenados de mayor a menor.
        System.out.println("Escriba el primer número:");
        int numero1 = sc.nextInt();
        System.out.println("Escriba el segundo número:");
        int numero2 = sc.nextInt();
        if(numero1>numero2){
            System.out.println(numero1 + " ,"+ numero2 );
        }else{
            System.out.println(numero2 + ","+ numero1 );
        }


    }
}
