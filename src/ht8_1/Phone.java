package ht8_1;

import java.util.Arrays;

public class Phone {

    private String number;
    private String model;
    private double weight;

    public Phone(String number,String model, double weight){
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public Phone (String number,String model){
        this.number = number;
        this.model = model;
    }

    public Phone(){}


    public void receiveCall (String name){
        System.out.println("Звонит {"+ name +"}" + getNumber());
    }

    public void receiveCall(String name,String number)
    {
        System.out.println("Звонит " + name + "\n" +"Телефон " + number);
    }

    public void sendMessage (String[]...numbers){
        for (int i = 0; i < numbers.length; i++) {

            System.out.println(Arrays.toString(numbers[i]));
        }
        for (String[] number : numbers){

            System.out.println("Номера телефонов " + Arrays.toString(number));
        }
    }

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }
}
