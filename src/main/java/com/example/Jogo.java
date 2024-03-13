package com.example;

public class Jogo {
    private Monte monte = new Monte();
    Jogador jogador = new Jogador();
    Computador computador = new Computador();

    public Jogo() {
        monte.embaralhar();
    }

    public Carta distribuirCartaParaJogador(Jogador jogador) {
        if (jogador.parou()) {
            return null;
        }
        Carta cartaVirada = monte.virar();
        jogador.receberCarta(cartaVirada);
        return cartaVirada;
    }

    public boolean acabou() {
        return jogador.parou() && computador.parou() || jogador.getPontos() > 21 || computador.getPontos() > 21;
    }

    public String resultado() {
        if (jogador.getPontos() == computador.getPontos()
                || (jogador.getPontos() > 21 && computador.getPontos() > 21)) {
            return "Empate!";
        } else if ((jogador.getPontos() > computador.getPontos() && jogador.getPontos() <= 21)
                || computador.getPontos() >= 21) {
            return "Você ganhou!";
        } else {
            return "Você perdeu!";
        }
    }

    public Computador getComputador() {
        return computador;
    }

    public Jogador getJogador() {
        return jogador;
    }

}
