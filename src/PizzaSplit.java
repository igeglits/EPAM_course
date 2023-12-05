import java.util.Scanner;


class PizzaSplit {

    // Метод, который вычисляет минимальное количество пицц, которое нужно заказать
    public static int minPizzas(int people, int slices) {
        // Создаем константу для количества кусочков в одной пицце

        // Вычисляем общее количество кусочков, которое нужно для всех людей

        // Вычисляем минимальное количество пицц, которое нужно заказать
        int minPizzas = 0;
        int ostatok;

        do {
            ++minPizzas;
            ostatok = (minPizzas * slices) % people;
        }
        while (ostatok != 0);
        // Возвращаем результат
        return minPizzas;
    }

    // Главный метод, который считывает ввод и выводит результат
    public static void main(String[] args) {
        // Создаем объект Scanner для считывания ввода
        Scanner scanner = new Scanner(System.in);
        // Считываем количество людей

        int people = scanner.nextInt();
        // Считываем количество кусочков в одной пицце

        int slices = scanner.nextInt();
        // Закрываем сканер
        scanner.close();
        // Вызываем метод minPizzas и сохраняем результат в переменную
        int result = minPizzas(people, slices);
        // Выводим результат на экран
        System.out.println(result);
    }
}

