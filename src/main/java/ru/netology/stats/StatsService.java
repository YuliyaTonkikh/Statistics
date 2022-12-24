package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) { // Сумма всех продаж
        long result = 0;
        for (long sale : sales) {
            result = +sale;
        }
        return result;

    }

    public long averageSale(long[] sales) { // Средняя сумма продаж в месяц
        return sum(sales) / sales.length;

    }

    public int maximumSale(long[] sales) { // Месяц в котором была максимальная продажа
        int maximumMonth = 0;
        int maximumSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maximumSale) {
                maximumSale = (int) sales[i];
                maximumMonth = i;
            }
        }
        return maximumMonth + 1;
    }
    public int minimumSale(long[] sales) { // Месяц в котором была минимальная продажа
        int minimumMonth = 0;
        int minimumSale = (int) sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= minimumSale) {
                minimumSale = (int) sales[i];
                minimumSale = i;
            }
        }
        return minimumMonth + 1;
    }
    public int salesBelowAverege (long[] sales){
        int counter = 0;
        for (long sale : sales){
            if (sale < averageSale(new long[]{sale})){
                counter++;
            }
        }
        return counter;
    }
    public int salesAboveAverege (long[] sales){
        int counter = 0;
        for (long sale : sales){
            if (sale > averageSale(new long[]{sale})){
                counter++;
            }
        }
        return counter;
    }


}
