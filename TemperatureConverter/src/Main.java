//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double tempC = 150.0;
        double tempF = TemperatureConverter.celsiusToFahrenheit(tempC);
        System.out.println(tempC + "°C = " + tempF + "°F");
        System.out.println("Выше точки кипения? " + TemperatureConverter.isAboveBoiling(tempC));

        double tempF2 = 200;
        double tempC2 = TemperatureConverter.fahrenheitToCelsius(tempF2);
        System.out.println(tempF2 + "°F = " + tempC2 + "°C");
        System.out.println("Выше точки кипения? " + TemperatureConverter.isAboveBoiling(tempC2));

    }
}
