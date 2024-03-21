package com.javaex.ex09;

public class StringUtil {
    
    public static String concatString(String[] szArray) {

    	String result = new String();
    	
    	//메소드 내용작성
    	for (int i = 0; i < szArray.length; i++) {
    		result = result.concat(szArray[i]);
//    		result += szArray[i]; // 메모리 많이 잡아먹는다네요
    	}
    	return result;
    }

    
}
