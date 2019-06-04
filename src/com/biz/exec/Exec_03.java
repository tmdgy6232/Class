package com.biz.exec;

public class Exec_03 {

	public static void main(String[] args) {

		int[] intNum =  new int[10]; //학번
		String[] StrName = new String[10]; //이름
		
		int[] intKor = new int[10]; //국어
		int[] intEng = new int[10]; //영어
		int[] intMath = new int[10]; //수학
		
		intNum[0] = 1;
		StrName[0] = "홍길동";
		intKor[0] = 90;
		intEng[0] = 70;
		intMath[0] = 70;
		

		intNum[1] = 2;
		StrName[1] = "이몽룡";
		intKor[1] = 80;
		intEng[1] = 80;
		intMath[1] = 90;

		intNum[2] = 3;
		StrName[2] = "성춘향";
		intKor[2] = 77;
		intEng[2] = 88;
		intMath[2] = 98;
		
		intNum[3] = 4;
		StrName[3] = "임꺽정";
		intKor[3] = 90;
		intEng[3] = 70;
		intMath[3] = 70;
		
		System.out.println("===================================");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-----------------------------------");
		for(int i=0; i<4; i++) {
			
			int intsum = intKor[i];
			intsum += intEng[i];
			intsum += intMath[i];
			
			float fAvg = intsum /3.0f;
			
			
			System.out.print(intNum[i]+"\t");
			System.out.print(StrName[i]+"\t");
			System.out.print(intKor[i]+"\t");
			System.out.print(intEng[i]+"\t");
			System.out.print(intMath[i]+"\t");
			System.out.print(intsum+"\t");
			System.out.println(fAvg+"\t");
			System.out.println("===================================");
			
	
			
		}
		System.out.println("===================================");
	}

}
