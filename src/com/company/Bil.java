package com.company;

public abstract class Bil {
    int regNr;
    String mærke;
    String model;
    int årgang;
    int antalDøre;

    public Bil(int regNr, String mærke, String model, int årgang, int antalDøre) {
        this.regNr = regNr;
        this.mærke = mærke;
        this.model = model;
        this.årgang = årgang;
        this.antalDøre = antalDøre;
    }

    public abstract int beregnGrønEjerafgift();
}
