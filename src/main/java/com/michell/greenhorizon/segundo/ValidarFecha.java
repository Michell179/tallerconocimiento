package com.michell.greenhorizon.segundo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ValidarFecha {

    public static boolean validarFecha(String input){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha;

        try {
            fecha = formato.parse(input);
            Calendar calendario = Calendar.getInstance();
            calendario.setTime(fecha);

            int anhio = calendario.get(Calendar.YEAR);
            int mes = calendario.get(Calendar.MONTH) + 1;

            Calendar fechaActual = Calendar.getInstance();
            int anhioActual = fechaActual.get(Calendar.YEAR);
            int mesActual = fechaActual.get(Calendar.MONTH) + 1;

            return (anhioActual == anhio) && (mesActual == mes);

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {

        String fecha = null;
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Ingresar fecha en formato 'día/mes/año'.");
            System.out.println("Ejemplo: 29/09/2023" );
            fecha = scan.nextLine();
        }catch (Exception e){
            System.err.println("Formato no Valido");
            System.exit(1);
        }
        if (validarFecha(fecha)){
            System.out.println("Fecha valida con la actual");
        }else {
            System.out.println("Fecha no coincide con la actualidad");
        }
    }


}
