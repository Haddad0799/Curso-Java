package br.com.cursoalura.desafio;

import br.com.cursoalura.desafio.audios.Audio;

public class Preferidos {

    public void incluiPreferido(Audio audio) {
        if (audio.getClassificacao() >= 4) {
            System.out.println(audio.getTitulo() + " está entre as melhores do momento.");
        } else {
            System.out.println(audio.getCurtidas() + " pessoas curtiram isso.");
        }
    }
}
