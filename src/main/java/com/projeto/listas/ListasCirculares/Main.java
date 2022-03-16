package com.projeto.listas.ListasCirculares;

public class Main {
    public static void main(String[] args) {

        ListasCirculares<String> minhaListaCircular = new ListasCirculares<>();

        minhaListaCircular.add("teste 1");
        minhaListaCircular.add("teste 2");
        minhaListaCircular.add("teste 3");
        minhaListaCircular.add("teste 4");
        System.out.println(minhaListaCircular);

        /*minhaListaCircular.remove(0);
        System.out.println(minhaListaCircular);

        System.out.println(minhaListaCircular.get(0));
        System.out.println(minhaListaCircular.get(80));

        System.out.println(minhaListaCircular.isEmpty());*/

        for (int i = 0; i < 20; i++) {
            System.out.println(minhaListaCircular.get(i));
        }
    }
}
