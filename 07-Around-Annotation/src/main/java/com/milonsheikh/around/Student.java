package com.milonsheikh.around;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	public int studyAnything(int x, int y) {
		System.out.println("I am a student and i am going to school");
		return x+y;
	}
	
	
	public String doOperation() {
		throw new MyExeption("This is my Exeption...");
	}
	
	
	public int videoRank(int noOfVeiws, int watchTime) {
		System.out.println("...This is Rank method... "+noOfVeiws +" ---- "+watchTime);
		return (noOfVeiws*watchTime) - (noOfVeiws+watchTime);
	}

}
