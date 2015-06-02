package relearning;

public class Cat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat kitty1 = new Cat("Rocko"); //creates a cat with name parameter "Rocko"
		//and assigns it to mCatName
		Cat kitty2 = new Cat("Baby Girl");
		//kitty1.getName(); 
		//kitty2.getName();
		kitty1.printName(); //calls printName method on kitty1 object
		kitty2.printName();
		Cat.printNumberOfCats(); //calls static method on class variable
		//(static field) numberOfCats
	}
	
	public String mCatName; //instance variable(each obj. of the 
	//class has its own value for this variable)
	
	public static int numberOfCats = 0; //class variable(not related to an instance of a class
	//but to the whole class)
	
	
	public Cat(String name) { //constructor--tells us how to create a cat
		mCatName=name;  
		numberOfCats++; //increases the numberOfCats by 1 for each
		//cat object instantiated
	}
	
	public String getName() { //method that returns the name
		return mCatName;
	};
	
	public void printName() { //method that prints the name
		System.out.println(mCatName);
	}
	
	public void setName(String strName) {
		mCatName = strName;
	};
	
	public static void printNumberOfCats() {
		System.out.println(numberOfCats);
	}

}
