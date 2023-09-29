package com.michell.greenhorizon.cuarto;

import com.michell.greenhorizon.tercero.ValidarEstado;

public class ValorContable {

    private int id;
    private int valor;
    private char signo;


    public ValorContable(){

    }

    public ValorContable(int id) {
        this.id = id;
    }

    public ValorContable(int id, int valor) {
        this(id);
        this.valor = valor;
    }

    public ValorContable(int id, int valor, char signo){
        this(id, valor);
        this.signo = signo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public char getSigno() {
        return signo;
    }

    public void setSigno(char signo) {
        this.signo = signo;
    }
}
