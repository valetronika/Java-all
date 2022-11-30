package HW;

import java.util.Scanner;

public class HW28nov {
    //С консоли вводится трехзначное число. Найдите в нем первую, вторую и третью цифры.
    // Используйте при этом / и (или) %
    public static void main(String[] args) {

        int a = getNumberFromConsole();
        int first = findFirstNumber(a);
        int second = findSecondNumber(a);
        int third = findThirdNumber(a);
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }

    public static int findFirstNumber(int a) {
        return a / 100;
    }

    public static int findSecondNumber(int a) {
        return a / 10 % 10;
    }

    public static int findThirdNumber(int a) {
        return a % 10;
    }

    public static void text() {
        System.out.println("Введите число : ");
    }

    public static int getNumberFromConsole() {
        Scanner scanner = new Scanner(System.in);
        text();
        int number = scanner.nextInt();
        return number;
    }
}
