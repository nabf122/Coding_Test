package com.java.test220223;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {

	public String solution(int[] numbers) {
		String answer = "";
		
		String[] strNum = new String[numbers.length];
		
		for(int i = 0; i < numbers.length; i++) {
			strNum[i] = String.valueOf(numbers[i]);
		}
		
		Arrays.sort(strNum, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return (o2 + o1).compareTo(o1 + o2);
			}
		});
		
		StringBuilder sb = new StringBuilder();
			
		for (int i=0; i<numbers.length; i++)
			sb.append(strNum[i]);
		
		answer = sb.toString();
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 20, 7, 4};
		
		Solution sol = new Solution();

		System.out.println(sol.solution(arr));
		
	}

}
