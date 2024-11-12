import Main.Product;

public class ImportedProduct extends Product {
    public double importedTax;

    public ImportedProduct(String name, double price, int stockQuantity, double importedTax) {
        super(name, price, stockQuantity);
        this.importedTax = importedTax;
    }

    @Override
    public String Information() {
        return super.Information()+"\n"+"Preço:"+calculateFinalPrice()+importedTax;
    }


}