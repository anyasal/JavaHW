import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
public class Program05_09 {

    //1. Функция для нахождения максимума
    /*public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите первое число: ");
            int a = scanner.nextInt();
            System.out.print("Введите второе число: ");
            int b = scanner.nextInt();
            try {
                System.out.println("Максимальное число: " + getMax(a, b));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                scanner.close();
            }
        }
        public static int getMax(int a, int b) throws Exception {
            if (a == b) {
                throw new Exception("Числа равны! Невозможно определить максимальное значение.");
            }
            return (a > b) ? a : b;
        }*/
    //2. Калькулятор деления
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите делимое: ");
        double a = scanner.nextDouble();
        System.out.print("Введите делитель: ");
        double b = scanner.nextDouble();
        try {
            double result = divide(a, b);
            System.out.println("Результат деления: " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Ошибка: Деление на ноль недопустимо.");
        }
        return a / b;
    }*/
    //3. Конвертер строк в числа
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String a = scanner.nextLine();
        try {
            int result = convertStringToInt(a);
            System.out.println("Конвентированная строка: " + result);
        } catch ( NumberFormatException e) {
            System.out.println("Ошибкa\n"+ e.getMessage());
        }
    }
    public static int convertStringToInt ( String a){
        try {
            return Integer.parseInt(a);
        } catch ( NumberFormatException e) {
            throw new NumberFormatException("Невозможно конвертировать строку '" + a + "' в целое число.");
        }
    }*/
    //4. Проверка возраста
    /* public static void validateAge(int age) {
        if (age < 0  || age > 150) {
            throw new IllegalArgumentException("Возраст должен быть в диапазоне от 1 до 150.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваш возраст: ");
        try {
            int age = scanner.nextInt();
            validateAge(age);
            System.out.println("Возраст принят.");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ошибка ввода. Пожалуйста, введите целое число.");
        } finally {
            scanner.close();
        }
    }*/
    //5. Нахождение корня
    /*public static double calculateSquare(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Число не может быть отрицательным.");
        }
        return Math.sqrt(number);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для вычисления квадратного корня: ");
        try {
            double number = scanner.nextDouble();
            double result = calculateSquare(number);
            System.out.println("Квадратный корень из " + number + " равен " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ошибка ввода. Пожалуйста, введите число.");
        } finally {
            scanner.close();
        }
    }*/
    //6. Факториал
    /*public static long calculateFactorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Число не может быть отрицательным.");
        }
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите неотрицательное целое число для вычисления факториала: ");
        try {
            int number = scanner.nextInt();
            long result = calculateFactorial(number);
            System.out.println("Факториал числа " + number + " равен " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ошибка ввода. Пожалуйста, введите целое число.");
        } finally {
            scanner.close();
        }
    }*/
    //7. Проверка массива на нули
    /*public static void checkForZeros(int[] array) {
        for (int num : array) {
            if (num == 0) {
                throw new IllegalArgumentException("Массив содержит нули.");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();//ввод одного числа, которое сохраняется в соответствующем элементе массива.
        }
        try {
            checkForZeros(array);
            System.out.println("Массив не содержит нулей.");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ошибка ввода. Пожалуйста, введите целые числа.");
        } finally {
            scanner.close();
        }
    }*/
    //8. Калькулятор возведения в степень
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        double number = scanner.nextDouble();
        System.out.print("Введите степень: ");
        int exponent = scanner.nextInt();
        try {
            double result = power(number, exponent);
            System.out.println(number + " в степени " + exponent + " равно " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка\n"+e.getMessage());
        }
    }
    public static double power(double base, int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException("Степень не может быть отрицательной.");
        }
        double result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }*/
    //9. Обрезка строки
       /* public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите строку: ");
            String inputString = scanner.nextLine();
            System.out.print("Введите количество символов для обрезки: ");
            int length = scanner.nextInt();
            try {
                String resString = resString(inputString, length);
                System.out.println("Обрезанная строка: " + resString);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        public static String resString(String str, int length) {
            if (length > str.length()) {
                throw new IllegalArgumentException("Количество символов не может превышать длину строки.");
            }
            return str.substring(0,length);
        }*/
    //10. Поиск элемента в массиве
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Введите элемент для поиска: ");
        int elementToFind = scanner.nextInt();
        try {
            int index = findElement(array, elementToFind);
            System.out.println("Элемент найден на индексе: " + index);
        } catch (ElementNotFoundException e) {
            System.out.println("ElementNotFoundException\n"+e.getMessage());
        }
        scanner.close();
    }
    public static int findElement(int[] array, int element) throws ElementNotFoundException {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        throw new ElementNotFoundException("Элемент " + element + " не найден в массиве.");
    }
}
class ElementNotFoundException extends Exception {
    public ElementNotFoundException(String message) {
        super(message);
    }*/
    //11. Конвертация в двоичную систему
    /*public static String convertToBinary(int number) throws IllegalArgumentException {
        if (number < 0) {
            throw new IllegalArgumentException("Отрицательные числа не поддерживаются.");
        }
        return Integer.toBinaryString(number);//Bстроенный метод Java
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        try {
            String binaryString = convertToBinary(number);
            System.out.println("Двоичное представление: " + binaryString);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка:IllegalArgumentException\n " + e.getMessage());
        } finally {
            scanner.close();
        }
    }*/
    //12. Проверка делимости
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int secondNumber = scanner.nextInt();
        if (secondNumber == 0){
            throw new ArithmeticException("Ошибка: Деление на ноль невозможно.");
        }
        if ( firstNumber % secondNumber !=0) {
            System.out.println( firstNumber + " не делится на " + secondNumber );
        }
        else {
            System.out.println(firstNumber + " делится на " + secondNumber);
        }
    }*/
    //13. Чтение элемента списка
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите элементы списка (введите 'end' для завершения):");
        List<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            list.add(input);
        }
        System.out.println("Введите индекс:");
        int index = scanner.nextInt();
        try {
            String element = getElementByIndex(list, index);
            System.out.println("Элемент по индексу " + index + ": " + element);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
    public static String getElementByIndex(List<String> list, int index) {
        if (index < 0 || index >= list.size()) {
            throw new IndexOutOfBoundsException("Индекс " + index + " выходит за пределы списка размером " + list.size());
        }
        return list.get(index);
    }*/
    //14. Парольная проверка
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пароль:");
        String password = scanner.nextLine();
        try {
            checkPasswordStrength(password);
            System.out.println("Пароль соответствует требованиям.");
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
    public static void checkPasswordStrength(String password) throws Exception {
        if (password.length() < 8) {
            throw new Exception("Пароль слишком короткий. Минимальная длина пароля - 8 символов.");
        }
    }*/
    //15. Проверка даты
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату в формате dd.MM.yyyy:");
        String dateString = scanner.nextLine();
        try {
            checkDateValidity(dateString);
            System.out.println("Дата введена корректно.");
        } catch (DateTimeParseException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
    public static void checkDateValidity(String dateString) throws DateTimeParseException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate.parse(dateString, formatter);
    }*/
    //16. Конкатенация строк
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку:");
        String firstString = scanner.nextLine();
        System.out.println("Введите вторую строку:");
        String secondString = scanner.nextLine();
        try {
            String result = concatenateStrings(firstString, secondString);
            System.out.println("Результат объединения: " + result);
        } catch (NullPointerException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
    public static String concatenateStrings(String firstString, String secondString) throws NullPointerException {
        if (firstString == null || firstString.isEmpty() || secondString == null || secondString.isEmpty()) {
            throw new NullPointerException("Одна из строк равна null или пустая.");
        }
        return firstString + secondString;
    }*/
    //17. Остаток от деления
   /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int firstNumber = scanner.nextInt();
        System.out.println("Введите второе число:");
        int secondNumber = scanner.nextInt();
        try {
            int result = getRemainder(firstNumber, secondNumber);
            System.out.println("Остаток от деления: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
    public static int getRemainder(int firstNumber, int secondNumber) throws ArithmeticException {
        if (secondNumber == 0) {
            throw new ArithmeticException("Деление на ноль невозможно.");
        }
        return firstNumber % secondNumber;
    }*/
    //18. Квадратный корень
   /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        double number = scanner.nextDouble();
        try {
            double result = getSquareRoot(number);
            System.out.println("Квадратный корень: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
    public static double getSquareRoot(double number) throws IllegalArgumentException {
        if (number < 0) {
            throw new IllegalArgumentException("Невозможно извлечь квадратный корень из отрицательного числа.");
        }
        return Math.sqrt(number);
    }*/
    //19. Конвертер температуры
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру в градусах Цельсия:");
        double celsius = scanner.nextDouble();
        try {
            double fahrenheit = convertCelsiusToFahrenheit(celsius);
            System.out.println("Температура в градусах Фаренгейта: " + fahrenheit);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
    public static double convertCelsiusToFahrenheit(double celsius) throws IllegalArgumentException {
        if (celsius < -273.15) {
            throw new IllegalArgumentException("Температура ниже абсолютного нуля (-273.15°C).");
        }
        return celsius * 9 / 5 + 32;
    }*/
    //20. Проверка строки на пустоту
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String inputString = scanner.nextLine();
        try {
            checkString(inputString);
            System.out.println("Строка корректна.");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
    public static void checkString(String inputString) throws IllegalArgumentException {
        if (inputString == null || inputString.isEmpty()) {
            throw new IllegalArgumentException("Строка не может быть пустой или равна null.");
        }
    }*/
}




