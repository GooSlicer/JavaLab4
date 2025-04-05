package firstTask;

public class StringsParse {
    public static String decimalToBinary(int decimalNumber) {
        return Integer.toBinaryString(decimalNumber);
    }

    public static String hexToRgb(String hexColor) {
        if (hexColor == null || !hexColor.matches("^#[0-9A-Fa-f]{6}$")) {
            return null;
        }
        int r = Integer.parseInt(hexColor.substring(1, 3), 16);
        int g = Integer.parseInt(hexColor.substring(3, 5), 16);
        int b = Integer.parseInt(hexColor.substring(5, 7), 16);
        return String.format("rgb(%d, %d, %d)", r, g, b);
    }

    public static String swapCase(String string) {
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isUpperCase(c)) {
                chars[i] = Character.toLowerCase(c);
            } else {
                chars[i] = Character.toUpperCase(c);
            }
        }
        return new String(chars);
    }

    public static String roundToXDecimals(double floatNumber, int digitsCount) {
        return String.format("%." + digitsCount + "f", floatNumber);
    }

    public static String joinWithSemicolon(String... args) {
        return String.join(";", args);
    }

    public static void printArrayInChunks(int[] array, int chunks) {
        for (int i = 0; i < array.length; i += chunks ) {
            int end = Math.min(i + chunks, array.length);
            for (int j = i; j < end; j++) {
                System.out.print(array[j]);
                if (j < end - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}
