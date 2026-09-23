public class Overflow {
    public static void main(String[] args) {
        int maxInt = Integer.MAX_VALUE;
        int overflowInt = maxInt + 1;
        int secondsIn100YearsInt = 100 * 365 * 24 * 60 * 60;
        long secondsIn100YearsLong = 100L * 365 * 24 * 60 * 60;
        System.out.println("\nМаксимальное значение int: " + maxInt + "\nMaxInt+1= " + overflowInt
                + "\nСекунд в 100 годах (int)= " + secondsIn100YearsInt + "\nСекунд в 100 годах (long)= "
                + secondsIn100YearsLong);

    }
}
