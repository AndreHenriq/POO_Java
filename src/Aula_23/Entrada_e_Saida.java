package Aula_23;

public class Entrada_e_Saida {
    public static void main(String[] args) {
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 659.50;
        double measure = 53.234567;

        System.out.println("Products: ");
        System.out.printf("%s, which price is $%f%n%s, which price is $%f%n%n", product1, price1, product2, price2);

        System.out.printf("Record: %d years old, code %d and gender: %s%n%n", age, code, gender);

        System.out.println("Measure with eight decimal places: " + measure);


    }
}
