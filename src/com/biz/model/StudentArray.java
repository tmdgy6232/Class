package com.biz.model;

import java.util.Random;

import com.biz.model.Student;

public class StudentArray {
	
	/* Student 클래스를 객체배열로 생성하고
	 * 가상의 학생 성적 데이터를 만들어서
	 * return하는 method로 변경
	 * 
	 */
	public Student[] makeScore(int stdLen) {

		//Student 클래스 객체 10개를 예약하라
		//예약만 되어있고
		//사용할 준비가 되지 않은 상태
		Student[] stdScore = new Student[stdLen];
		
		//숫자형 배열은
		//배열을 초기화하면 각 개별 값이 0으로 생성
		//int[] intA = new int[10];
		
		//문자형 배열은 
		//배열을 초기화하면 각 개별값이 ""으로 생성
		//String[] strA = new String[10];
		
		//하지만 기타 다른클래스를 이용한 배열들은 초기화를 해줘야함
		//객체 배열은 사용(읽기, 쓰기)전에
		// 각 배열 요소를 개별적으로 초기화하는 코드를 수행해야 한다.
		
		//가상의 성적을 만들기위해 난수발생기를 사용한다.
		//한번만 만들면 반복적으로 사용할 수 있다.
		// 포문 안으로 들어가면 쓸데없이 9번 더만드는것이다.
		//이러한 경우 포문안으로 들어가면 나중에 프로그램 버틀넥이 된다.
		Random rnd = new Random();
		
		//for 반복문을 사용해서 같은 코드를 10번 수행했다.
		for(int i=0; i< stdScore.length; i++) {
			stdScore[i] = new Student();
			stdScore[i].intNum = i+1;
			
			stdScore[i].intKor = rnd.nextInt(50) + 51;
			stdScore[i].intEng = rnd.nextInt(50) + 51;
			stdScore[i].intMath = rnd.nextInt(50) + 51;
			
		}
		return stdScore;
}
	//makeScore가 끝나는 부분
	public void viewScore(Student[] stdScore) {

		for(int i=0; i< stdScore.length; i++) {
		
		
			
			
			System.out.println("===================================");
			System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
			System.out.println("-----------------------------------");
				
				int intsum = stdScore[i].intKor;
				intsum += stdScore[i].intEng;
				intsum += stdScore[i].intMath;
				
				float fAvg = intsum /3.0f;
				
				
				System.out.print(stdScore[i].intNum+"\t");
				System.out.print(stdScore[i].intKor+"\t");
				System.out.print(stdScore[i].intEng+"\t");
				System.out.print(stdScore[i].intMath+"\t");
				System.out.print(intsum+"\t");
				System.out.println(fAvg+"\t");
				System.out.println("===================================");
		
	}

	}
}

