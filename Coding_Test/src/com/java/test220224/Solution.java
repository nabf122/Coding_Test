package com.java.test220224;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
	public int solution(int[] citations) {
        int answer = 0;
        
        int[] arr = new int[citations.length];
        
        for(int i = 0; i < citations.length; i ++) {
        	arr[i] = citations[i];
        }
        
        Arrays.sort(arr, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		});
        
        int cnt = citations.length / 2;
        
        answer = citations[cnt];
        
        return answer;
    }
	
	public static void main(String args[]) {
		
		int[] citations = {3, 0, 6, 1, 5, 7};
		int result = 0;
		
		
		for(int i = 0; i < citations.length; i ++) {
			System.out.print(citations[i] + "  ");
		}
		System.out.println();
		
		Solution sol = new Solution();
		
		result = sol.solution(citations);
		
		System.out.println("H-Index : " + result);
	}
	
}
