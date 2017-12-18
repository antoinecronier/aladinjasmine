package aladinjasmine;

import java.util.ArrayList;

public class AppleField {
	private ArrayList<Apple> apples;

	public ArrayList<Apple> getApples() {
		return apples;
	}
	
	public AppleField(ArrayList<Apple> apples){
		this.apples = apples;
	}
	
	public AppleField(int apple_nb){
		this.apples = new ArrayList<Apple>();
		for (int i = 0; i < apple_nb; i++) {
			this.apples.add(new Apple());
		}
	}
	
	public void TakeApple(People people, int nb_apple){
		if (this.apples.size() - nb_apple + 1 > 0) {
			
			ArrayList<Apple> list = new ArrayList<Apple>();
			
			list.addAll(this.apples.subList(0, nb_apple));
			
			people.getBag().addAll(list);
			
			this.apples.removeAll(list);
			
		}else {
			System.out.println("Cannot take it");
		}
	}
}
