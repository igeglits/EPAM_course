import java.util.Scanner;

class FindMaxInSeq {
    public static int max() {
        // Создаем объект Scanner для считывания ввода
        Scanner scanner = new Scanner(System.in);
        // Создаем переменную для хранения максимального значения
        int max = Integer.MIN_VALUE;
        // Создаем переменную для хранения текущего значения
        int current;
        // Считываем значения, пока не встретим 0
        do {
            // Считываем следующее значение
            current = scanner.nextInt();
            // Если оно больше максимального, обновляем максимальное
            if (current > max) {
                max = current;
            }
        } while (current != 0);
        // Закрываем сканер
        scanner.close();
        // Возвращаем максимальное значение
        return max;
    }

    // Главный метод, который вызывает метод max и выводит результат
    public static void main(String[] args) {

        // Вызываем метод max и сохраняем результат в переменную
        int result = max();
        // Выводим результат на экран
        System.out.println(result);
    }
}

