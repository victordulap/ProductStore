package com.step.data.product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private static List<Product> products = new ArrayList<>();
    private static double totalIncome;
    private static double totalProfit;

//    public ProductManager() {
//        products.add(new Product("milk", 5, 7, LocalDate.now().plusDays(6),
//                "milk \"casuta mea\" 7% fat", 50));
//    }

    /**
     * @param productName
     * @return -1 if no such product with productName
     * stock of product if product found
     */
    public int getStockOfProductByName(String productName) {
        for (Product product: products) {
            if(product.getName().equalsIgnoreCase(productName)) {
                return product.getStock();
            }
        }

        return -1;
    }

    public int getIndexProductByName(String productName) {
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).getName().equalsIgnoreCase(productName)) {
                return i;
            }
        }

        return -1;
    }

    public double getProfitProductByName(String productName) {
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).getName().equalsIgnoreCase(productName)) {
                return products.get(i).getProfit();
            }
        }

        return -1;
    }

    public static double getTotalIncome() {
        return totalIncome;
    }

    public static double getTotalProfit() {
        return totalProfit;
    }

    public void add(String name, double buyingPrice, double sellingPrice, LocalDate expirationDate, String description, int stock) {
        products.add(new Product(name, buyingPrice, sellingPrice, expirationDate, description, stock));
    }

    public int sell(String name, int stockToSell) {
        int productIndex = getIndexProductByName(name);
        int currentStock = this.getStockOfProductByName(name);
        double buyingPrice = products.get(productIndex).getBuyingPrice();
        double sellingPrice = products.get(productIndex).getSellingPrice();

        if(stockToSell > currentStock) {
            products.get(productIndex).setStock(0);
            totalIncome += (sellingPrice * currentStock);

            double profit = (sellingPrice - buyingPrice) * currentStock;
            totalProfit += profit;
            products.get(productIndex).addProfit(profit);

            return currentStock;
        } else {
            products.get(productIndex).setStock(currentStock - stockToSell);

            totalIncome += (sellingPrice * stockToSell);

            double profit = (sellingPrice - buyingPrice) * stockToSell;
            totalProfit += profit;
            products.get(productIndex).addProfit(profit);

            return currentStock - stockToSell;
        }
    }
}
