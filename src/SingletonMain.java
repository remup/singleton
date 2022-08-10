import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class SingletonMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		String name = "ABCABADB";
		int count1=1;
		int maxcount=0;
		char element1='n';
		String s22=null;
		if(null==s22) {
			System.out.println("tesss");
		}
//		for(int i =0;i<name.length();i++) {
//			for(int j =i+1;j<name.length();j++)
//			{
//				if(name.charAt(i)==name.charAt(j)) {
//					count1++;
//				}
//			}
//			if(maxcount<count1) {
//				maxcount=count1;
//				element1=name.charAt(i);
//			}
//		}
//		System.out.println("max char "+element1+" "+maxcount);
		HashMap<String, Integer> stringMap = new HashMap<>();
		
		for(int i =0;i<name.length();i++) {
			if(stringMap.containsKey(Character.toString(name.charAt(i)))) {
				stringMap.put(Character.toString(name.charAt(i)), stringMap.get(Character.toString(name.charAt(i)))+1);
			}
			else {
				stringMap.put(Character.toString(name.charAt(i)), 1);
			}
		}
		System.out.println("test  "+stringMap);
		
		System.out.println(stringMap.entrySet().stream().max((a,b)->a.getValue().compareTo(b.getValue())).get());
	
		String original = "12345";
		String reverse ="";
		
		for (int i=original.length()-1;i>=0;i--)
		{
			reverse= reverse+original.charAt(i);
		}
		System.out.println("reversed string"+reverse);
		
		
		System.out.println("hii");
		SingletonClass s = SingletonClass.getInstance();
		// System.out.println(s.toString());
		System.out.println(s);
		Department d = new Department(1, "Acc");
		ImmutableClass i = new ImmutableClass("remya", 55, d);
		i.getDep().setDepName("AccNew");

		System.out.println(d);
		System.out.println(i);

		testLoop();

		int arr[] = { 10, 20, 20, 30, 30, 40, 50, 50 };
		String stringArray[] = {"remya","remya","reshmi" };
		
		//String[] stringArr2=(String[]) Arrays.stream(stringArray).distinct().toArray();

		List<Integer> arr2 = Arrays.stream(arr).distinct().boxed().collect(Collectors.toList());
		int arr3[] = Arrays.stream(arr).distinct().boxed().mapToInt(Integer::intValue).toArray();
		arr2.forEach(c -> System.out.println(c));
		System.out.println("======================================");
		for (int j : arr3) {
			System.out.println(j);
		}
		TreeMap<Integer,Integer> treemap = new TreeMap<>();
		
		for(int r=0;r<arr.length;r++) {
			if(treemap.containsKey(arr[r])) {
				treemap.put(arr[r], treemap.get(arr[r])+1);
			}
			else {
				treemap.put(arr[r], 1);
			}
		}
		
		System.out.println("maximum "+treemap);
		System.out.println("maximum "+treemap.entrySet().toArray()[0]);
		
		Integer value = Collections.max(treemap.values());
		Iterator<Map.Entry<Integer, Integer>> entries = treemap.entrySet().iterator();
		 int maxCount = 0;
		 HashMap<Integer, Integer> maxCountEle = new HashMap<Integer,Integer>();
		 while(entries.hasNext()){
		 Map.Entry<Integer,Integer> entry = entries.next();
		 if(entry.getValue()==value) {
			 maxCountEle.put(entry.getKey(), entry.getValue());
		 }
		 
		 }
		 maxCountEle.forEach((key1,value1)->{
			 System.out.println("max count"+" "+key1+" "+value1)
		 ;});
		 
		int[] temp = new int[arr.length];
		int[] temp2 = new int[arr.length];
		int d2 = 0;
		for (int k =  arr.length-1; k>=0 ; k--) {
				temp2[d2++]= arr[k];
		}
		
		for (int arrNew2 : temp2) {

			System.out.println("reveresed  "+arrNew2);
		}
		
		int j = 0;
		for (int k = 0; k < arr.length - 1; k++) {

			if (arr[k] != arr[k + 1]) {
				temp[j++] = arr[k];
			}
			if (arr[k] == arr[k + 1]) {
				System.out.println("duplicate "+arr[k]);
			}

		}
		temp[j++] = arr[arr.length - 1];
		System.out.println("======================================");
		for (int tempNew : temp) {

			System.out.println(tempNew);
		}

		for (int p = 0; p < j; p++) {
			if(temp[p]!=0)
			arr[p] = temp[p];
		}
		System.out.println("======================================");
		for (int arrNew : arr) {

			System.out.println(arrNew);
		}

	}

	public static void testLoop() {
		System.out.println("test");
		// if(2==1)
		// return;
		System.out.println("test2");
		int number = 6;

		switch (number) {
		case 1:
			System.out.println("case1");
			break;
		case 2:
			System.out.println("case2");
			break;
		case 3:
			System.out.println("case3");
			break;
		case 4:
			System.out.println("case4");
			break;
		default:
			System.out.println("case ");
		}
	}

}
