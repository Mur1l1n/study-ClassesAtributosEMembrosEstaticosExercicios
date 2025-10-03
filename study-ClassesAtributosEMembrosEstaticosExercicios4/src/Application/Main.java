package Application;

import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("What is the dollar price?  ");
        double dolarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double amount = sc.nextDouble();
        double result = CurrencyConverter.dolarReal(dolarPrice, amount);

        System.out.printf("Amount to be paid in reais = %.2f\n", result);

        sc.close();
    }
}
