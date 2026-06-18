import java.util.*;
public class InventoryManager {
    HashMap<Integer, product> inventory=new HashMap<>();
    public void addProduct(product p){
        inventory.put(p.productId,p);
    }
    public void updateProduct(int id,int quantity,double price){
        if(inventory.containsKey(id)){
            product p=inventory.get(id);
            p.quantity=quantity;
            p.price=price;
        }
    }
    public void deleteProduct(int id){
        inventory.remove(id);
    }
    public void displayProducts(){
        inventory.values().forEach(System.out::println);
    }
}
