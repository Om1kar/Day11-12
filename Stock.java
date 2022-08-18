package com.bridgelabz.Day11;

import java.util.ArrayList;
import java.util.Scanner;

class StockPortfolio {
    ArrayList<Stock> portfolio = new ArrayList<>();
    double totalValue = 0;

    static class Stock {
        public double totalValue;
        int NoOfShare;
        String company;
        double price;
    }

    public double totalValue() {
        for (Stock stock : portfolio) {
            totalValue += stock.price * stock.NoOfShare;
        }
        return totalValue;
    }
}