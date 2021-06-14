package uh.ac.cr.iterativeControl;

import java.util.Scanner;

public class IterativeControl {
     Scanner scanner;
     int option;

    public IterativeControl(){
        option = 0;
        scanner = new Scanner(System.in);

    }
    public  void control (){
        do {
            System.out.println("Por favor seleccione el requisito que desea utilizar.\nDigite del 1 al 3 para los requisitos y 4 para salir.");
            option = (int) scanner.nextFloat();
            int counter=0;

            switch (option){
                case 1:
                    System.out.println("¿Cuántas veces desea imprimir “Hello world”? ");
                    int quantity = scanner.nextInt();
                    System.out.println("Bucle while\n");
                    while (counter < quantity){
                        System.out.println("Hello world.");
                        counter++;
                    }
                    System.out.println("\nBucle for");
                    for (counter = 0;counter < quantity; counter++){
                        System.out.println("Hello world.");
                    }
                    break;
                case 2:
                    System.out.println("¿Cuántas veces desea imprimir “Hello world”? ");
                    quantity = scanner.nextInt();
                    do {
                        System.out.println("Hello world.");
                        counter++;
                    }while (counter < quantity);
            }
        }while (option < 4);



    }








}