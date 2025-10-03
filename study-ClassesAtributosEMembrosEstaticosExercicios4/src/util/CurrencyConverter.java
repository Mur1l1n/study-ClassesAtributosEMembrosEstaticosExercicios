package util;

public class CurrencyConverter {
    public static final Double IOF = 0.06;

    public static double dolarReal(double dolarPrice, Double amount){
        return amount * dolarPrice * (1.0 + IOF);
    }
}
