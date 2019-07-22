package me.dominik.main;

import java.util.ArrayList;

public class SUV {
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

    public SUV(){
        isOption = true;
        contains.add(new CarMarke("Volvo",192, (double) 4));
        contains.add(new CarMarke("Hyundai", 170, (double) 1));
        contains.add(new CarMarke("BMW",192, 2.5));
        contains.add(new CarMarke("Land Rover",253));
        contains.add(new CarMarke("Honda",166));
        contains.add(new CarMarke("Toyota",163, (double) 6));
        contains.add(new CarMarke("Volkswagen",161, 3.5));
        contains.add(new CarMarke("Opel", 157, (double) 3));
        contains.add(new CarMarke("Peugeot", 	154));
        contains.add(new CarMarke("Ford", 	153));
        contains.add(new CarMarke("Suzuki" ,	103));
        double i= 0;
        for(CarMarke carMarke : contains){
            i += carMarke.co2ProKm;
        }
        average = i/contains.size();
    }

}
