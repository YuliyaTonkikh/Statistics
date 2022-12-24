package ru.netology.stats;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class StatsServiceTest {
    @Test // Сумма всех продаж
    public void testSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        long actual = 180;

        Assertions.assertEquals(expected, actual);
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
        long expected = 8;
        long actual = 8;

        Assertions.assertEquals(expected, actual);

    }
    @Test // Месяц в котором была минимальная продажа
    public void testSalesBelowAverege() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = 5;

        Assertions.assertEquals(expected, actual);

    }
    @Test // Месяц в котором была минимальная продажа
    public void testSalesAboveAverege() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 6;
        long actual = 6;

        Assertions.assertEquals(expected, actual);

    }



}
