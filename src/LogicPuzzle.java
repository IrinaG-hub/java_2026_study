public class LogicPuzzle {
    public static void main(String[] args) {

        int x = 10, y = 20, z = 10;
        boolean r1 = x == z; // true (10 равно 10)
        boolean r2 = x != y;  // true (10 не равно 20)
        boolean r3 = x < y && y > z; // true (10<20 И 20>10)
        boolean r4 = x > y || x == z; // true (10>20 ЛОЖЬ ИЛИ 10==10 ИСТИНА)
        boolean r5 = !(x == y) && (y >= 20); // true (НЕ(10==20) И 20>=20)
        boolean r6 = x == 10 || 1 / 0 > 0; // true (короткое замыкание): из-за оператора || (ИЛИ)
// 10==10 ИСТИНА, поэтому Java не вычисляет правую часть,
// так как проверка одного условия уже удовлетворяет требование оператора

        System.out.println("\nr1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);
        System.out.println("r5 = " + r5);
        System.out.println("r6 = " + r6);
    }
}
