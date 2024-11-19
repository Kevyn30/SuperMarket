import java.util.ArrayList;
import java.util.List;

class Store {
    private List<Product> products;

    public Store() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void listProducts() {
        for (Product product : products) {
            System.out.println(product.getName() + ", Preço Final: " + product.calculateFinalPrice()+
                    "\n"+"Categoria: " +product.getCategory().getName());
        }
    }

    public void filterProducts(String query) {
        for (Product product : products) {
            if (product.getName().contains(query) || product.getCategory().getName().contains(query)) {
                System.out.println(product.getName() + ", Preço Final: " + product.calculateFinalPrice()+", Quantidade:"+product.getStockQuantity()
                +"\n"+"Categoria:"+product.getCategory().getName()+"\n"+"Descrição:"+product.getCategory().getDescription()+".");
            }
        }
    }
}