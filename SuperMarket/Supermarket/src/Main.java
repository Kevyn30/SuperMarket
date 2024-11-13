import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        System.out.println("Para adicionar um prduto importado(1)" +
                "\n" + "Para adicionar um produto digital(2)" + "\n"+"Para sair digite(0)");
        menu();
    }

    public static String menu() {
        int UserDig, val;
        Scanner userDig = new Scanner(System.in);
        UserDig = userDig.nextInt();
        for (val = 0; UserDig != val; val = 0) {
            if (UserDig == 1) {

                return importedOption();

            }
            if (UserDig == 2) {
                return digitalOption();
            }
            return menu();
        }

        return "Fim do Programa!";
    }

    public static String importedOption() {
        String nameInput;
        double priceInput, importedtaxInput;
        int quantity;
        System.out.println("Nome do Produto: ");
        Scanner digname = new Scanner(System.in);
        nameInput = digname.next();

        System.out.println("Preço do Produto: ");
        Scanner digPrice = new Scanner(System.in);
        priceInput = digPrice.nextDouble();

        System.out.println("Qunatidade do Produto: ");
        Scanner stockQuantityInput = new Scanner(System.in);
        quantity = stockQuantityInput.nextInt();

        System.out.println("Taxa do Produto: ");
        Scanner taxaInput = new Scanner(System.in);
        importedtaxInput = taxaInput.nextDouble();
        ImportedProduct importedProduct = new ImportedProduct(nameInput, priceInput, quantity, importedtaxInput);

        System.out.println(importedProduct.Information());
        return "1";
    }

    public static String digitalOption() {
        String nameInput, urlString;
        double priceInput;
        int quantity;
        System.out.println("Nome do Produto Digital: ");
        Scanner digname = new Scanner(System.in);
        nameInput = digname.next();

        System.out.println("Preço do Produto: ");
        Scanner digPrice = new Scanner(System.in);
        priceInput = digPrice.nextDouble();

        System.out.println("Quantidade do Produto: ");
        Scanner stockQuantityInput = new Scanner(System.in);
        quantity = stockQuantityInput.nextInt();

        System.out.println("Url do produto: ");
        Scanner urlInput = new Scanner(System.in);
        urlString = urlInput.next();
        DigitalProduct digitalProduct = new DigitalProduct(nameInput, priceInput, quantity, urlString);

        System.out.println(digitalProduct.Information());
        return "";
    }

}