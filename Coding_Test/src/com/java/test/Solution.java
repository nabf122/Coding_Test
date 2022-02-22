package com.java.test;

import java.util.Scanner;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        return answer;
    }
    
    public static void main(String args[]) {
    	int[] numbers = new int[100];
    	int[][] commands = new int[3][50];
    	
    	Scanner scan = new Scanner(System.in);
    	
    	int i = 0;
    	int s = 0;
    	while(true){
    		s = scan.nextInt();
    		
    		if(i > 100)
    		{
    			if(s != 101) {
    				numbers[i] = s;
            		i++;
    			}else
    				break;
    		}else
    			break;
    	}
    	
    	for(int j = 0; j < i+1; j++)
    	{
    		System.out.print(numbers[j] + " ");
    	}
    	
    }
}
