package me.dominik.main;

import java.util.HashMap;
import java.util.Set;

public class CarMarke {
   String name;
   Integer co2ProKm;
   Double rating;
   Double totalRating;

   public CarMarke(String name, Integer co2ProKm, Double rating){
       this.name = name;
       this.co2ProKm = co2ProKm;
       this.rating = rating/10*297;
       totalRating = (rating + co2ProKm)/297*2;
   }
   public CarMarke(String name, Integer co2ProKm){
       this.name = name;
       this.co2ProKm = co2ProKm;
       this.rating = (double) (5/297*10);
       totalRating = (rating + co2ProKm)/297*2 * 100;
   }
}
