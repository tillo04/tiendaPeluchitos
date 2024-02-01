package org.example;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nombre;
        String cedula;
        Integer opcion;
        Integer cantidadProducto;
        double sumatoria=0.0;
        double costoTotal=0.0;
        Scanner teclado=new Scanner(System.in);

        //proceso
        //1. crear un menu de opciones
        System.out.println("******PELUCHITOS SA******");
        System.out.println("1. cumpleaños");
        System.out.println("2. dia de la mujer");
        System.out.println("3. babyshowers");
        System.out.println("4. salir");

        //2. construir un ciclo para permitir que el ususario escoja
        do {
            System.out.println("dijita la opcion deseada: ");
            opcion=teclado.nextInt();

            //3. evaluando las opciones del menu
            if (opcion==1){
                System.out.println("dijita cuantos kit de cumpleaños deseas");
                cantidadProducto=teclado.nextInt();
                costoTotal=180000*cantidadProducto;
                sumatoria=sumatoria+costoTotal;

            } else if (opcion==2) {
                System.out.println("dijita cuantos kit de dia de la mujer deseas");
                cantidadProducto=teclado.nextInt();
                costoTotal=60000*cantidadProducto;
                sumatoria=sumatoria+costoTotal;

            } else if (opcion==3) {
                System.out.println("dijita cuantos kit de babyshowes deseas");
                cantidadProducto=teclado.nextInt();
                costoTotal=250000*cantidadProducto;
                sumatoria=sumatoria+costoTotal;


            } else if (opcion==4) {
                System.out.println("gracias por su compra, vuelva pronto");

            }else {
                System.out.println("dijita una opcion valida");
            }


        }while (opcion!=4);
        System.out.println("el costo es de: "+sumatoria);







    }
}