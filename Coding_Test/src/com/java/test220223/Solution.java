package com.java.test220223;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Solution {

	static Integer[] numbers = new Integer[2];
	static String[] b;
	
	Scanner scan = new Scanner(System.in);
	
	//
	public String solution(Integer[] numbers) {
		
		Integer result = 0;
		String answer = "";
		
		Arrays.sort(numbers, Collections.reverseOrder());
		// Arrays.sort(numbers);
		result = numbers[0];
		
		answer = Integer.toString(result);
        
        return answer;
    }
	
	// 0 이상의 양의 정수 값 입력 받아 String 배열 b에 저장한다.
	public void setting() {
		int num = 0;
		int t = 0;
		int i = 0;
		boolean tf = true;
		
		System.out.println("입력할 정수의 개수는?");
		System.out.print("입력 :");
		t = scan.nextInt();
		
		b = new String[t];
		
		System.out.println("0 이상의 양의 정수를 입력하세요");
		
		while(tf) {
			System.out.print("입력 :");
			num = scan.nextInt();
			if(num < 0) {
				System.out.println("0 이상의 양의 정수를 입력하세요");
			}else {
				b[i] = Integer.toString(num);
				i++;
				if(i >= t) { 
					tf = false;
				}
			}
		}
	}
	
	/* 입력받아 저장한 String 배열 b의 배열들을 문자열 합치기를 한 후
	 * integer로 형변환해서 int 배열 numbers에 저장한다.
	*/
	public void StringtoInt(String[] str) {
		
		String sum = "";
		
		for(int i = 0;i < str.length; i++) {
			sum = sum + str[i];
		}
		numbers[0] = Integer.parseInt(sum);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String answer;
		
		Solution sol = new Solution();

		sol.setting();
		sol.StringtoInt(b);
		answer = sol.solution(numbers);
		System.out.println("가장 큰 수는 " + answer +" 입니다.");
		
	}

}
