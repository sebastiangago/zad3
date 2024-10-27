import java.math.BigDecimal;
import java.math.RoundingMode;

public class zad5 {
        public static void main(String[] args) {
            // Net price of the product
            BigDecimal netPrice = new BigDecimal("9.99");
            // VAT rate
            BigDecimal vatRate = new BigDecimal("0.23"); // 23%

            // Calculating gross price
            BigDecimal vatAmount = netPrice.multiply(vatRate).setScale(2, RoundingMode.HALF_UP);
            BigDecimal grossPrice = netPrice.add(vatAmount).setScale(2, RoundingMode.HALF_UP);

            // Printing net and gross values
            System.out.println("Koszt netto: " + netPrice);
            System.out.println("Kwota VAT: " + vatAmount);
            System.out.println("Koszt brutto: " + grossPrice);

            // Selling 10,000 units
            BigDecimal unitsSold = new BigDecimal("10000");
            BigDecimal totalGross = grossPrice.multiply(unitsSold).setScale(2, RoundingMode.HALF_UP);
            BigDecimal totalNet = netPrice.multiply(unitsSold).setScale(2, RoundingMode.HALF_UP);

            // Printing total sales
            System.out.println("Suma brutto dla 10,000 sztuk: " + totalGross);
            System.out.println("Suma netto dla 10,000 sztuk: " + totalNet);
        }
    }
