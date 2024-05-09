package com.drucare;

public class ConstructorOverLoaded {
	int id;
	String name;
	ConstructorOverLoaded(){
	}
	
	ConstructorOverLoaded(int id, String name){
		this.id=id;
		this.name=name;
	}
	ConstructorOverLoaded(int id){
		this.id=id;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverLoaded obj=new ConstructorOverLoaded();
	
	}

}
