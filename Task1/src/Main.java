import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Wine bordo = new Wine("Rene Collard",
                "Вале-де-ля-Марн", "Франция",
                LocalDate.of(1975,1,20), "игристое сухое белое вино, 12% ABV");

        System.out.println(bordo.getWineNAME() + " 1111 " + bordo.getTrademark());
        System.out.println(bordo.getWineBottlingDay());

        bordo.wineAging(LocalDate.of(2000,1,1));

    }
}