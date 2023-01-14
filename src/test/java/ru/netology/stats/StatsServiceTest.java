package ru.netology.stats;

import org.testng.annotations.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class StatsServiceTest {
    @Test // Сумма всех продаж
    public void testSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        long actual = 180;

        Assertions.assertEquals(expected,actual);
    }

    @Test // Средняя сумма продаж в месяц
    public void testAverageSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
        long actual = 15;

        Assertions.assertEquals(expected, actual);

    }

    @Test // Месяц в котором была максимальная продажа
    public void testMaximumSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.maximumSale(sales);

        Assertions.assertEquals(expected, actual);

    }
    @Test // Месяц в котором была минимальная продажа
    public void testMinimummumSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 1;
        long actual = service.minimumSale(sales);

        Assertions.assertEquals(expected, actual);

    }
    @Test // Месяц в котором была минимальная продажа
    public void testSalesBelowAverege() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 0;
        long actual = service.salesBelowAverege(sales);

        Assertions.assertEquals(expected, actual);

    }
    @Test // Месяц в котором была максимальная продажа
    public void testSalesAboveAverege() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 0;
        long actual = service.salesAboveAverege(sales);

        Assertions.assertEquals(expected, actual);

    }



}
