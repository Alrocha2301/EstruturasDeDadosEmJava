package com.projeto.atribuicaoreferencia;

public class main {
    public static void main(String[] args) {

        /*int a = 1;
        int b = a;

        System.out.println(a + "\n" + b);

        a = 2;

        System.out.println(a + "\n" + b);*/

        MeuObjeto objetoA = new MeuObjeto(1);
        MeuObjeto objetoB = objetoA;

        System.out.println("objA" + objetoA + " objB" + objetoB);
        objetoA.setNum(2);
        System.out.println("objA" + objetoA + " objB" + objetoB);
    }
}
