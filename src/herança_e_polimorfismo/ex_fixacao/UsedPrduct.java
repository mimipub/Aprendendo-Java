package herança_e_polimorfismo.ex_fixacao;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class UsedPrduct extends Product {
    private LocalDate manufactureDate;

    public UsedPrduct(){
    }
    public UsedPrduct(String name, double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    @Override
    public String priceTag() {
        return getName()
                + " (used)"
                + " $ "
                + String.format("%.2f", getPrice())
                + " (Manufacture date: "
                + getManufactureDate()
                + ")";
    }
}
