package oops;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class CollectionFramework {
	
	
	public void setExample() {
		HashSet<String> names = new HashSet<String>();
		names.add("dan");
		names.add("tom");
		names.add("shirish");
		System.out.println(names);
		
	}

	public void MapExample() {
	/*	//SLL
		HashMap<String, String> john = new HashMap<String, String>();
		john.put("fn", "JOHN");
		john.put("ln",  "RAMBO");
		john.put("mobile", "123456");
		System.out.println(john);*/
		
		//DLL
		LinkedHashMap<String, String> john =new LinkedHashMap<String, String>();
		john.put("fn", "JOHN");
		john.put("ln",  "RAMBO");
		john.put("mobile", "123456");
		System.out.println(john);
	}
	public static void main(String[] args){
		CollectionFramework obj = new CollectionFramework();
		obj.setExample();
		obj.MapExample();
	}	
}

