package ht8_2;

public class Main {
    public static void main(String[] args) {
        BaseConverter baseConverter = new BaseConverter();
        baseConverter.convert(30, BaseConverter.Scale.FAHRENHEIT);
        baseConverter.convert(56, BaseConverter.Scale.KELVIN);
        baseConverter.convert(12, BaseConverter.Scale.CELSIUS);
    }
}
