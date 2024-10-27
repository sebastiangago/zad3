import java.math.BigDecimal;
import java.math.RoundingMode;

public class zadanie5 {
    public static void main(String[] args) {

        // Koszt netto produktu
        BigDecimal kosztNetto = new BigDecimal("9.99");
        // Stawka VAT
        BigDecimal vatStawka = new BigDecimal("0.23"); // 23%

        // Obliczanie wartości brutto
        BigDecimal vatKwota = kosztNetto.multiply(vatStawka).setScale(2, RoundingMode.HALF_UP);
        BigDecimal kosztBrutto = kosztNetto.add(vatKwota).setScale(2, RoundingMode.HALF_UP);

        // Wypisanie wartości netto i brutto
        System.out.println("Koszt netto: " + kosztNetto);
        System.out.println("Kwota VAT: " + vatKwota);
        System.out.println("Koszt brutto: " + kosztBrutto);

        // Sprzedaż 10000 sztuk
        BigDecimal iloscSprzedana = new BigDecimal("10000");
        BigDecimal sumaBrutto = kosztBrutto.multiply(iloscSprzedana).setScale(2, RoundingMode.HALF_UP);
        BigDecimal sumaNetto = kosztNetto.multiply(iloscSprzedana).setScale(2, RoundingMode.HALF_UP);

        // Wypisanie sumy sprzedaży
        System.out.println("Suma brutto dla 10,000 sztuk: " + sumaBrutto);
        System.out.println("Suma netto dla 10,000 sztuk: " + sumaNetto);
    }
}
