package com.company;

public class Benzinbil extends Bil {
    int oktantal;
    int kmPrL;

    public Benzinbil(int regNr, String mærke, String model, int årgang, int antalDøre, int oktantal, int kmPrL) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.oktantal = oktantal;
        this.kmPrL = kmPrL;

    }

    public int getOktantal() {
        return oktantal;
    }

    public void setOktantal(int oktantal) {
        this.oktantal = oktantal;
    }

    public int getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    public double getGrønEjerafgiftBenzin(){
        return beregnGrønEjerafgift();
    }

    @Override
    public int beregnGrønEjerafgift() {
        int kmPrL = getKmPrL();
        int prisKlasse1 = 330;
        int prisKlasse2 = 1050;
        int prisklasse3 = 2340;
        int prisKlasse4 = 5500;
        int prisKlasse5 = 10470;
        if (kmPrL > 20){

            System.out.println("Grønejerafgift er = " + prisKlasse1);
        } else if (kmPrL >= 15 && kmPrL <= 20){
            System.out.println("Grøn ejerafgift er = " + prisKlasse2);
        } else if (kmPrL >= 10 && kmPrL <= 15){
            System.out.println("Grøn ejerafgift er =" + prisklasse3 );
        } else if (kmPrL >= 5 && kmPrL <= 10){
            System.out.println("Grøn ejerafgift er = " + prisKlasse4);
        } else if (kmPrL < 5){
            System.out.println("Grøn ejerafgift er = " + prisKlasse5);
        }
        return kmPrL;
    }

    public String toString(){
        return "Registreringsnummer = " + regNr + "\nMærke = " + mærke + "\nModel = " + model + "\nÅrgang = " + årgang + "\nAntal døre = " + antalDøre + "\nOktantal = " + oktantal + "\nkmPrL = " + kmPrL;
    }
}

