package com.example;

public class Carta {
    private int numero;
    private Naipe naipe;

    public Carta(int numero, Naipe naipe) {
        this.numero = numero;
        this.naipe = naipe;
    }

    public String imagePath() {
        String cartaStr;

        if (numero == 1) {
            cartaStr = "Ace";
        } else if (numero == 11) {
            cartaStr = "Jack";
        } else if (numero == 12) {
            cartaStr = "Queen";
        } else if (numero == 13) {
            cartaStr = "King";
        } else {
            cartaStr = String.valueOf(numero);
        }

        return "classic-cards/" + cartaStr + this.naipe + ".png";
    }

    public int getNumero() {
        return numero;
    }

    public Naipe getNaipe() {
        return naipe;
    }
}
