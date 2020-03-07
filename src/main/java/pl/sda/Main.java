package pl.sda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Kalkulator pól i obwodu kwadratu, prostokątu, rąbu, trójkątu i koła
        1. Przetestuj jak w tej chwili działa kod
        2. Dodaj możliwość wyliczania pola trójkąta:
            - stwórz klasę Triangle z polami:
               - width i height
               - konstruktor powinien pozwalać na ustawienie tych pól
            - klasa Triangle powinna implementować interfejs AbleToCalculateArea
            - zaimplementuj brakującą metodę w klasie Triangle (powinna liczyć pole trójkąta)
            - w metodzie main dopisz odpowiedniego ifa i w nim poproś użytkownika o podanie wysokości i boku trójkąta
        3. Analogicznie do tego jak wyliczane jest pole trojkata chcielibysmy teraz wyliczyć jego obwód:
           - utworz interfejs AbleToCalculatePermimeter z metoda:
               double calculatePerimeter();
           - utworz interfejs Figure, ktory bedzie implementowal AbleToCalculatePerimeter i AbleToCalculateArea
           - wszystkie klasy figur zamiast implementowac AbleToCalculateArea od teraz powinny implementowac Figure
           - co za tym idzie wszystkie powinny implementowac nowa metode - calculatePerimeter - wyliczający obwód
           - w klasie main zmienna figure powinna byc juz nie typu AbleToCalculateArea, a typu Figure
           - zauwaz, ze nie musisz wprowadzac zadnych zmian w ifach
           - na koncu aplikacji tak samo jak teraz wyliczasz pole wylicz obwod i wypisz (za pomoca metody calculatePerimeter)
        * Czy zawsze pole jest wyliczone dokładnie tak jak powinno być?
        ** Napisz klase implementujaca CharSequence, przyjmij String przez konstruktor, nastepnie wszystkie operacje, ktore udostepnia interfejs wykonuj na odwroconym Stringu.
           - Przetestuj dzialanie metody
           - Cwiczenie z https://docs.oracle.com/javase/tutorial/java/IandI/QandE/interfaces-answers.html
         */

        System.out.println("Wybierz figure, ktorej pole chcesz obliczyc:");

        Scanner scanner = new Scanner(System.in);
        String chosenFigure = scanner.nextLine();
        AbleToCalculateArea figure;

        if (chosenFigure.equals("prostokat")) {
            System.out.println("Podaj wysokosc");
            double h = scanner.nextDouble();
            System.out.println("Podaj szerokosc");
            double w = scanner.nextDouble();
            figure = new Rectangle(w, h);
        } else {
            System.out.println("Nie znam tej figury, koniec!");
            return;
        }
        System.out.println("Pole to: ");
        System.out.println(figure.calculateArea());
    }
}
