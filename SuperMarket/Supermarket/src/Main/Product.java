package Main;

public class Product {

    String name;
    double price;
    int stockQuantity;

    public Product(String name, double price, int stockQuantity) {
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String nome) {
        this.name = nome;
    }

    public double calculateFinalPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public String Information() {
        return "\n" + "Produtos" + "\n" + ", Nome: " + name + ", Preço: " + price + ", Quantidade: " + stockQuantity + "\n";
    }

}
