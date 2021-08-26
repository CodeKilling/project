package main;

import java.util.Scanner;
import jieun.*;
import parksangjin.sangjin;
import psy.TestPsy;
import hyungseok.hyungseok;


public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;

		TestPsy tPsy = new TestPsy();
		sangjin sj = new sangjin();
		TestJieun tJieun = new TestJieun();
		hyungseok hs = new hyungseok();

		while(true) {
			System.out.println("1.박선영 2.박상진 3.문지은 4.김형석 5.김여진");
			num = sc.nextInt();
			switch(num) {

			case 1:
				tPsy.display(); break;
			case 2: 
				sj.display();break;
			case 3: 
				tJieun.display();
				break;
			case 4: 
				hs.hs_print();
				break;
			case 5: break;
			}
		}
	}
}
