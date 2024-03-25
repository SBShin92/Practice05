package com.javaex.ex06;


public class CConverterApp {

    public static void main(String[] args) {
        
        CConverter.setRate(1118.70);
        
        //100만원을 달러로 출력하기

        System.out.printf("백만원은 %.13f달러입니다.\n", 
        		CConverter.toDoller(1_000_000));
        System.out.printf("백달러는 %.1f원입니다.\n", 
        		CConverter.toKWR(100));
        
        //100달려를 원으로 출력하기
        
        
    }

}
