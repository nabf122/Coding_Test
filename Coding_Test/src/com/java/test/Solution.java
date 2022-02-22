package com.java.test;

import java.util.Scanner;

class Solution {
	
	static int[] numbers = new int[100];
	static int[][] commands = new int[50][3];
	
	static int MAX_NUM = 0;
	static int MAX_CMD = 0;
	
	Scanner scan = new Scanner(System.in);
	
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        return answer;
    }
    
    public void insertNum() {
    	int s = 0;
    	
    	System.out.print("입력 갯수 지정(MAX 100) : ");
    	MAX_NUM = scan.nextInt();
    	if(MAX_NUM <= 100 && MAX_NUM > 0) {
    		for(int i = 0; i < MAX_NUM; i++) {
    			System.out.print(i+1 + "번째 숫자 입력 : ");
        		s = scan.nextInt();
        		numbers[i] = s;
            }
        	
        	for(int j = 0; j < MAX_NUM; j++)
        	{
        		System.out.print(numbers[j] + " ");
        	}
    	}else
    		System.out.println("잘못된 입력 값");
    }
    
    public void insertCmd() {
    	System.out.print("입력 갯수 지정(MAX 50) : ");
    	MAX_CMD = scan.nextInt();
    	if(MAX_CMD <= 50 && MAX_CMD > 0) {
    		for(int i = 0; i < MAX_CMD; i++) {
    			for(int j = 0; j < 3; j++) {
    				System.out.print("입력 : ");
    				commands[i][j] = scan.nextInt();
    			}
            }
    	}else
    		System.out.println("잘못된 입력 값");
    }
    

	public static void main(String args[]) {
		
		Solution sol = new Solution();

		int[] result = new int[100];
		
    	sol.insertNum();
    	sol.insertCmd();

    	result = sol.solution(numbers, commands);
    	
    	for(int i = 0;i < MAX_NUM; i++)
    	{
    		System.out.print(result[i] + " ");
    	}
    }
}
