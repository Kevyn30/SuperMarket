public class Product {
    private String name;
    private double price;
    private int stockQuantity;
    private Category category;

    public Product(String name, double price, int stockQuantity, Category category) {
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.category = category;
    }

    public double calculateFinalPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Produtos:"+"\n" + "Nome:'" + name + ", Preço: " + calculateFinalPrice() + ", \n" +
                "Quantidade em Estoque:" + stockQuantity + ", Categoria: " + category.getName();
    }
}