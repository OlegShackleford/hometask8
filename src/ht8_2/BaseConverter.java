package ht8_2;

public class BaseConverter {
    public void convert(double temp, Scale type) {
        switch (type) {
            case CELSIUS_TO_KELVIN:
                double ctk = temp + 273.15;
                System.out.println("Температура: " + ctk + "K");
                break;
            case CELSIUS_TO_FAHRENHEIT:
                double ctf = temp * 1.8 + 32;
                System.out.println("Температура: " + ctf + "F");
                break;
            case KELVIN_TO_FAHRENHEIT:
                double ktf = (temp - 273.15) * 1.8 + 32;
                System.out.println("Температура: " + ktf + "F");
                break;
            case KELVIN_TO_CELSIUS:
                double ktc = temp - 273.15;
                System.out.println("Температура: " + ktc + "C");
                break;
            case FAHRENHEIT_TO_CELSIUS:
                double ftc = (temp - 32) / 1.8;
                System.out.println("Температура: " + ftc + "C");
                break;
            case FAHRENHEIT_TO_KELVIN:
                double ftk = (temp - 32) / 1.8 + 273.15;
                System.out.println("Температура: " + ftk + "K");
                break;
            default:
                System.out.println("Oops");
        }


    }

    public enum Scale {
        CELSIUS_TO_KELVIN,
        CELSIUS_TO_FAHRENHEIT,
        FAHRENHEIT_TO_KELVIN,
        FAHRENHEIT_TO_CELSIUS,
        KELVIN_TO_CELSIUS,
        KELVIN_TO_FAHRENHEIT
    }

}