package com.michell.greenhorizon.quinto;

import com.michell.greenhorizon.cuarto.ValorContable;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {

    /*Se crea un metodo de validación
    * Para cada requisito*/
    public static boolean validarCiudad(List<String> ciudades, Empresa empresa){
        return ( (!ciudades.isEmpty()) && (ciudades.contains(empresa.getCiudad())) );
    }

    public static boolean validarEstado(List<String> estados, Empresa empresa){
        return ( (!estados.isEmpty()) && (estados.contains(empresa.getEstado())) );
    }

    public static boolean validarActivo(List<String> estados, Empresa empresa){
        if ( (!estados.isEmpty()) && (estados.contains(empresa.getEstado())) ){
            return (empresa.getEstado().equals("activo"));
        }else {
            return false;
        }
    }

    public static boolean validarNit(List<Integer> nit, Empresa empresa){
        return ( (!nit.isEmpty()) && (nit.contains(empresa.getNit())) );
    }


    public static void main(String[] args) {

        List<String> ciudades = new ArrayList<>();
        ciudades.add("cali");
        ciudades.add("medellin");
        ciudades.add("bucaramanga");
        ciudades.add("ibague");
        ciudades.add("barranquilla");
        ciudades.add("caratagena");
        ciudades.add("neiva");
        ciudades.add("pereira");
        ciudades.add("palmira");
        ciudades.add("pasto");

        List<String> estados = new ArrayList<>();
        estados.add("activo");
        estados.add("inactivo");
        estados.add("pendiente");

        List<Integer> nits = new ArrayList<>();
        nits.add(1234);
        nits.add(4321);
        nits.add(12345);
        nits.add(54321);
        nits.add(123456);
        nits.add(654321);


        /*Creación de Objetos*/
        Empresa arus = new Empresa(1, "arus", "medellin", "pendiente", 1234);
        Empresa colombina = new Empresa(2, "colombina", "cali", "activo", 1234);
        Empresa bancolombia = new Empresa(3, "bancolombia", "barranquilla", "inactivo", 123456);
        Empresa acer = new Empresa(4, "acer", "pasto", "desconocido", 123456);
        Empresa lg = new Empresa(5, "lg", "palmira", "activo", 12345);


        /*Verificar Requisitos Empresa*/
        if (validarCiudad(ciudades, colombina) && validarEstado(estados, colombina) && validarActivo(estados, colombina) && validarNit(nits, colombina)){
            System.out.println("Empresa correcta");
        }else {
            System.out.println("Empresa no cuenta con los requisitos");
        }
    }
}
