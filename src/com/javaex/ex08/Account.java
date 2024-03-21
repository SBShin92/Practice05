package com.javaex.ex08;

public class Account {

    private String accountNo;
    private int balance;
    
    //생성자 작성
    public Account(String accountNo) {
    	this.accountNo = accountNo;
    	this.balance = 0;
    	System.out.printf("%s 계좌가 개설되었습니다.\n", this.accountNo);
    }
    //필요한 메소드 작성
    
    
    public void deposit(int money) {
    	this.balance += money;
    }
    
    public void withdraw(int money) {
    	this.balance -= money;
    }
    
    public void showBalance() {
    	System.out.println(this.balance);
    }
    
}
