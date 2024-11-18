import Main.Product;
import jdk.jfr.Category;

public class DigitalProduct extends Product{
    private String downloadUrl;

    public DigitalProduct(String name, double price, int stockQuantity, Category category, String downloadUrl) {
        super(name, price, stockQuantity,category);
        this.downloadUrl = downloadUrl;
    }

    @Override
    public double calculateFinalPrice() {
        return super.calculateFinalPrice() * 0.9; // 10% discount
    }

}