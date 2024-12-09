import java.util.Scanner;
import java.util.Stack;

public class ThirdLab {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number < 0) {
                System.out.println("Введите положительное число");
                return;
            }

            Stack<Integer> stack = new Stack<>();
            int temp = number;

            // Заносим цифры в стек
            while (temp > 0) {
                stack.push(temp % 10);
                temp /= 10;
            }

            // Создаем обратное число
            long reversedNumber = 0;
            long multiplier = 1;
            while (!stack.isEmpty()) {
                reversedNumber += stack.pop() * multiplier;
                multiplier *= 10;
            }

            System.out.println("Число с цифрами в обратном порядке: " + reversedNumber);

        } else {
            System.out.println("Некорректный ввод. Введите целое число.");
        }
        scanner.close();
    }
}

