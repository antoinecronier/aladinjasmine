package aladinjasmine;

public class Main {

	public static void main(String[] args) {
		People aladin = new People(Sex.male);
		People jasmine = new People(Sex.female);

		AppleField apple_field = new AppleField(100);
		apple_field.TakeApple(aladin, 100);
		apple_field.TakeApple(jasmine, 10);

		if (aladin.getName().equals("Aladin")) {
			System.out.println("aladin is aladin");
		}else {
			System.out.println("aladin is not aladin");
		}

		if (aladin.getName() == "Aladin") {
			System.out.println("aladin is aladin");
		}else {
			System.out.println("aladin is not aladin");
		}

		aladin.PrintBase();
		jasmine.PrintBase();

		aladin.GiveApple(jasmine.getBag(), 90);

		aladin.PrintBase2();
		jasmine.PrintBase2();

		Apple myApple = new Apple();
		myApple.setWeight(15);
		myApple.Print();

		aladin.Print();
	}

}
