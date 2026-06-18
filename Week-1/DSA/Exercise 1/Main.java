import java.util.*;
public class Main {
    public static void main(String[] args) {
        InventoryManager manager =new InventoryManager();
        manager.addProduct(new product(1,"Laptop",10,50000));
        manager.addProduct(new product(2,"Mouse",50,500));
        manager.displayProducts();
        manager.updateProduct(1,20,55000);
        manager.deleteProduct(2);
        System.out.println("\nAfter Updates");
        manager.displayProducts();
    }
}