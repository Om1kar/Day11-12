package com.bridgelabz.Day11;

import java.util.Scanner;

public class StockAccountManagement {
    public static void main(String[] args) {
        int flag = 0;
        Scanner sc = new Scanner(System.in);
        StockPortfolio pf = new StockPortfolio();
        while (flag == 0) {
            System.out.println("Enter the details of Stock ");
            StockPortfolio.Stock st = new StockPortfolio.Stock();
            System.out.println("Enter Company Name");
            st.company = sc.nextLine();
            System.out.println("Enter number of share");
            st.NoOfShare = sc.nextInt();
            System.out.println("Enter Price of share");
            st.price = sc.nextDouble();
            pf.portfolio.add(st);

        }
        for (int i = 0; i < pf.portfolio.size(); i++) {
            System.out.println(pf.totalValue());

        }
    }
}
