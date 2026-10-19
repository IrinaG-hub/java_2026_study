public class Calculator {
    public static void main(String[] args) {
        int a = 17, b = 5;

        System.out.printf("\na = %d, b = %d%n", a, b);
        System.out.println("---------------------------------");

        print("Сложение:", a, b, a + b);
        print("Вычитание:", a, b, a - b);
        print("Умножение:", a, b, a * b);
        print("Целое деление:", a, b, a / b);
        print("Остаток:", a, b, a % b);
        printDouble("Вещественное:", a, b, (double) a / b);

        System.out.println("---------------------------------");
    }

    private static void print(String label, int a, int b, int result) {
        System.out.printf("%-17s%d / %d = %d%n", label, a, b, result);
    }

    private static void printDouble(String label, int a, int b, double result) {
        System.out.printf("%-17s%d / %d = %.1f%n", label, a, b, result);
    }
}
