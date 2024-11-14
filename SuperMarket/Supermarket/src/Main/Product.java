package Main;

public class Product {

    private String name;
    private double price;
    private int stockQuantity;

    public Product(String name, double price, int stockQuantity) {
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }


    public double calculateFinalPrice() {
        return price;
    }

    public String Information() {
        return "\n" + "Produtos" + "\n" + "Nome: " + name + ", Preço: " + price + ", Quantidade: " + stockQuantity + "\n";
    }

}
