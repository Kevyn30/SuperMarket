import Main.Product;
import jdk.jfr.Category;

import java.lang.annotation.Annotation;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Listar Produtos");
            System.out.println("3. Buscar por Categoria");
            System.out.println("4. Buscar por Nome");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nome do produto: ");
                    String name = scanner.nextLine();
                    System.out.print("Preço do produto: ");
                    double price = scanner.nextDouble();
                    System.out.print("Quantidade em estoque: ");
                    int stockQuantity = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Categoria do produto: ");
                    String categoryName = scanner.nextLine();
                    System.out.print("Descrição da categoria: ");
                    String categoryDescription = scanner.nextLine();
                    Category category = new Category(){
                        @Override
                        public Class<? extends Annotation> annotationType() {
                            return null;
                        }

                        @Override
                        public String[] value() {
                            return new String[0];
                        }
                    };

                    System.out.print("Tipo do produto (1: Comum, 2: Importado, 3: Digital): ");
                    int type = scanner.nextInt();
                    scanner.nextLine();

                    if (type == 1) {
                        store.addProduct(new Product(name, price, stockQuantity, category));
                    } else if (type == 2) {
                        System.out.print("Taxa de importação: ");
                        double importTax = scanner.nextDouble();
                        store.addProduct(new ImportedProduct(name, price, stockQuantity, importTax, category));
                    } else if (type == 3) {
                        System.out.print("URL de download: ");
                        String downloadUrl = scanner.nextLine();
                        store.addProduct(new DigitalProduct(name, price, stockQuantity, category, downloadUrl));
                    }
                    break;

                case 2:
                    store.listProducts();
                    break;

                case 3:
                    System.out.print("Digite o nome da categoria: ");
                    String searchCategory = scanner.nextLine();
                    store.searchByCategory(searchCategory);
                    break;

                case 4:
                    System.out.print("Digite o nome do produto: ");
                    String searchName = scanner.nextLine();
                    store.searchByName(searchName);
                    break;

                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}