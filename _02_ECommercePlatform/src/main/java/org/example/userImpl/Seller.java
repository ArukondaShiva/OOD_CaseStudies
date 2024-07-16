package org.example.userImpl;

import org.example.catalogImpl.ProductsCatalog;
import org.example.productImpl.Product;

import java.util.ArrayList;

public class Seller extends User{

    private ArrayList<Product> products;

    public Seller(String name, String phone) {
        super(name, phone);
        products = new ArrayList<>();
    }

    public void registerProduct(ProductsCatalog productsCatalog,Product product){
        product.setSeller(this);
        productsCatalog.addProducts(product);
        products.add(product);
    }


    public void updateProductQuantity(ProductsCatalog productsCatalog, Product product, int newQuantity){
        productsCatalog.updateProductQuantity(product,newQuantity);
    }


    public void removeProduct(ProductsCatalog productsCatalog, Product product){
        productsCatalog.removeProduct(product);
        products.remove(product);
    }

    public String toString(){
        return "Seller{}"+super.toString();
    }


}
