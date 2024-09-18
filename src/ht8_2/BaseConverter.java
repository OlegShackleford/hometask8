package ht8_2;

public class BaseConverter {
    public void convert(double temp,Scale type){
        if (type.equals(Scale.KELVIN))
        {
            double kelvin = temp + 273.15;
            System.out.println("Температура: " + kelvin+"K");

        } else if (type.equals(Scale.FAHRENHEIT))
        {
            double fahrenheit = temp * 1.8 + 32;
            System.out.println("Температура: " + fahrenheit+"F");
        } else if(type.equals(Scale.CELSIUS)){
            System.out.println("Температура: " + temp+"C");
        }
    }

    public enum Scale {
        KELVIN,FAHRENHEIT,CELSIUS
    }

}
