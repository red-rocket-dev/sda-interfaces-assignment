package pl.sda;

import java.math.BigDecimal;
import java.math.RoundingMode;
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
        2.5 Podobna operacje wykonaj dla kola i kwadratu (utworz klase i tak dalej)
        3. Analogicznie do tego jak wyliczane jest pole trojkata chcielibysmy teraz wyliczyć jego obwód:
           - utworz interfejs AbleToCalculatePermimeter z metoda:
               BigDecimal calculatePerimeter();
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
        Figure figure;

        if (chosenFigure.equals("prostokat")) {
            System.out.println("Podaj wysokosc");
            BigDecimal h = scanner.nextBigDecimal();
            System.out.println("Podaj szerokosc");
            BigDecimal w = scanner.nextBigDecimal();
            figure = new Rectangle(w, h);
        } else if(chosenFigure.equals("trojkat")) {
            System.out.println("Podaj wysokosc");
            BigDecimal h = scanner.nextBigDecimal();
            System.out.println("Podaj podstawe");
            BigDecimal cathetus1 = scanner.nextBigDecimal();
            System.out.println("Podaj 2 przyprostokatna");
            BigDecimal cathetus2 = scanner.nextBigDecimal();
            System.out.println("Podaj przeciwprostkatna");
            BigDecimal hypotenuse = scanner.nextBigDecimal();
            figure = new Triangle(cathetus1, cathetus2, hypotenuse, h);
        } else if(chosenFigure.equals("kolo")) {
            System.out.println("Podaj promien");
            BigDecimal r = scanner.nextBigDecimal();
            figure = new Circle(r);
        } else if(chosenFigure.equals("kwadrat")) {
            System.out.println("Podaj bok");
            BigDecimal w = scanner.nextBigDecimal();
            figure = new Square(w);
        } else {
            System.out.println("Nie znam tej figury, koniec!");
            return;
        }
        //zaokraglone do 2 miejsc po przecinku
        System.out.println("Pole to: ");
        System.out.println(figure.calculateArea().setScale(2, RoundingMode.UP));
        System.out.println("Obwod to: ");
        System.out.println(figure.calculatePerimeter().setScale(2, RoundingMode.UP));
    }
}
