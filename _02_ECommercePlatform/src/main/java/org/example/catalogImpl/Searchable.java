package org.example.catalogImpl;

import org.example.productImpl.Product;

import java.util.ArrayList;

public interface Searchable {

    public ArrayList<Product> searchProduct(String productName);

    public ArrayList<Product> searchCategory(String categoryName);

}
