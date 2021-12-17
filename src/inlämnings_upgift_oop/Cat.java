package inlämnings_upgift_oop;

public class Cat extends Pet{
	
	boolean isHair ;

	public Cat(String name, String color, String sound, int age, double price, boolean isHair) {
		super(name, color, sound, age, price);
		this.isHair = isHair;
	}

	public boolean isHair() {
		return isHair;
	}

	public void setHair(boolean isHair) {
		this.isHair = isHair;
	}

	@Override
	public void PetSound() {
		
		System.out.println("miao");
	}
	
	

}
