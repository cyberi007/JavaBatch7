package com.syntax.class10;

public class DifferentPatterns {

	public static void main(String[] args) {
		// 55555
        // 4444
        // 333	
		// 22
		// 1
		
		//for (int i = 5; i>0; i--) {
			//for (int j = 1; j <=i; j++) {
			//	System.out.print(i);
			//}
			System.out.println();
	//	}
		//System.out.println("-----------------");
		// 54321
        // 4321
        // 321	
		// 21
		// 1
		//for (int i = 5; i>0; i--) {
		//	for (int j = i; j >=1; j--) {
			//	System.out.print(j);
		//	}
		//	System.out.println();
		
		System.out.println("-------------------");
		for (int row =1;row<=4;row++) {
			for (int col=row;col>=1;col--) {
				System.out.print(col);
			}
			System.out.println();
		}
		for (int i = 5; i>0; i--) {
			for (int j = i; j >=1; j--) {
				System.out.print(j);
			}
			System.out.println();
	}
	

	}	
1
21
321
4321
54321
4321
321
21
1	

		
