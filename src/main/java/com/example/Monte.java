package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import java.util.Collections;

public class Monte {
    
    private List<Carta> cartas = new ArrayList<>();
    Random rand = new Random();
    int tamanhoBaralho = cartas.size();
    
    public Monte() {
        for (int numero = 1; numero <= 13; numero++) {
            for (Naipe naipe : Naipe.values()) {
                cartas.add(new Carta(numero, naipe));
        }
    }
    }

    public void embaralhar() {
        Collections.shuffle(cartas);
    }


    public Carta virar() {
    if (cartas.size() > 0) {
        Carta cartaVirada = cartas.get(0);
        cartas.remove(0);
        return cartaVirada;
    } else {
        return null;
    }
    }
}



