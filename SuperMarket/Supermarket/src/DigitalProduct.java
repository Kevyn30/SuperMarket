import Main.Product;

public class DigitalProduct extends Product {
    String downloadUrl;

    public DigitalProduct(String name, double price, int stockQuantity, String downloadUrl) {
        super(name, price, stockQuantity);
        this.downloadUrl = downloadUrl;
    }

    @Override
    public String Information() {
        return super.Information() + "\n" + "Preço: " + (calculateFinalPrice() * 0.9);
    }
}
