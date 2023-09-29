package com.michell.greenhorizon.primero;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecorrerPalabra {

    public static List<String> recorrerPalabras(List<String> palabras){
        List<String> resultado = new ArrayList<>();
        for (String palabra : palabras){
            if (palabra.length() > 10){
                resultado.add(palabra);
            }
        }
        return resultado;
    }

    public static void main(String[] args) {

        List<String> palabras = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        try {
            /*Cantidad de palabras a ingresar para el Test*/
            int cantidadPalabras = 10;
            for (int i = 0; i < cantidadPalabras; i++){
                System.out.print("Ingresar la palabra: ");
                palabras.add(scan.nextLine());
            }
        }catch (Exception e){
            System.err.println("Error en carácter ingresado");
            System.exit(1);
        }

        /*Imprimir las palabras > 10 letras*/
        List<String> resultado = recorrerPalabras(palabras);
        if (!resultado.isEmpty()){
            for (int i = 0; i < resultado.size(); i++){
                System.out.println("Palabra > 10 #" + (i+1) + resultado.get(i));
            }
        }else {
            System.out.println("No hay palabras mayores a 10 letras");
        }

    }

}
