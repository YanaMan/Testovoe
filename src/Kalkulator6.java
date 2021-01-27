public class Kalkulator6 {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = num1++;
        int num3 = num2;

        int result = num1 % num2;

        System.out.println("Результат: " + num3);
    }
}
