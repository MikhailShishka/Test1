import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Exchange_Rate {
    public static void main(String[] args) {

        ExchangeRates[] exchangeRates = new ExchangeRates[]{
                new ExchangeRates("Dollar",0.010),
                new ExchangeRates("Tenge",5.02),
                new ExchangeRates("Yen",1.57),
                new ExchangeRates("Rupee",161.36),
                new ExchangeRates("Dirham",0.038)
        };

        Scanner in = new Scanner(System.in);
        double rubles;

        System.out.print("Rubles: ");
        rubles = in.nextDouble();

        for(ExchangeRates ER: exchangeRates){
            System.out.print(ER.getExchange()+": ");
            System.out.print(rubles*ER.getRate()+"\n");
        }

    }
}

class ExchangeRates{
    private String exchange;
    private double rate;
    ExchangeRates(String name, double factor){
        exchange = name;
        rate = factor;
    }

    public String getExchange() {
        return exchange;
    }

    public double getRate() {
        return rate;
    }
}
