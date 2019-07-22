package me.dominik.main;

import java.util.ArrayList;

public class SportsCar {
    boolean isOption;
    ArrayList<CarMarke> contains = new ArrayList<>();
    Double average;

    public boolean isOption() {
        return isOption;
    }

    public void setOption(boolean option) {
        isOption = option;
    }

    public ArrayList<CarMarke> getContains() {
        return contains;
    }

    public void setContains(ArrayList<CarMarke> contains) {
        this.contains = contains;
    }

    public Double getAverage() {
        return average;
    }

    public void setAverage(Double average) {
        this.average = average;
    }

    public SportsCar() {
        contains.add(new CarMarke("Citroen", 145));
        contains.add(new CarMarke("Chevrolet", 150));
        contains.add(new CarMarke("Seat", 152));
        contains.add(new CarMarke("Audi", 179));
        contains.add(new CarMarke("Alfa Romeo", 184));
        contains.add(new CarMarke("Mercedes", 186));
        contains.add(new CarMarke("BMW", 192));
        contains.add(new CarMarke("Saab", 193));
        contains.add(new CarMarke("Jaguar", 208));
        contains.add(new CarMarke("Porsche", 297));
        double i= 0;
        for(CarMarke carMarke : contains){
            i += carMarke.co2ProKm;
        }
        average = i/contains.size();

    }

}
