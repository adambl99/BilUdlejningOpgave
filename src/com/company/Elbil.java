package com.company;

public class Elbil extends Bil {

    int batterikapacitetKWh;
    int maxKm;
    int whPrKm;

    public Elbil(int regNr, String mærke, String model, int årgang, int antalDøre, int batterikapacitetKWh, int maxKm, int whPrKm) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.batterikapacitetKWh = batterikapacitetKWh;
        this.maxKm = maxKm;
        this.whPrKm = whPrKm;
    }

    public int getBatterikapacitetKWh() {
        return batterikapacitetKWh;
    }

    public void setBatterikapacitetKWh(int batterikapacitetKWh) {
        this.batterikapacitetKWh = batterikapacitetKWh;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public int getWhPrKm() {
        return whPrKm;
    }

    public void setWhPrKm(int whPrKm) {
        this.whPrKm = whPrKm;
    }

    public double WhPrKmtokmPrL() {
        whPrKm = getWhPrKm();

        double whPrKmtokmPrL = (100 / (getWhPrKm() / 91.25));

        return whPrKmtokmPrL;
    }

    @Override
    public int beregnGrønEjerafgift() {
        double kmPrL = WhPrKmtokmPrL();
        int prisKlasse1 = 330;
        int prisKlasse2 = 1050;
        int prisklasse3 = 2340;
        int prisKlasse4 = 5500;
        int prisKlasse5 = 10470;
        if (kmPrL > 20) {
            System.out.println("Grønejerafgift er = " + prisKlasse1);
        } else if (kmPrL >= 15 && kmPrL <= 20){
            System.out.println("Grøn ejerafgift er = " + prisKlasse2);
        } else if (kmPrL >= 10 && kmPrL <= 15){
            System.out.println("Grøn ejerafgift er = " + prisklasse3 );
        } else if (kmPrL >= 5 && kmPrL <= 10){
            System.out.println("Grøn ejerafgift er = " + prisKlasse4);
        } else if (kmPrL < 5){
            System.out.println("Grøn ejerafgift er = " + prisKlasse5);
        }
        return (int) kmPrL;
    }

    public String toString() {
        return "Registreringsnummer = " + regNr + "\nMærke = " + mærke + "\nModel = " + model + "\nÅrgang = " + årgang + "\nAntal døre = " + antalDøre + "\nBatterikapacitetKWh = " + batterikapacitetKWh + "\nMaxKM = " + maxKm + "\nWhPrKm = " + whPrKm;
    }
}

