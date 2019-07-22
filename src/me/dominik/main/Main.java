package me.dominik.main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;


public class Main {
    ArrayList<CarMarke> carList= new ArrayList<>();

    public static void main(String args[]){
        Main main = new Main();
        System.out.println(5/2970.0000000000000000000000000000000000000000000000000000000001);
        main.start();
    }
    public void start(){
        JFrame frame = new JFrame("Eco stuff");
        JPanel panel = new JPanel();




        SportsCar sportsCar = new SportsCar();
        SmallCars smallCars = new SmallCars();
        SUV suv = new SUV();
        JTextField textFieldSuv = new JTextField("SUVs average Co2: " + Math.round(suv.getAverage()));
        JTextField textFieldSportsCar = new JTextField("Sport Cars average Co2: " + Math.round(sportsCar.getAverage()));
        JTextField textFieldSmallCar = new JTextField("Small cars average Co2: " + Math.round(smallCars.getAverage()));
        textFieldSuv.setEditable(false);
        textFieldSuv.setBorder(null);
        textFieldSuv.setPreferredSize(new Dimension(500,100));
        textFieldSuv.setFont( new Font("font", 0,48/2));
        textFieldSmallCar.setEditable(false);
        textFieldSmallCar.setBorder(null);
        textFieldSmallCar.setPreferredSize(new Dimension(500,100));
        textFieldSmallCar.setFont( new Font("font", 0,48/2));
        textFieldSportsCar.setBorder(null);
        textFieldSportsCar.setEditable(false);
        textFieldSportsCar.setPreferredSize(new Dimension(500,100));
        textFieldSportsCar.setFont( new Font("font", 0,24));
        for(CarMarke car : suv.getContains()){
            JTextField jTextField = new JTextField("Rating of " + car.name + " is " + car.totalRating);
            jTextField.setEditable(false);
            jTextField.setBorder(null);
            panel.add(jTextField);
        }
        panel.add(textFieldSmallCar,Component.TOP_ALIGNMENT);
        panel.add(textFieldSuv,Component.TOP_ALIGNMENT);
        panel.add(textFieldSportsCar,Component.TOP_ALIGNMENT);


        frame.add(panel);
        frame.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        frame.setVisible(true);

    }

}
