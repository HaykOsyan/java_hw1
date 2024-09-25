// Задание 1. Нахождение факториала числа
// Напишите метод factorial, который принимает число n и возвращает его
// факториал. Если число n < 0, метод должен вернуть -1.

package homework1;

/**
 * homework1
 */
public class homework1 {

    public static void main(String[] args) {
        System.err.println(factorial(5));
    }

    public static int factorial(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}