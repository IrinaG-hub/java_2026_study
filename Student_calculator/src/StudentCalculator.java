// public class student_calculator {                          // public class StudentCalculator / Имя класса в стиле CamelCase
//    public static final double pi = 3.14;                   // public static final double PI = 3.14; / константы в верхнем регистре
//
//    public static double CalculateCircleArea(double R) {    // public static double calculateCircleArea(double radius) { / метод с маленькой буквы, имя параметра должно быть понятным
//        double S = pi * R * R;                              // переменная избыточна (сразу возвращается, больше не используется, н меняется)
//        boolean result = true;                              // переменная не используется
//        return S;                                           // return PI * radius * radius; / убрали лишнюю переменную
//    }
//
//    public static void main(String[] args) {
//        double MyRadius = 5;                                // double myRadius = 5; / имя переменной с маленькой буквы (camelCase)
//        System.out.println(CalculateCircleArea(MyRadius));  // System.out.println(calculateCircleArea(myRadius)); / вызов метода с маленькой буквы
//    }
//}
public class StudentCalculator {
    public static final double PI = 3.14;

    public static double calculateCircleArea(double radius) {
        return PI * radius * radius;
    }

    public static void main(String[] args) {
        double myRadius = 5;
        System.out.println(calculateCircleArea(myRadius));
    }
}