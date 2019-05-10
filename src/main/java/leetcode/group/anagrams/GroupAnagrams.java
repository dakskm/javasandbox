package leetcode.group.anagrams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
  public static void main(String args[]) {
    String strs[] = {"cat", "dog", "tac", "god", "act"};
    System.out.println(groupAnagrams(strs));
  }

  public static ArrayList<ArrayList<String>> groupAnagrams(String strs[]) {
    ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();

    HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();

    for(String str: strs){
      char[] arr = new char[26];

      for(int i=0; i<str.length(); i++){
        arr[str.charAt(i)-'a']++;
      }

      String ns = new String(arr);

      if(map.containsKey(ns)){
        map.get(ns).add(str);
      }else{
        ArrayList<String> al = new ArrayList<String>();
        al.add(str);
        map.put(ns, al);
      }
    }

    result.addAll(map.values());

    return result;
  }
}
