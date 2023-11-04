package main;
import Icecream.Icecream;
public class Main {
    public static void main(String[] args) {
        Icecream[] icecreams = new Icecream[3]; // Создание массива объектов класса Icecream
        icecreams[0] = new Icecream("Ванильный мишка", false, 5.3);
        icecreams[1] = new Icecream("Шоколадный заяц", true, 8.5);
        icecreams[2] = new Icecream("Клубничная бомба", false, 4.2);
        //icecreams[3] = new Icecream(icecreams[1]);
        //icecreams[4] = new Icecream();

        for (Icecream icecream : icecreams) {
            icecream.printInfo();
            System.out.println();
        }

        double averageFatPercentage = Icecream.calculateAverageFatPercentage(icecreams); // Вызов статического метода
        int chocolateIcecreamCount = Icecream.countChocolateIcecreams(icecreams); // Вызов статического метода

        System.out.println("Средний процент жирности захаваного мороженого: " + averageFatPercentage);
        System.out.println("Кол-во чоколатных мороженых: " + chocolateIcecreamCount);
    }
}