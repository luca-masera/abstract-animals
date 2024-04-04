package org.experis.animals;

import org.omg.CORBA.PRIVATE_MEMBER;

public abstract class Animale {
    private String name;

    public Animale(String name) {
        this.name = name;
    }

    //DORMI è UGUAE PER TUTTI
    public void dormi(){

        System.out.println("Tutti gli animali quando dormono fanno: Zzz");
    };
    //VERSO E MANGIA SONO ABSTRACT E POSSONO CAMBIARE NELLE VARIE ESTENSIONI DI CLASSI
    public abstract void verso();
    public abstract void mangia();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
