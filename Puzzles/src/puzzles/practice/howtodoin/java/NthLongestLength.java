package puzzles.practice.howtodoin.java;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class NthLongestLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = new ArrayList();
		names.add("Yuri");
		names.add("Ron");
		names.add("Interview");
		names.add("Longest");
		names.add("List");
		names.add("Contain");

		TreeMap<Integer, List<String>> longest = new TreeMap<>();
		
		names.stream().forEach(inp -> {
			
			if(inp.length()<1)
			{
				System.out.println("null");
			}
			else
			{
				List<String> temporary = longest.get(inp.length())!=null ? longest.get(inp.length()) : new ArrayList<>();
			//							 check length of present element   return if that length       create new list
			//							 in map.						   string present		
				temporary.add(inp);
			//	add that string in List
				longest.put(inp.length(), temporary);				
			}
		});
		
		longest.forEach((key, value) -> System.out.println(key + ":" + value));
	}

}
