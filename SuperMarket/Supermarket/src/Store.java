import Main.Product;
import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> products;

    public Store() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void listProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void searchByCategory(String categoryName) {
        for (Product product : products) {
            if (product.getCategory().getClass().getName().equalsIgnoreCase(categoryName)) {
                System.out.println(product);
            }
        }
    }

    public void searchByName(String productName) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(productName)) {
                System.out.println(product);
            }
        }
    }
}
