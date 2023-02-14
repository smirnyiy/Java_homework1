

//Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)

import java.util.Scanner;


public class task_1 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n = getNumber("Введите N: ");
        double triangular_n = triangular(n);
        int result = (int) triangular_n;
        System.out.println("Треугольное число, при N = " + n + ", будет равно: " + result);
        System.out.println("Факториал числа n = " + getFactorial(n));
    }

    // Ввод числа
    public static int getNumber(String text) {
        System.out.print(text);
        return input.nextInt();
    }

    // Получение n-ого треугольного числа
    public static double triangular(int number) {
        double triang_n = 0.5 * number * (number + 1);
        return triang_n;
    }


    public static int getFactorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
           result = result * i;
        }
        return result;
    }
}


