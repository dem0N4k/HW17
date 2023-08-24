import java.time.LocalDate;
import java.time.Period;

public class Wine {
    private String wineNAME;
    private String trademark;
    private String manufacturerCountry;
    private LocalDate wineBottlingDay;
    private String descriptionOfWine;


    public Wine() {
    }

    public Wine(String wineNAME,
                String trademark,
                String manufacturerCountry,
                LocalDate wineBottlingDay,
                String descriptionOfWine) {
        this.wineNAME = wineNAME;
        this.trademark = trademark;
        this.manufacturerCountry = manufacturerCountry;
        this.wineBottlingDay = wineBottlingDay;
        this.descriptionOfWine = descriptionOfWine;
    }

    public String getWineNAME() {
        return wineNAME;
    }

    public void setWineNAME(String wineNAME) {
        this.wineNAME = wineNAME;
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public String getManufacturerCountry() {
        return manufacturerCountry;
    }

    public void setManufacturerCountry(String manufacturerCountry) {
        this.manufacturerCountry = manufacturerCountry;
    }

    public LocalDate getWineBottlingDay() {
        return wineBottlingDay;
    }

    public void setWineBottlingDay(LocalDate wineBottlingDay) {
        this.wineBottlingDay = wineBottlingDay;
    }

    public String getDescriptionOfWine() {
        return descriptionOfWine;
    }

    public void setDescriptionOfWine(String descriptionOfWine) {
        this.descriptionOfWine = descriptionOfWine;
    }


    public void wineAging(LocalDate now) {
        int years = Period.between(wineBottlingDay, now).getYears();
        System.out.println("Выдерка вина составляет: " + years + " лет");
    }
}
