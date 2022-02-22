package com.java.test;

import java.util.Scanner;

class Solution {
	
	static int[] numbers = new int[100];
	static int[][] commands = new int[50][3];
	
	static int MAX_NUM = 0;
	static int MAX_CMD = 0;
	
	Scanner scan = new Scanner(System.in);
	
    public int[] solution(int[] array, int[][] commands) {
    	int[] answer = new int[MAX_CMD];
        int[] arr1 = {};
        
        int a = 0;
        int b = 0;
        int c = 0;
        
        /*
         * array {5, 4, 3, 7, 9}
         * commands {1, 3, 2}
         * 
         * a = 1
         * b = 3
         *
         *  
         *
         *  -> 5, 4, 3
         * c = 2
         *  -> return 4 ;
         */
        for(int i = 0; i < MAX_CMD; i++) {
        	a = commands[i][0];
        	b = commands[i][1];
        	c = commands[i][2];
        	int z = 0;
        	
        	arr1 = new int[b];
        	
        	for(int j = a; j < b+1; j++) {
        		arr1[z] = array[j];
        		z++;
        	}
        	answer[i] = arr1[c-1];
        }
        
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
    	
    	System.out.println();
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
