package Icecream;
/**
 * Состав класса Icecream (мороженое): название, наличие шоколада, процент жирности. Подсчитать средний процент жирности и количество мороженых с шоколадом.
 */

public class Icecream {
    private String name;
    private boolean hasChocolate;
    private double fatPercentage;


    public Icecream() { // Конструктор по умолчанию
        name = "";
        hasChocolate = false;
        fatPercentage = 0.0;
    }

    public Icecream(Icecream otherIcecream) {    // Конструктор копирования
        this.name = otherIcecream.name;
        this.hasChocolate = otherIcecream.hasChocolate;
        this.fatPercentage = otherIcecream.fatPercentage;
    }

    public Icecream(String name, boolean hasChocolate, double fatPercentage) { // Конструктор со всеми параметрами
        this.name = name;
        this.hasChocolate = hasChocolate;
        this.fatPercentage = fatPercentage;
    }

    // Геттеры (методы для получения значений полей)
    public String getName() {
        return name;
    }

    public boolean hasChocolate() {
        return hasChocolate;
    }

    public double getFatPercentage() {
        return fatPercentage;
    }

    // Сеттеры (методы для установки значений полей)
    public void setName(String name) {
        this.name = name;
    }

    public void setHasChocolate(boolean hasChocolate) {
        this.hasChocolate = hasChocolate;
    }

    public void setFatPercentage(double fatPercentage) {
        this.fatPercentage = fatPercentage;
    }

    // Метод для вывода информации
    public void printInfo() {
        System.out.println("Мороженное: " + name);
        System.out.println("Наличие шоколада: " + hasChocolate);
        System.out.println("Процент жирности: " + fatPercentage);
    }

    // Статический метод для подсчета среднего процента жирности
    public static double calculateAverageFatPercentage(Icecream[] icecreams) { // В качестве параметра передаем массив мороженых (Icecream[])
        if (icecreams.length == 0) {
            return 0.0;
        }

        double sum = 0;
        for (Icecream icecream : icecreams) {
            sum += icecream.getFatPercentage();
        }

        return sum / icecreams.length; // Возвращаем среднее значение процента жирности
    }

    // Статический метод для подсчета количества мороженых с шоколадом
    public static int countChocolateIcecreams(Icecream[] icecreams) { //
        int count = 0;
        for (Icecream icecream : icecreams) { //цикл for each(Пербираем icecreams, обращаясь к каждому элементу как к icecream)
            if (icecream.hasChocolate()) {
                count++;
            }
        }
        return count;
    }
}



