package com.biz.method;

public class Method04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5���� 10������ ���� �߻�
		for(int i = 0 ; i < 5 ; i++) {
			double dRND = Math.random();
			double dRND1 = dRND * 100; // 0 ���� 99����
			dRND1 = dRND * 50; // 0 ���� 49.xx ����
			
			dRND1 = dRND * 30; // 0 ���� 29.xx ����
			int intRND = (int)dRND1 ; // 0 ���� 29����
			intRND += 1; // 1���� 30����
			intRND += 20; // 21���� 50����
			
			int intStars 
			= (int)(dRND*(10-5+1)) + 5; // 5���� 10����	
			
			intStars = (int)(dRND * (100-50 +1)) + 50;
			// 50���� 100���� ���ڸ� ������
			
			System.out.println(intStars);
		}

	
// 		makeStars(intStars);
	
	}

}