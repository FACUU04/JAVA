package com.alura.screenview.principal;

import java.util.Arrays;
import java.util.List;

public class EjemplosStreams {

    public void muestraEjemplo(){
        List<String> nombres = Arrays.asList("Facundo", "Nahiara", "Malena", "Lautaro", "Tomas", "Tamara", "Nahiu", "Nay");

        nombres.stream()
                .sorted()
                //.limit(4)
                .filter(n -> n.startsWith("N"))
                .map(n -> n.toUpperCase())
                .forEach(System.out::println);
    }
}
