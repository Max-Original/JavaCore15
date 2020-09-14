package javacore15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class practise {
public static void main(String[] args) {
	
		Map<String, List<Person>> map = new HashMap<>();
		
		//create new group
		
		map.put("Group-1", new ArrayList<>());
		map.put("Group-2", new ArrayList<>());
		map.put("Group-3", new ArrayList<>());
		
		System.out.println(map);
		
		//add person to group
		
		Person petro = new Person("Petro", 25);
		
		//group-2
		
		Iterator<Entry<String, List<Person>>> iterator = map.entrySet().iterator();
		
		while(iterator.hasNext()) {
			Entry<String, List<Person>> next = iterator.next();
			if(next.getKey().equals("Group-1")) {
				List<Person> value = next.getValue();
				value.add(petro);
				next.setValue(value);
			}
		}
		System.out.println(map);
}
}
