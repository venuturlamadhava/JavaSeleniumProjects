package day18;

class Animal{}

class Dog extends Animal{}
class Cat extends Animal{}

public class TypeCastingObject2 {

	public static void main(String[] args) {
		
		
		//Rule1: conversion is valid or not
		//Animal an=new Dog();
		//Cat ct=(Cat) an;		//valid per rule1
		
		//Dog dg=new Dog();
		//Cat ct=(Cat) dg;		//As per rule1
		
		
		//Rule 2-Assignment is valid or not
		
		//Animal an=new Dog();	//valid as per rule2
		//Cat ct=(Cat) an;		
		
		
		//Animal an=new Dog();
		//Cat ct=(Cat) Dog;	//Invalid as per rule2
		
		
		
	}

}
