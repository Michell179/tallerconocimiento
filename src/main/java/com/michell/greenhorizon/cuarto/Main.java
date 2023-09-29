package com.michell.greenhorizon.cuarto;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*Inicializamos variables Necesarias*/
        int
                totalPositivo,
                totalNegativo;

        totalPositivo = totalNegativo = 0;


        Scanner scan = new Scanner(System.in);
        ArrayList<ValorContable> valoresContables = new ArrayList<>();


        /*Numero de Objetos a crear*/
        int cantObjetos = 12;
        for (int i = 0; i < cantObjetos; i++){
            System.out.println("\nObjeto: " + (i + 1));
            ValorContable valorContable = new ValorContable();

            System.out.print("ID: ");
            valorContable.setId(scan.nextInt());

            System.out.print("Valor: ");
            valorContable.setValor(scan.nextInt());

            System.out.print("Signo ( '+' o '-'): ");
            valorContable.setSigno(scan.next().charAt(0));
            valoresContables.add(valorContable);
        }

        /*Calcular Totales*/
        for (int i = 0; i < valoresContables.size(); i++){
            /*Positivo*/
            if (valoresContables.get(i).getSigno() == '+'){
                totalPositivo += valoresContables.get(i).getValor();
            }else {
                totalNegativo += valoresContables.get(i).getValor();
            }
        }

        /*Comparar totales*/
        if (totalPositivo > totalNegativo){
            System.out.println("Positivo Mayor");
        } else if (totalPositivo == totalNegativo) {
            System.out.println("Son iguales");
        }else {
            System.out.println("Negativo Mayor");
        }
    }
}
