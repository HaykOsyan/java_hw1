// Задание 1. Нахождение факториала числа
// Напишите метод factorial, который принимает число n и возвращает его
// факториал. Если число n < 0, метод должен вернуть -1.

package homework1;

/**
 * homework1
 */
// public class homework1 {

// public static void main(String[] args) {
// System.err.println(factorial(5));
// }

// public static int factorial(int n) {
// if (n < 0) {
// return -1;
// } else if (n == 0) {
// return 1;
// } else {
// return n * factorial(n - 1);
// }
// }
// }

// Задача 2. Вывод всех четных чисел от 1 до 100
// Напишите метод printEvenNums, который выведет на экран все четные числа
// в промежутке от 1 до 100, каждое на новой строке.

// public class homework1 {

// public static void main(String[] args) {
// printEvenNums(100);
// }

// public static void printEvenNums(int n) {
// for (int i = 0; i < n; i++) {
// if (i % 2 == 0) {
// System.err.println(i);
// }
// }
// }
// }

// Задача 3. Подсчет суммы цифр числа
// Напишите метод sumDigits, который принимает целое число n и возвращает
// сумму его цифр.

public class homework1 {
    public static void main(String[] args) {
        System.err.println(sumDigits(156));;
    }
    public static int sumDigits(int n) {
        int sum = 0;
        String num = Integer.toString(n);
        char[] charArray = num.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            sum += Character.getNumericValue(charArray[i]);
        }
        return sum;
    }
}
