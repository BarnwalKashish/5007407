// ObserverPatternTest.java
package com.observerpattern;

public class ObserverPatternTest {
    public static void main(String[] args) {

        StockMarket stockMarket = new StockMarket();

        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();

        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        System.out.println("Setting stock price to $100.00");
        stockMarket.setStockPrice(100.00);

        System.out.println("\nSetting stock price to $105.50");
        stockMarket.setStockPrice(105.50);

        stockMarket.deregisterObserver(mobileApp);

        System.out.println("\nSetting stock price to $110.75");
        stockMarket.setStockPrice(110.75);
    }
}
