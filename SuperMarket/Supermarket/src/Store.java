import Main.Product;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Store {
    ImportedProduct importedProduct;
    DigitalProduct digitalProduct;
    List<ImportedProduct> importedProducts = new ArrayList<ImportedProduct>();
    List<DigitalProduct> digitalProducts = new ArrayList<DigitalProduct>();
    public Store(ImportedProduct importedProduct, DigitalProduct digitalProduct) {
        this.importedProduct = importedProduct;
        this.digitalProduct = digitalProduct;
    }

    public void addImportedProduct(ImportedProduct importedProduct) {
        this.importedProducts.add(importedProduct);
    }

    public void addDigitalProduct(DigitalProduct digitalProduct) {
        this.digitalProducts.add(digitalProduct);
    }

    public void showClass() {

        int count = 0;
        while (count < importedProducts.size()) {
            showStoreImp(importedProducts.get(count));
            count++;
        }
        while (count<digitalProducts.size()){
            showStoreDig(digitalProducts.get(count));
        }
    }

    private void showStoreDig(DigitalProduct DigitalProduct) {
        System.out.println(digitalProduct.Information());
    }


    private void showStoreImp(ImportedProduct importedProduct) {
        System.out.println(importedProduct.Information());
    }
}
