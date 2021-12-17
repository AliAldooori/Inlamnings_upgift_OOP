package inlämnings_upgift_oop;

public class Hund extends Pet {

	int storlek ;

	public Hund(String name, String color, String sound, int age, double price, int storlek) {
		super(name, color, sound, age, price);
		this.storlek = storlek;
	}

	@Override
	public String toString() {
		return "Hund [storlek=" + storlek + ", name=" + name + ", color=" + color + ", sound=" + sound + ", age=" + age
				+ ", price=" + price + "]";
	}

	@Override
	public void PetSound() {
		System.out.println("parrk parrk");		
	}

	public int getStorlek() {
		return storlek;
	}

	public void setStorlek(int storlek) {
		this.storlek = storlek;
	}
	
	
}
