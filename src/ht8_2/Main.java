package ht8_2;

public class Main {
    public static void main(String[] args) {
        BaseConverter baseConverter = new BaseConverter();
        baseConverter.convert(30, BaseConverter.Scale.FAHRENHEIT_TO_CELSIUS);
        baseConverter.convert(56, BaseConverter.Scale.KELVIN_TO_FAHRENHEIT);
        baseConverter.convert(12, BaseConverter.Scale.CELSIUS_TO_FAHRENHEIT);
    }
}
