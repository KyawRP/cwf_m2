package cwf.m2;

import java.util.*;

public class ProductrRegistration {

    private ArrayList<Product> products = new ArrayList<>();
    private int capacity;

    public ProductrRegistration() {
    	products.add(new Product("0001","rice","thailand",22.90));
    	products.add(new Product("0002","oil","malaysia",20.50));
    	products.add(new Product("0003","milk","japan",5.95));
    	products.add(new Product("0004","egg","poland",3.30));
    	
        this.capacity = 4;
    }

    public ProductrRegistration(int capacity) {
        this.capacity = capacity;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
    	if(products.size() != capacity) {
    		products.add(product);
    	}
    }
    
    public List<Product> sortProductsByName() {         
        Collections.sort(products, Product.nameComparator);         
        return products;     
    } 
    
    public List<Product> sortProductsByPrice() {         
        Collections.sort(products, Product.priceComparator);         
        return products;     
    } 
    
    public Product findProdcutsById(String id) {
    	for (Product p : products) { 		      
            if(p.getId().equals(id)) return p;
       }
    	return null;
    }

    public Product findProductByName(String name) {
    	for (Product p : products) { 		      
            if(p.getName().equals(name)) return p;
       }
    	return null;
    }
}
