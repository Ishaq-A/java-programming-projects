package com.amanishaq;

import java.util.Map;

public class Main {

    private static StockList stockList = new StockList();

    public static void main(String[] args) {

        StockItem temp = new StockItem("bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("car", 12.50, 2);
        stockList.addStock(temp);

        temp = new StockItem("chair", 62.0, 10);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.50, 200);
        stockList.addStock(temp);
        temp = new StockItem("cup", 0.45, 7);
        stockList.addStock(temp);

        temp = new StockItem("door", 72.95, 4);
        stockList.addStock(temp);

        temp = new StockItem("juice", 2.50, 36);
        stockList.addStock(temp);

        temp = new StockItem("phone", 96.99, 35);
        stockList.addStock(temp);

        temp = new StockItem("towel", 2.40, 80);
        stockList.addStock(temp);

        temp = new StockItem("vase", 8.76, 40);
        stockList.addStock(temp);

        System.out.println(stockList);

//        for (String s : stockList.Items().keySet()) {
//            System.out.println(s);
//        }

        Basket bobsBasket = new Basket("Bob");

        sellItem(bobsBasket, "car", 1);
        System.out.println(bobsBasket);

        sellItem(bobsBasket, "car", 1);
        System.out.println(bobsBasket);

        sellItem(bobsBasket, "car", 1);

        sellItem(bobsBasket, "spanner", 5);
//        System.out.println(bobsBasket);

        sellItem(bobsBasket, "juice", 4);
        sellItem(bobsBasket, "cup", 12);
        sellItem(bobsBasket, "bread", 1);
//        System.out.println(bobsBasket);

//        System.out.println(stockList);

        Basket basket = new Basket("customer");
        sellItem(basket, "cup", 100);
        sellItem(basket, "juice", 5);
        removeItem(basket, "cup", 1);
        System.out.println(basket);

        removeItem(bobsBasket, "car", 1);
        removeItem(bobsBasket, "cup", 9);
        removeItem(bobsBasket, "car", 1);
        System.out.println("cars removed " + removeItem(bobsBasket, "car", 1));

        System.out.println(bobsBasket);

        // Remove all items from bobs basket.
        removeItem(bobsBasket, "bread", 1);
        removeItem(bobsBasket, "cup", 3);
        removeItem(bobsBasket, "juice", 4);
        removeItem(bobsBasket, "cup", 3);
        System.out.println(bobsBasket);

        System.out.println("\nDisplay stock list before and after checkout");
        System.out.println(basket);
        System.out.println(stockList);
        checkOut(basket);
        System.out.println(basket);
        System.out.println(stockList);

//        temp = new StockItem("pen", 1.12);
//        stockList.Items().put(temp.getName(), temp);

        stockList.Items().get("car").adjustStock(2000);
        stockList.Items().get("car").adjustStock(-1000);
        System.out.println(stockList);

//        for (Map.Entry<String, Double> price : stockList.priceList().entrySet()) {
//            System.out.println(price.getKey() + " costs " + price.getValue());
//        }

        checkOut(bobsBasket);
        System.out.println(bobsBasket);

    }

    public static int sellItem(Basket basket, String item, int quantity) {
        // Retrieve the item from stock list.
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if (stockList.reserveStock(item, quantity) != 0) {
            return basket.addToBasket(stockItem, quantity);
        }
        return 0;
    }

    public static int removeItem(Basket basket, String item, int quantity) {
        // Retrieve the item from stock list.
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if (basket.removeFromBasket(stockItem, quantity) == quantity) {
            return stockList.unreserveStock(item, quantity);
        }
        return 0;
    }

    public static void checkOut(Basket basket) {
        for (Map.Entry<StockItem, Integer> item : basket.Items().entrySet()) {
            stockList.sellStock(item.getKey().getName(), item.getValue());
        }
        basket.clearBasket();
    }
}
