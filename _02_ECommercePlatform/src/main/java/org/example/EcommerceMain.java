package org.example;


import org.example.catalogImpl.ProductsCatalog;
import org.example.logImpl.Shipment;
import org.example.productImpl.Category;
import org.example.productImpl.Item;
import org.example.productImpl.Product;
import org.example.userImpl.Customer;
import org.example.userImpl.Seller;

import java.util.ArrayList;

public class EcommerceMain {

    public ProductsCatalog productsCatalog;

    public EcommerceMain(){
        productsCatalog = new ProductsCatalog();
    }


    public static void main(String[] args) {

        System.out.println("Welcome to Ecommerce Code.....");

        /*------------------------  Data Generation Code - Start --------------------------*/


        // Creating a Customer  --> Pavan
        Customer pavan = new Customer("Pavan Ajmera","9876543210");


        // Creating a Seller --> Daily Needs Groceries
        Seller dailyNeedsGrocery = new Seller("Daily Needs Groceries", "9999988888");


        // Creating a Seller --> Fashion Point
        Seller fashionPoint = new Seller("Fashion Point","9999977777");


        // Creating a Seller --> Digi Electronics
        Seller digiElectronics = new Seller("Digi Electronic","9999966666");


        // Creating Category --> Electronics
        Category electronics = new Category("Electronics");


        // Creating Category --> Cosmetics
        Category cosmetics = new Category("Cosmetics");


        // Creating category --> Grocery
        Category grocery = new Category("Groceries");


        // Creating category --> Clothing
        Category clothing = new Category("Clothing");


        /*------------------------  Data Generation Code - End --------------------------*/


        EcommerceMain ecommerceMain = new EcommerceMain();


        // Adding all the categories to Ecommerce Catalog
        ecommerceMain.productsCatalog.addCategory(clothing);
        ecommerceMain.productsCatalog.addCategory(grocery);
        ecommerceMain.productsCatalog.addCategory(cosmetics);
        ecommerceMain.productsCatalog.addCategory(electronics);



        // Seller Digi Electronics adding Mobile to myEcommerce Catalog
        digiElectronics.registerProduct(ecommerceMain.productsCatalog, new Product("Mobile","Latest Technology",10000.00, electronics,5));

        // Seller Digi Electronics adding Camera to myEcommerce catalog
        digiElectronics.registerProduct(ecommerceMain.productsCatalog, new Product("Camera","Advanced Technology",50000,electronics,10));

        // Seller FashionPoint adding Wearbles to myEcommerce catalog
        fashionPoint.registerProduct(ecommerceMain.productsCatalog, new Product("Mens Jackets","XL - Size",1000.00,clothing,10));

        fashionPoint.registerProduct(ecommerceMain.productsCatalog, new Product("Jackets","XL - Size",1000.00, clothing,10));

        // Seller FashionPoint adding Cosmetics to myEcommerce catalog
        fashionPoint.registerProduct(ecommerceMain.productsCatalog, new Product("Nail Paint","Red Color",500.00,cosmetics,25));

        // Seller dailyNeedsGrocery adding grocery to myEcommerce catalog
        dailyNeedsGrocery.registerProduct(ecommerceMain.productsCatalog, new Product("Sugar","Fine Quality",40.00,grocery,1000));

        // Seller dailyNeedsGrocery adding grocery to myFlipKart catalog
        dailyNeedsGrocery.registerProduct(ecommerceMain.productsCatalog, new Product("Milk","100% Pure",50.00, grocery,250));


        dailyNeedsGrocery.registerProduct(ecommerceMain.productsCatalog, new Product("Milk","Hygienic and Pure",45.00,grocery,250));

        dailyNeedsGrocery.registerProduct(ecommerceMain.productsCatalog, new Product("Milk Cream", "Natural", 145.00, grocery,100));



        // Customer searching for Product ---> milk
        ArrayList<Product> milkresults = ecommerceMain.productsCatalog.searchProduct("Milk");
        //System.out.println(milkresults);


        // Customer searching for all products in grocery
        ArrayList<Product> groceryProducts = ecommerceMain.productsCatalog.searchProduct("groceries");
        // System.out.println(groceryProducts);


        // Customer adding 10 packets of milk to cart
        Item milkPackets = new Item(milkresults.get(0),10);
        pavan.addItemToCart(milkPackets);


        // Printing current cart status
        pavan.printCartItems();


        // Customer searching for another product --> camera
        ArrayList<Product> cameraResult = ecommerceMain.productsCatalog.searchProduct("CaMeRa");
        // System.out.println(cameraResult);


        // Customer adding 1 camera to cart
        Item oneCamera = new Item(cameraResult.get(0),1);


        // Printing current cart Items
        // pavan.printCartItems();

        // Customer updating quantity of milk packets from 10 to 15
        pavan.updateItemCount(milkPackets,15);


        // Printing current cart status
        // pavan.printCartItems();

        // Customer placing the order
        pavan.placeOrder();


        // Customer cart is empty after checkout
        pavan.printCartItems();



        // Printing the current order of the customer
        System.out.println(pavan.getCurrentOrder());


        // Customer order is moved to shipment
        Shipment s = pavan.getCurrentOrder().moveToShipment();


        // printing the shipment details
        System.out.println(s);


    }

}