import Main.Product;
import Main.Category;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Adicionar novo produto");
            System.out.println("2. Listar todos os produtos");
            System.out.println("3. Filtrar produtos (Nome/Categoria)");
            System.out.println("4. Sair");

            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (option) {
                case 1:
                    System.out.println("Tipo de produto:");
                    System.out.println("1. Comum");
                    System.out.println("2. Importado");
                    System.out.println("3. Digital");

                    int type = scanner.nextInt();
                    scanner.nextLine(); // Consume newline left-over

                    System.out.println("Nome:");
                    String name = scanner.nextLine();
                    System.out.println("Preço:");
                    double price = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline left-over
                    System.out.println("Quantidade em estoque:");
                    int stockQuantity = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Categoria:");
                    String categoryName = scanner.nextLine();
                    System.out.println("Descrição");
                    String descriptionProduct = scanner.nextLine();
                    Category category = new Category(categoryName, descriptionProduct);

                    Product product;
                    switch (type) {
                        case 1:
                            product = new Product(name, price, stockQuantity, category);
                            break;
                        case 2:
                            System.out.println("Taxa de importação:");
                            double importTax = scanner.nextDouble();
                            scanner.nextLine();
                            product = new ImportedProduct(name, price, stockQuantity, importTax, category);
                            break;
                        case 3:
                            System.out.println("URL de download:");
                            String downloadUrl = scanner.nextLine();
                            product = new DigitalProduct(name, price, stockQuantity, category, downloadUrl);
                            break;
                        default:
                            continue;
                    }

                    store.addProduct(product);
                    break;
                case 2:
                    store.listProducts();
                    break;
                case 3:
                    System.out.println("Nome ou Categoria do Produto: ");
                    String query = scanner.nextLine();
                    store.filterProducts(query);

                    break;
                case 4:
                    System.out.println("Saindo...");
                    System.exit(0);
                    break;
            }
        }
    }
}