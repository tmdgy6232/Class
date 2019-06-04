package com.biz.exec;

import com.biz.model.Student;
import com.biz.model.StudentArray;

public class Exec_05 {

	public static void main(String[] args) {

		StudentArray sArray = new StudentArray();
		Student[] stdScore = sArray.makeScore(100);
		sArray.viewScore(stdScore);
	}

}
