package herança_e_polimorfismo.ex_fixacao;

public class ImportedProduct extends Product {
    private double CustomsFee;

    public ImportedProduct() {
    }

    public ImportedProduct(String name, double price, double customsFee) {
        super(name, price);
        CustomsFee = customsFee;
    }

    public double getCustomsFee() {
        return CustomsFee;
    }

    public Double totalPrice() {
        return getPrice() + this.CustomsFee ;
    }

    @Override
    public String priceTag() {
        return  getName() + " $ " + String.format("%.2f", totalPrice());
    }
}
