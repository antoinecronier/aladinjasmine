package aladinjasmine;

import java.util.Random;

public class Apple {
	private int weight;
	private Color color;
	private int size;

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		if (weight <= 10 && weight > 0) {
			this.weight = weight;
		}
	}

	public Color getColor() {
		return color;
	}

	public int getSize() {
		return size;
	}

	public Apple(int weight, Color color, int size) {
		super();
		this.weight = weight;
		this.color = color;
		this.size = size;
	}

	public Apple() {
		this.weight = Rand(10, 30);
		this.color = Color.values()[Rand(0,4)];
		this.size = Rand(5, 14);
	}

	private int Rand(int min, int max){
		Random rand = new Random();
		return rand.nextInt(max - min + 1) + min;
	}

	public void Print() {
		System.out.println("	Weight : " + this.weight);
		System.out.println("	Color : " + this.color);
		System.out.println("	Size : " + this.size);
	}
}
