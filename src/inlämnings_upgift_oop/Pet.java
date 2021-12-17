package inlämnings_upgift_oop;

public abstract class Pet implements Comparable<Pet>  {
	

	String name ;
	
	@Override
	public int compareTo(Pet o) {
		
		 int x= this.name.compareTo(o.name);
		
		
		return x;
	}

	String color ;
	
	String sound ;
	
	int age ;
	
	double price ;

	public Pet(String name, String color, String sound, int age, double price) {
	
		this.name = name;
		this.color = color;
		this.sound = sound;
		this.age = age;
		this.price = price;
	}






	@Override
	public String toString() {
		return "Pet [name=" + name + ", color=" + color + ", sound=" + sound + ", age=" + age + ", price=" + price
				+ "]";
	}
	
	public abstract void PetSound ();
	
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	

}
