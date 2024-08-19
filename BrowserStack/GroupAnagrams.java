import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class GroupAnagrams {
	public static ArrayList<ArrayList<String>> groupAnagramsTogether(ArrayList<String> strList) {
		// Write your code here.
		HashMap<String,ArrayList<String>> map=new HashMap<>();

		for(int i=0;i<strList.size();i++){
			char[] a=strList.get(i).toCharArray();

			Arrays.sort(a);

			String key=new String(a);

			if(map.containsKey(key)){
				ArrayList<String> list=map.get(key);
				list.add(strList.get(i));
				map.put(key,list);
			}else{
				ArrayList<String> list=new ArrayList<>();
				list.add(strList.get(i));
				map.put(key,list);
			}
		}

		ArrayList<ArrayList<String>> ans=new ArrayList<>();

		for(Map.Entry<String,ArrayList<String>> entry: map.entrySet()){
			ans.add(entry.getValue());
		}

		return ans;
	}
}