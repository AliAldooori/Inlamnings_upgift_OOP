package inlämnings_upgift_oop;

public class Papegoje extends Pet {
	
	boolean isFly ;
	
	
 public boolean isFly() {
		return isFly;
	}

	public void setFly(boolean isFly) {
		this.isFly = isFly;
	}

public Papegoje(String name, String color, String sound, int age, double price, boolean isFly) {
		super(name, color, sound, age, price);
		this.isFly = isFly;
	}

@Override
	public void PetSound() {
	System.out.println("speeck");
		
	}

	

}
