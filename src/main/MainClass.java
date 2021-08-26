package main;

import java.util.Scanner;

<<<<<<< HEAD
import jieun.*;
import parksangjin.sangjin;
import psy.TestPsy;
=======
import hyungseok.hyungseok_method;
>>>>>>> 3cffaaba293d6468095f21fbb397f995758d8068

public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TestJieun tJieun = new TestJieun();
		int num = 0;
<<<<<<< HEAD
		TestPsy tPsy = new TestPsy();
		sangjin sj = new sangjin();
=======
		hyungseok_method hs = new hyungseok_method();
>>>>>>> 3cffaaba293d6468095f21fbb397f995758d8068
		while(true) {
			System.out.println("1.박선영 2.박상진 3.문지은 4.김형석 5.김여진");
			num = sc.nextInt();
			switch(num) {
<<<<<<< HEAD
			case 1:
				tPsy.display(); break;
			case 2: 
				sj.display();break;
			case 3: 
				tJieun.display();
				break;
			case 4: break;
=======
			case 1: break;
			case 2: break;
			case 3: break;
			case 4: 
				hs.hs_print();
				break;
>>>>>>> 3cffaaba293d6468095f21fbb397f995758d8068
			case 5: break;
			}
		}
	}
}
