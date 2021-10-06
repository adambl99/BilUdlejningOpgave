package com.company;

import java.util.ArrayList;

public class Garage {
    ArrayList<Bil> garage = new ArrayList<>();
    public Garage() {

        garage.add(new Benzinbil(1017, "Toyota", "Corolla", 1997, 5, 10, 13));

        garage.add(new Elbil(2620, "Tesla", "Cruiser", 2015, 5, 1005, 15, 750));

        garage.add(new DieselBil(2000, "Audi", "A4", 2008, 5, "ja", 22));

        garage.add(new DieselBil(1121, "BMW", "X6", 2016, 5, "nej", 17));

        String list = garage.toString();
        System.out.println("Garage: " + list);

    }

    public void setGarage(ArrayList<Bil> garage) {
        this.garage = garage;
    }

    public ArrayList<Bil> getGarage() {
        return garage;
    }


}








