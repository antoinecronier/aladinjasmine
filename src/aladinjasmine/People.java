package aladinjasmine;

import java.util.ArrayList;

public class People {
	private String name;
	private Sex sex;
	private ArrayList<Apple> bag;
	
	public String getName() {
		return name;
	}

	public Sex getSex() {
		return sex;
	}

	public ArrayList<Apple> getBag() {
		return bag;
	}

	public People(String name, Sex sex,
			ArrayList<Apple> bag) {
		this.name = name;
		this.sex = sex;
		this.bag = bag;
	}
	
	public People() {
	}
	
	public People(Sex sex) {
		this.sex = sex;
		
		if (sex == Sex.male) {
			this.name = "Aladin";
			this.bag = new ArrayList<Apple>();
			
		}else if (sex == Sex.female) {
			this.name = "Jasmine";
			this.bag = new ArrayList<Apple>();
		}
	}
	
	public void Print(){
		System.out.println("Name : " + this.name);
		System.out.println("Apple List : ");
		System.out.println("Apple Number : " + this.bag.size());
		for (Apple apple : bag) {
			apple.Print();
		}
		System.out.println("____________________________________");
	}
	
	public void PrintBase(){
		System.out.println("Name : " + this.name);
		System.out.println("Apple Number : " + this.bag.size());
		System.out.println("____________________________________");
	}
	
	public void PrintBase2(){
		System.out.println("Name : " + this.name);
		
		int black = 0;
		int white = 0;
		int red = 0;
		int green = 0;
		int yellow = 0;
		for (Apple apple : bag) {
			switch (apple.getColor()) {
			case white:
				white++;
				break;
			case black:
				black++;
				break;
			case green:
				green++;
				break;
			case red:
				red++;
				break;
			case yellow:
				yellow++;
				break;

			default:
				break;
			}
		}
		System.out.println("Apple Number white : " + white);
		System.out.println("Apple Number black : " + black);
		System.out.println("Apple Number red : " + red);
		System.out.println("Apple Number green : " + green);
		System.out.println("Apple Number yellow : " + yellow);
		System.out.println("____________________________");
	}
	
	public void GiveApple(ArrayList<Apple> bag, int apple_nb){
		if (apple_nb > 0 && this.bag.size() - apple_nb > 0) {
			for (int i = 0; i < apple_nb; i++) {
				bag.add(this.bag.get(0));
				this.bag.remove(0);
			}
		}else {
			System.out.println("Cannot give it");
		}
		
	}
}
