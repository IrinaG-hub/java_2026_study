import java.math.BigDecimal;

public class Finance {
    public static void main(String[] args) {
        double doubleSum = 0.1 + 0.2;
        double doubleDiff = 10 - 9 - 0.9;

        System.out.println("\n===Расчет double===" + "\n0.1 + 0.2 = " + doubleSum + "\n10 - 9 - 0.9 = " + doubleDiff);

        BigDecimal bigDecimalSum = new BigDecimal("0.1").add(new BigDecimal("0.2"));
        BigDecimal bigDecimalDiff = new BigDecimal("10")
                .subtract(new BigDecimal("9.0"))
                .subtract(new BigDecimal("0.9"));

        System.out.println("\n====Расчет BigDecimal==" + "\n0.1 + 0.2 =" + bigDecimalSum + "\n10 - 9 - 0.9 = " + bigDecimalDiff);

        System.out.println("\n===Разница===" + "\n 0.1 + 0.2:" + "\ndouble = " + doubleSum +
                "\nBigDecimal = " + bigDecimalSum + "\n10 - 9 - 0.9: " + "\ndouble = " + doubleDiff +
                "\nBigDecimal = " + bigDecimalDiff);
    }
}
