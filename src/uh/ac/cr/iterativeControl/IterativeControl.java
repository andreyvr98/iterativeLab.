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
        //Se utiliza un ciclo para que el usuraio realice el proseso hasta que el lo desee.
        do {
            System.out.println("Por favor selecione el requisito que desea utilizar.\nDigite del 1 al 2 para los requisitos y 3 para salir.");
            option = (int) scanner.nextFloat();
            int counter=0;

            //Se procede a validar que la opción ingresada por el usuario sea correcta.
            if (option <= 0 || option > 3 ){
                System.out.println("Por favor ingrese una opción valida.");

            }else {
                switch (option) {
                    case 1:
                        System.out.println("¿Cuántas veces desea imprimir “Hello world”? ");
                        int quantity = scanner.nextInt();
                        System.out.println("Bucle while\n");
                        while (counter < quantity) {
                            System.out.println("Hello world.");
                            counter++;
                        }
                        System.out.println("\nBucle for");
                        for (counter = 0; counter < quantity; counter++) {
                            System.out.println("Hello world.");
                        }
                        break;
                    case 2:
                        System.out.println("¿Cuántas veces desea imprimir “Hello world”? ");
                        quantity = scanner.nextInt();
                        do {
                            System.out.println("Hello world.");
                            counter++;

                        } while (counter < quantity);
                        break;
                }
            }
        }while (option < 4);



    }








}