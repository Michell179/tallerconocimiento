package com.michell.greenhorizon.tercero;

import java.net.Inet4Address;
import java.util.HashMap;

public class ValidarEstado {

    public static String validarEstado(HashMap<Integer, String> map, int id){
        /*Definir Estado*/
        String response = null, inactivo = "inactivo", activo = "activo";

        /*Validar registro por Id*/
        if (map.containsKey(id)){
            String estado = map.get(id);
            response = (estado.equals(activo)) ? activo : inactivo;
        }else {
            response = "No existe";
        }
        return response;

    }

    public static void main(String[] args) {

        /*Test Manual*/
        HashMap<Integer, String> registro = new HashMap<>();
        registro.put(1, "inactivo");
        registro.put(2, "activo");
        registro.put(5, "activo");
        registro.put(10, "inactivo");

        /*Resultado*/
        String proceso = validarEstado(registro, 5);
        System.out.println(proceso);
    }

}
