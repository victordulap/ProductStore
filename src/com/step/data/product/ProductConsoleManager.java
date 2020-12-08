package com.step.data.product;

import java.time.LocalDate;
import java.util.Scanner;

public class ProductConsoleManager {
    ProductManager pm = new ProductManager();

    public void showStockOfProduct() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product name to get stock of: ");
        String product = sc.nextLine();
        int stock = pm.getStockOfProductByName(product);
        System.out.println("Stock of " + product + " is: " + stock);
    }

    public void add() {
//        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter name: ");
        String name = "milk"; //sc.nextLine();

//        System.out.print("Enter buying price: ");
        double buyingPrice = 10; //sc.nextDouble(); sc.nextLine();

//        System.out.print("Enter selling price: ");
        double sellingPrice = 15; //sc.nextDouble(); sc.nextLine();

//        System.out.print("Enter expiration date: ");
//        LocalDate expirationDate= LocalDate.parse(sc.nextLine());
        LocalDate expirationDate = LocalDate.now().plusDays(10);

//        System.out.print("Enter description: ");
        String description = "milk 5% fat"; //sc.nextLine();

//        System.out.print("Enter stock: ");
        int stock = 50; //sc.nextInt();

        pm.add(name, buyingPrice, sellingPrice, expirationDate, description, stock);
        System.out.println("Inserted successfully: " +
                ", name='" + name + '\'' +
                ", buyingPrice=" + buyingPrice +
                ", sellingPrice=" + sellingPrice +
                ", expirationDate=" + expirationDate +
                ", description='" + description + '\'' +
                ", stock=" + stock +
                '}');
    }

    public void sell() {
        String name = "milk";
//        int count = 53; // count bigger than stock
        int count = 2; // count smaller than stock
        pm.sell(name, count);
        System.out.println("stock remaining: " + pm.getStockOfProductByName("milk"));
    }

    public void showTotalProfit() {
        System.out.println("Total profit: " + ProductManager.getTotalProfit());
    }

    public void showTotalIncome() {
        System.out.println("Total income: " + ProductManager.getTotalIncome());
    }
}
