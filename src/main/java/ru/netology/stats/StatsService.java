package ru.netology.stats;

public class StatsService {

    public long sum(long[] sales) {
        long sumSale = 0;
        for (long sale : sales) {
            sumSale += sale;
        }
        return sumSale;
    }

    public long avarage(long[] sales) {
        return sum(sales) / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonths = 0;
        long saleMax = sales [0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonths]) {
                maxMonths = i;
                saleMax = sales [i];
            }
        }
        return maxMonths + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        long saleMin = sales [0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int belowAverageSale(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale < avarage(sales)) {
                counter++;
            }
        }
        return counter;
    }


    public int aboveAverageSale(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale >= avarage(sales)) {
                counter++;
            }
        }
        return counter;
    }
}