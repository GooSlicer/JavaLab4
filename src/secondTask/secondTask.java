package secondTask;

import java.util.Arrays;

public class secondTask {
    public static void Action(){
        //Тест 1
        System.out.println("1. Тест startsWithSameLetter:");
        System.out.println("\tSarah Smith: " + RegularExpressions.startsWithSameLetter("Sarah Smith")); // true
        System.out.println("\tJohn Doe: " + RegularExpressions.startsWithSameLetter("John Doe"));     // false

        // Тест 2
        System.out.println("\n2. Тест reverseWords:");
        System.out.println("\tHello world: " + RegularExpressions.reverseWords("Hello world")); // "olleH dlrow"

        // Тест 3
        System.out.println("\n3. Тест toUpperCaseSnakeCase:");
        System.out.println("\tlowerCaseName: " + RegularExpressions.toUpperCaseSnakeCase("lowerCaseName")); // "LOWER_CASE_NAME"

        // Тест 4
        System.out.println("\n4. Тест toLowerCamelCase:");
        System.out.println("\tUPPER_CASE_NAME: " + RegularExpressions.toLowerCamelCase("UPPER_CASE_NAME")); // "upperCaseName"

        // Тест 5
        System.out.println("\n5. Тест findNamesStartingAndEndingWithA:");
        String[] names = RegularExpressions.findNamesStartingAndEndingWithA("Anna Alan Bob Alice Alisa");
        System.out.println("\tНайдены имена: " + String.join(", ", names)); // "Anna, Alan, Alisa"

        // Тест 6
        System.out.println("\n6. Тест findClosestMatchingPair:");
        String[] strings = {"456222", "124", "def", "", "ghi", "789"};
        String[] pair = RegularExpressions.findClosestMatchingPair(strings, "\\d+"); // Найти числа
        System.out.println("\tБлижайшая пара чисел: " + Arrays.toString(pair)); // ["123", "456"]
    }
}
