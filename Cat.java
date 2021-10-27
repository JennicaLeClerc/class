// Access Modifiers
//		global    package    subclass    class
// public       x         x          x           x
// default                x          x           x
// protected                         x           x
// private                                       x

public class Cat{ //class delaration
	String name = "Tom";
	double weight = 15;
	private int age = 22;
	String breed = "American Shorthair";
	boolean isFixed = false;
	boolean isChipped = false;
	String owner;
	String color = "Blue/Grey";

	/*public static void main(String[] args){
		Cat newCat = new Cat(); //object instantiation 
		Cat newCat1; // object declaration

		newCat1 = newCat; // object assignment
		System.out.println("age: " + newCat.age);
		newCat1.sleep();
		//System.out.println("age: " + newCat.age); // just added this line to the sleep command

		newCat.eat();
		newCat.eat();
		System.out.println("Cat ate a bit... \n" + "New Weight:  " + newCat.weight + " lbs");
	}*/
	
	// method overloading -- This allows you to keep the Cat() that doesn't have a pointer
	public Cat(){
	}

	public Cat(String name){
		this.name = name;
	}

	// When you overload the different classes with the same name cannot contain all the same objects in the same order
	public Cat(String name, int age){
		this.name = name;
		this.age = age;
	}

	public int getAge(){
		return this.age;
	}

	public String getName(){
		return this.name;
	}

	public double getWeight(){
		return this.weight;
	}

	public void setAge(int age){
		this.age = age;
	}

	public void walk(){
		System.out.println("Walking.");
		this.weight -= .1;
	}

	public void eat(){
		System.out.println("Devouring tuna.");
		this.weight += .1;
	}

	public String meow(){
		return "Woof";
	}

	public int attack(){
		return 100;
	}

	public void sleep(){
		this.age = this.age + 1;
		System.out.println("age after sleep: " + this.age);
	}

	public Cat breed(){
		Cat newCat = new Cat(); 
		return newCat;
	} 

	public void copyCat(Cat catToCopy){
		this.name = catToCopy.getName();
	}
}
