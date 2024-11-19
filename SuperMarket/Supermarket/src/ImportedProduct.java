
public class ImportedProduct extends Product {
    public double importedTax;

    public ImportedProduct(String name, double price, int stockQuantity, double importedTax, Category category) {
        super(name, price, stockQuantity, category);
        this.importedTax = importedTax;
    }

    @Override
    public double calculateFinalPrice() {
        return super.calculateFinalPrice() + importedTax;
    }
}