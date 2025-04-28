package Inheritance;

public class Test {
	
	public static void main(String[] args) {
		
	// Tree t = new Tree();
	// t.leaves();
	// t.fruits();
	//t.flowers();
		
	Leaves le = new Leaves();
	le.chlophil();
	le.photosynthesis();
	le.flowers();
	
	Fruits f = new Fruits();
	f.fruits();
	f.leaves();
	f.flowers();
	f.water();
	f.nutrition();
	
	Flowers fe = new Flowers();
	fe.flowers();
	fe.lily();
	fe.rose();
	fe.leaves();  // method call from parent class which is tree
	fe.fruits();
	
	
	
	
	
	
	
	

	
	}

}
