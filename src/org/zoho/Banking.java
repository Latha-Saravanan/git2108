package org.zoho;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Banking {
	public static void main(String[] args) {
		Sample S=new Sample();
		S.setId(123);
		S.setName("RAM");
		
		Sample S2=new Sample();
		S2.setId(456);
		S2.setName("SAM");
				
//		int id = S2.getId();
//		System.out.println(id);
//		String name = S2.getName();
//		System.out.println(name);

		
//		List<Sample> L=new ArrayList();
//		L.add(S);
//		L.add(S2);
//		
//		for (int i = 0; i < L.size(); i++) {
//			
//			Sample Blue= L.get(i);
//			int id = Blue.getId();
//			System.out.println(id);
//			
//			String name = Blue.getName();
//			System.out.println(name);
//		}
		
		
//		Set<Sample> s =new LinkedHashSet();
//		s.add(S);
//		s.add(S2);
//		
//		for (Sample HI : s) {
//			
//			int id = HI.getId();
//			System.out.println(id);
//			
//			String name = HI.getName();
//			System.out.println(name);
//			}
		
		Map<Integer, Sample> M=new LinkedHashMap();
		M.put(10, S);
		M.put(20, S2);
		
		Set<Entry<Integer, Sample>> entrySet = M.entrySet();
		
		for (Entry<Integer, Sample> entry : entrySet) {
			Sample value = entry.getValue();
			int id = value.getId();
			System.out.println(id);
		 String name = value.getName();
		 System.out.println(name);
			
		}
		
		
		
		
		
		
		
		
}
}