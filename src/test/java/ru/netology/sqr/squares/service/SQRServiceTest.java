package ru.netology.sqr.squares.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SQRServiceTest {
    @Test
    public void testPositiveNumbers(){
        SQRService service = new SQRService();
        int expected = 8;
        int actual = service.calcSqr(300 , 100);

       // System.out.println("Количество квадратов в установленом диапазоне :" +sqrt);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testBeyondLimitMin (){
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.calcSqr(1 , 1);
       // System.out.println("Количество квадратов в установленом диапазоне :" +sqrt);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testNegotiveNumbers (){
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.calcSqr(-300 , -100);
       // System.out.println("Количество квадратов в установленом диапазоне :" +sqrt);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testBeyondLimitMax (){
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.calcSqr(1_000_000 , 1_000_000);
       // System.out.println("Количество квадратов в установленом диапазоне :" +sqrt);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testUpperBoundLessLowerBound (){
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.calcSqr(100 , 900);
       // System.out.println("Количество квадратов в установленом диапазоне :" +sqrt);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testZeroBounds (){
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.calcSqr(0 , 0);
        //System.out.println("Количество квадратов в установленом диапазоне :" +sqrt);

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testNegativeLowerBound (){
        SQRService service = new SQRService();
        int expendet = 8;
        int actual = service.calcSqr(300 , -100);
        //System.out.println("Количество квадратов в установленом диапазоне :" +sqrt);

        Assertions.assertEquals(expendet, actual);
    }
    @Test
    public void testNegativeUpperBound (){
        SQRService service = new SQRService();
        int expected = 0;
        int actual= service.calcSqr(-300 , 100);
       // System.out.println("Количество квадратов в установленом диапазоне :" +sqrt);

        Assertions.assertEquals(expected, actual);
    }
}
