package leetcode.group.anagrams;

import java.util.ArrayList;
import java.util.HashMap;

public class GroupAnagrams1 {
  public static void main(String args[]) {
    String strs[] = {"cat", "dog", "tac", "god", "act"};
    System.out.println(groupAnagrams1(strs));
  }

  public static ArrayList<ArrayList<String>> groupAnagrams1(String strs[]) {

    ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();

    HashMap<String, ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();

    for(String str: strs) {
      char arr[] = new char[26];

      for(int i = 0; i < str.length(); i++) {
        arr[str.charAt(i) - 'a']++;
      }

      String ns = new String(arr);

      if(!hm.containsKey(ns)) {
        ArrayList<String> al = new ArrayList<>();
        al.add(str);
        hm.put(ns, al);
      } else {
        hm.get(ns).add(str);
      }
    }

    result.addAll(hm.values());

    return result;
  }
}
