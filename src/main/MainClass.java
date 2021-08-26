package main;

import java.util.Scanner;

import jieun.*;

import psy.TestPsy;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TestJieun tJieun = new TestJieun();
		int num = 0;
		TestPsy tPsy = new TestPsy();
		while(true) {
			System.out.println("1.박선영 2.박상진 3.문지은 4.김형석 5.김여진");
			num = sc.nextInt();
			switch(num) {
			case 1:
				tPsy.display(); break;
			case 2: break;
			case 3: 
				tJieun.display();
				break;
			case 4: break;
			case 5: break;
			}
		}
	}
}
