public class Driver{
	public static void main(String[] args){
		Cat cat  = new Cat("Jerry");
		Cat cat2 = new Cat();
		Cat cat3 = new Cat("Theo", 6);
		System.out.println(cat.name);  // Jerry
		System.out.println(cat.getAge());
		System.out.println(cat2.name); // Tom
		System.out.println(cat2.getAge());
		System.out.println(cat3.name); // Theo
		System.out.println(cat3.getAge());
	}
}
