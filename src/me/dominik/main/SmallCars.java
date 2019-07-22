package me.dominik.main;

import java.util.ArrayList;

public class SmallCars {
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

    public SmallCars(){
        contains.add(new CarMarke("Suzuki" ,	103));
        contains.add(new CarMarke("Smart", 	116));
        contains.add(new CarMarke("Fiat", 	140));
        contains.add(new CarMarke("Citroen", 	145));
        contains.add(new CarMarke("Renault", 	149));
        contains.add(new CarMarke("Seat", 	152));
        contains.add(new CarMarke("Skoda", 	153));
        contains.add(new CarMarke("Ford", 	153));
        contains.add(new CarMarke("Mini", 	179));
        double i= 0;
        for(CarMarke carMarke : contains){
           i += carMarke.co2ProKm;
        }
        average = i/contains.size();
    }
}
