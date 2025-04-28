package Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
public static void main(String[] args) {
	
	ArrayList al = new ArrayList();
	ArrayList a= new ArrayList();
	
    al.add(0);
	al.add(1);
	al.add(2);
	
	a.add(al);
	
	for (List object : a) {
		for (List l : object) {
			
		}
	}

	for (int i=0; i<a.size(); i++) {
		//System.out.println(a.get(i));
		

		for (int j=i; j<al.size(); j++) {
			System.out.println(al.get(j));
		
		}

	}
	
	
}
}


