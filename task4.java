import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CurrencyConverter {
    
    
    public static double getExchangeRate(String baseCurrency, String targetCurrency) {
        Map<String, Double> exchangeRates = new HashMap<>();
        exchangeRates.put("USD-EUR", 0.85);
        exchangeRates.put("EUR-USD", 1.18);
        exchangeRates.put("USD-INR", 74.50);
        exchangeRates.put("INR-USD", 0.013);
        exchangeRates.put("EUR-INR", 87.50);
        exchangeRates.put("INR-EUR", 0.011);
        
        String key = baseCurrency + "-" + targetCurrency;
        return exchangeRates.getOrDefault(key, 1.0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter the base currency (e.g., USD, EUR, INR): ");
        String baseCurrency = scanner.nextLine().toUpperCase();
        
      
        System.out.print("Enter the target currency (e.g., USD, EUR, INR): ");
        String targetCurrency = scanner.nextLine().toUpperCase();
        
       
        System.out.print("Enter the amount to convert: ");
        double amount = scanner.nextDouble();
        
     
        double exchangeRate = getExchangeRate(baseCurrency, targetCurrency);
        
  
        double convertedAmount = amount * exchangeRate;
        
       
        System.out.printf("Converted Amount: %.2f %s%n", convertedAmount, targetCurrency);
        
        scanner.close();
    }
}