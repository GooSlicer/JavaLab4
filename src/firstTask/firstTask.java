package firstTask;

import java.util.Scanner;

public class firstTask {
    public static void Action(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите десятичное число: ");
        int decimal = scanner.nextInt();
        System.out.println(StringsParse.decimalToBinary(decimal));

        System.out.print("Введите цвет: ");
        String hexColor = scanner.next();
        System.out.println(StringsParse.hexToRgb(hexColor));

        System.out.print("Введите строку: ");
        String string = scanner.next();
        System.out.println(StringsParse.swapCase(string));

        System.out.print("Введите число, которое надо округлить: ");
        double floatNumber = scanner.nextDouble();
        System.out.print("Введите количество символов после запятой: ");
        int digitsCount = scanner.nextInt();
        System.out.println(StringsParse.roundToXDecimals(floatNumber, digitsCount));

        int stringsSize = 3;
        String[] strings = new String[stringsSize];
        for (int i = 0; i < stringsSize; i++) {
            System.out.print("Введите строку: ");
            strings[i] = scanner.next();
        }
        System.out.println(StringsParse.joinWithSemicolon(strings[0], strings[1], strings[2]));

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.print("Введите массив из " + size + " чисел: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Введите количество порций: ");
        int chunks = scanner.nextInt();
        StringsParse.printArrayInChunks(array, chunks);
    }
}
