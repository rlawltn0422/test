package test;

import java.util.Scanner;

public class SungjukMain {
	
	while(true){
	    		
	    		System.out.print("이름은? ");
	    		String name = scan.next();
	    		
	    		System.out.print("1번 점수 : ");
	    		int one = scan.nextInt();
	    		
	    		System.out.print("2번 점수 : ");
	    		int two = scan.nextInt();

	    		System.out.print("3번 점수 : ");
	    		int three = scan.nextInt();
	    		
	    		System.out.print("4번 점수 : ");
	    		int four = scan.nextInt();
	    		
	    		int sum = one+two+three+four;
	    		double avg = sum/4;
	    		
	    		
	    		System.out.println("이름은? "+name+
	    				"총점은? "+sum+
	    				"평균은 "+avg);
	    		
	    		System.out.println();
                }
}