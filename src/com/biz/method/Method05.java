package com.biz.method;

public class Method05 {

	public static void main(String[] args) {

		for(int i = 0 ; i < 10 ; i++ ) {
			int intKor = makeGrade(); 
			// (int)(Math.random() * (100-50 +1)) + 50;

			int intEng = makeGrade();
			// (int)(Math.random() * (100-50 +1)) + 50;

			int intMath = makeGrade();
			int intSci = makeGrade();
			int intHisto = makeGrade();
			int intMusic = makeGrade();
			
			// int intSum = intKor + intEng;
			int intSum = gradeSum(intKor, intEng);
			intSum += gradeSum(intMath, intSci);
			intSum += gradeSum(intHisto, intMusic);
			
			System.out.printf("����: %d, ����: %d �հ� = %d \n",intKor,intEng,intSum);
			
		}
	}
	public static int makeGrade() {
		int intRND = (int)(Math.random() * (100-50 +1)) + 50;
		return intRND;
	}
	
	public static int gradeSum(int intKor, int intEng)	{
		return intKor + intEng;
	}


}