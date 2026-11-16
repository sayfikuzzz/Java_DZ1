import java.util.Scanner; // Scanner нужен, чтобы читать данные, введённые с клавиатуры.

/*
 * Практическая работа № 1. Задание 2, вариант 10.
 *
 * Формула из задания:
 *     y = x * sqrt(x) + x^5 + exp(x)
 *
 * sqrt(x) — квадратный корень из x;
 * x^5    — x в пятой степени;
 * exp(x) — число e в степени x (экспонента).
 *
 * В Java математические функции находятся в классе Math:
 *     Math.sqrt(x), Math.pow(x, 5), Math.exp(x).
 */
public class Task2 {

    // Точка входа: Java начинает выполнение программы с этого метода.
    public static void main(String[] args) {

        // Создаём объект Scanner, который будет читать ввод с клавиатуры (System.in).
        Scanner scanner = new Scanner(System.in);

        // Приглашение пользователю. print (без ln) не переводит строку,
        // поэтому ввод будет происходить на этой же строке.
        System.out.print("Введите значение x: ");

        // Читаем с клавиатуры дробное число и сохраняем его в переменную x.
        double x = scanner.nextDouble();

        // Считаем значение функции по формуле из варианта 10:
        //   x * Math.sqrt(x)  — это x умножить на корень из x;
        //   Math.pow(x, 5)    — x в пятой степени;
        //   Math.exp(x)       — e в степени x.
        double y = x * Math.sqrt(x) + Math.pow(x, 5) + Math.exp(x);

        // Выводим результат на экран.
        System.out.println("y = " + y);

        // Закрываем Scanner, потому что он больше не нужен.
        scanner.close();
    }
}
