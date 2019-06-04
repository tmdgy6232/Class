package com.biz.exec;

import java.util.Random;

public class Exec_06 {

	public static void main(String[] args) {

		int[] intNum = new int[10];
		Random rnd = new Random();
		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = rnd.nextInt(10) + 1;
		}
		for (int i = 0; i < intNum.length; i++) {
			System.out.print(intNum[i] + "\t");

		}
		System.out.println();

		for (int i = 0; i < intNum.length; i++) {
			if (intNum[i] == 7) {
				System.out.println((i + 1) + "번째입니다.");
				break;
			} else if(i==intNum.length-1) {
				if( intNum[i] != 7) {
				System.out.println("7이 없습니다.");
			} else { 
			}
			}
		}

	}
}

// intNum에 저장된 값들 중에 5가 있으면
// 몇번째에 있는지 찾아보세요.
// 만약 7이 없다면 없다고 표시하세요