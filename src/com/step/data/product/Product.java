package com.step.data.product;

import java.time.LocalDate;

public class Product {
    private int id = 0;
    private String name;
    private double buyingPrice;
    private double sellingPrice;
    private LocalDate expirationDate;
    private String description;
    private int stock;
    private static int lastId;
    private double profit = 0;

    public Product(String name, double buyingPrice, double sellingPrice, LocalDate expirationDate, String description, int stock) {
        id++;
        lastId = id;
        this.name = name;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.expirationDate = expirationDate;
        this.description = description;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public String getDescription() {
        return description;
    }

    public int getStock() {
        return stock;
    }

    public int getId() {
        return id;
    }

    public static int getLastId() {
        return lastId;
    }

    public double getProfit() {
        return profit;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", buyingPrice=" + buyingPrice +
                ", sellingPrice=" + sellingPrice +
                ", expirationDate=" + expirationDate +
                ", description='" + description + '\'' +
                ", stock=" + stock +
                '}';
    }

    public void addProfit(double profit) {
        this.profit += profit;
    }
}
