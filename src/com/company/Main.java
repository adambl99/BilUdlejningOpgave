package com.company;

public class Main {

    public static void main(String[] args) {
    //Benzinbil benzinbil = new Benzinbil(4017, "Toyota", "Corolla", 2000, 5, 10, 4);
    //Elbil elbil = new Elbil(1010, "Tesla", "Cruiser", 2015, 4, 1005, 15, 750);
    //DieselBil dieselbil = new DieselBil(1312, "Audi", "A4", 2007, 5, "nej", 21);
      Garage garage = new Garage();
        Bil bil = new Bil(2020, "Nissan", "GTR", 2019, 5) {
        @Override
        public int beregnGrønEjerafgift() {
            return 0;
        }
    };
        //System.out.println(benzinbil);
        //benzinbil.beregnGrønEjerafgift();

        //System.out.println(elbil);
        //elbil.beregnGrønEjerafgift();

        //System.out.println(dieselbil);
        //dieselbil.beregnGrønEjerafgift();
        garage.toString();



    }}
