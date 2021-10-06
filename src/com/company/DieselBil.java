package com.company;

public class DieselBil extends Bil{
    String harPartikelfilter;
    int kmPrL;
    public DieselBil(int regNr, String mærke, String model, int årgang, int antalDøre, String harPartikelfilter, int kmPrL) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.harPartikelfilter = harPartikelfilter;
        this.kmPrL = kmPrL;
    }

    public String getHarPartikelfilter() {
        return harPartikelfilter;
    }

    public void setHarPartikelfilter(String harPartikelfilter) {
        this.harPartikelfilter = harPartikelfilter;
    }

    public int getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    public Object harPartikelfilter(){
        String harPartikelfilter = getHarPartikelfilter();
        int partikelfilterAfgift = 1000;
        switch (harPartikelfilter){
            case "ja", "yes":
                 return "Ingen ekstra afgift da du har partikelfilter";

            case "nej", "no":
                return "Du skal betale: " + partikelfilterAfgift + " da du ikke har et partikelfilter";

        }
        return null;
    }

    public int udligningsAfgift(){
        int udligningsAfgift = getKmPrL();
        int prisKlasse1 = 130;
        int prisKlasse2 = 1390;
        int prisklasse3 = 1850;
        int prisKlasse4 = 2770;
        int prisKlasse5 = 15260;

        if (kmPrL > 20){
            System.out.println("Udligningsafgift er = " + prisKlasse1);
            return prisKlasse1;
        } else if (kmPrL >= 15 && kmPrL <= 20){
            System.out.println("Udligningsafgift er = " + prisKlasse2);
            return prisKlasse2;
        } else if (kmPrL >= 10 && kmPrL <= 15){
            System.out.println("Udligningsafgift er =" + prisklasse3 );
            return prisklasse3;
        } else if (kmPrL >= 5 && kmPrL <= 10){
            System.out.println("Udligningsafgift er = " + prisKlasse4);
            return prisKlasse4;
        } else if (kmPrL < 5){
            System.out.println("Udligningsafgift er = " + prisKlasse5);
            return prisKlasse5;
        }
        return udligningsAfgift();
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

            System.out.println("Grønejerafgift er = " + (prisKlasse1 + udligningsAfgift()));
        } else if (kmPrL >= 15 && kmPrL <= 20){
            System.out.println("Grøn ejerafgift er = " + (prisKlasse2 + udligningsAfgift()));
        } else if (kmPrL >= 10 && kmPrL <= 15){
            System.out.println("Grøn ejerafgift er =" + (prisklasse3 + udligningsAfgift()));
        } else if (kmPrL >= 5 && kmPrL <= 10){
            System.out.println("Grøn ejerafgift er = " + (prisKlasse4 + udligningsAfgift()));
        } else if (kmPrL < 5){
            System.out.println("Grøn ejerafgift er = " + (prisKlasse5 + udligningsAfgift()));
        }
        return kmPrL;
    }

    public String toString(){
        return "Registreringsnummer = " + regNr + "\nMærke = " + mærke + "\nModel = " + model + "\nÅrgang = " + årgang + "\nAntal døre = " + antalDøre + "\nHar partikelfilter? = " + harPartikelfilter() + "\nkmPrL = " + kmPrL;
    }
}
