package estoque;

public class Stock {
    private String name;
    private double price;
    private int quantity; // se enquadra como regra de negocio.

    public Stock() {
    }

    public Stock(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Stock(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double totalValueInStock(double price, double quantity) {
        return price * quantity;
    }

    public void AddProducts(int quantity) {
        this.quantity += quantity;
    }

    public void RemoveProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, "
                + "total: $ "
                + String.format("%.2f", totalValueInStock(price,quantity));
    }
}
