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
	
	// 0 �̻��� ���� ���� �� �Է� �޾� String �迭 b�� �����Ѵ�.
	public void setting() {
		int num = 0;
		int t = 0;
		int i = 0;
		boolean tf = true;
		
		System.out.println("�Է��� ������ ������?");
		System.out.print("�Է� :");
		t = scan.nextInt();
		
		b = new String[t];
		
		System.out.println("0 �̻��� ���� ������ �Է��ϼ���");
		
		while(tf) {
			System.out.print("�Է� :");
			num = scan.nextInt();
			if(num < 0) {
				System.out.println("0 �̻��� ���� ������ �Է��ϼ���");
			}else {
				b[i] = Integer.toString(num);
				i++;
				if(i >= t) { 
					tf = false;
				}
			}
		}
	}
	
	/* �Է¹޾� ������ String �迭 b�� �迭���� ���ڿ� ��ġ�⸦ �� ��
	 * integer�� ����ȯ�ؼ� int �迭 numbers�� �����Ѵ�.
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
		System.out.println("���� ū ���� " + answer +" �Դϴ�.");
		
	}

}
