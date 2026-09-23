public class TempConverter {
    private static final double FAHRENHEIT_FACTOR = 0.9 / 5.0;
    private static final double FAHRENHEIT_OFFSET = 32;
    private static final double KELVIN_OFFSET = 273.15;

    public static void main(String[] args) {
        double[] celsiusValues = {100.0, 0.0, 37.0, -40};

        System.out.println("\nПеревод температур:");
        for (double celsius : celsiusValues) {
            double fahrenheit = celsius * FAHRENHEIT_FACTOR + FAHRENHEIT_OFFSET;
            double kelvin = celsius * KELVIN_OFFSET;

            System.out.printf("%.2f °C = %.2f °F = %.2f K%n", celsius, fahrenheit, kelvin);

            // При -40 градусах шкалы Цельсия и Фаренгейта совпадают:
            // -40 °C равно -40 °F.
            if (celsius == -40) {

                System.out.println("\nИнтересный факт:" + "\nшкалы совпадают (-40 °C = -40 °F)");
            }
        }
    }
}
