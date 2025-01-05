package com.polymorphism;

public class testallshapes {

	public static void main(String[] args) {
		
		shapeoperation so=new shapeoperation();
		circle c1=new circle();
		so.triggerAllmethods(c1);
		
		rectangle r1=new rectangle();
		so.triggerAllmethods(r1);
		
		sequre s1=new sequre();
		so.triggerAllmethods(s1);

	}

}
