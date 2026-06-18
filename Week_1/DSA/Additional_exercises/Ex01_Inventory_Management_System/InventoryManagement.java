import java.util.*;
public class InventoryManagement {
    static HashMap<Integer, Product> inventory = new HashMap<>();
    static void add(Product p){ inventory.put(p.productId,p); }
    static void update(int id,int qty){ if(inventory.containsKey(id)) inventory.get(id).quantity=qty; }
    static void delete(int id){ inventory.remove(id); }
    public static void main(String[] args){
        add(new Product(1,"Laptop",10,50000));
        update(1,15);
        delete(1);
        System.out.println("Inventory operations completed.");
    }
}