package br.com.alura.mysongs.program;

import br.com.alura.mysongs.modelos.Musica;
import br.com.alura.mysongs.modelos.Podcast;

public class App {
    public static void main(String[] args) {
        
        Musica musicas = new Musica();
        musicas.setTitulo("Forever");
        musicas.setCantor("Kiss");

        for (int i = 0; i < 1000; i++) {
            musicas.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            musicas.curte();
        }

        Podcast podcast = new Podcast();
        podcast.setTitulo("BolhaDev");
        podcast.setApresentador("Marcus Mendes");

        for (int i = 0; i < 5000; i++) {
            podcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            podcast.curte();
        }
    }
}
