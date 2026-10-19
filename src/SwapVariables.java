public class SwapVariables {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("\n===Вариант А (temp)===");
        System.out.println("До обмена: а = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("После обмена: а = " + a + ", b = " + b);

        a = 10;
        b = 20;

        System.out.println("\n===Вариант В (арифметика)===");
        System.out.println("До обмена: а = " + a + ", b = " + b);

        a = a + b; // 30
        b = a - b; // 30 - 20 = 10
        a = a - b; // 30 - 10 = 20

        System.out.println("После обмена: а = " + a + ", b = " + b);
    }
}
