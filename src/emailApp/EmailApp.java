package emailApp;

public class EmailApp {

	public static void main(String[] args) {
		
		Email person1 = new Email("Chukwuma", "Idemili");
		
		person1.setAlternateEmail("chuks@gmail.com");
		System.out.println("Alternate email: "+person1.getAlternateEmail());
		System.out.println(person1.showInfo());
		
	}

}
