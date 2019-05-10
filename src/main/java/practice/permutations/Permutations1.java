package practice.permutations;

public class Permutations1 {
  public static void main(String args[]) {
    String s = "ABCD";
//    permute(s, 0, s.length() - 1);

    String strs[] = {"Dak", "Sowju", "Ram", "Nandu"};
//    strs = swapStrings(strs, 0, strs.length - 1);
//    for (String str : strs)
//      System.out.println(str);
    permuteWords(strs, 0, strs.length - 1);
  }

  public static void permute(String str, int l, int r) {
    if (l == r)
      System.out.println(str);
    else {
      for (int i = l; i <= r; i++) {
        str = swap(str, l, i);
        permute(str, l + 1, r);
        str = swap(str, l, i);
      }
    }
  }

  public static String swap(String s, int l, int r) {
    char[] chars = s.toCharArray();
    char temp = chars[l];
    chars[l] = chars[r];
    chars[r] = temp;
    return new String(chars);
  }

  public static void permuteWords(String[] strs, int l, int r) {
    if (l == r) {
      for(int i = 1; i <= strs.length;i++) {
        System.out.print(strs[i-1]);
        if(i % 4 == 0)
          System.out.println();
      }
    } else {
      for(int i = l; i<=r; i++) {
        strs = swapStrings(strs, l, i);
        permuteWords(strs, l + 1, r);
        strs = swapStrings(strs, l, i);
      }
    }
  }

  public static String[] swapStrings(String[] strs, int l, int r) {
    String temp = strs[l];
    strs[l] = strs[r];
    strs[r] = temp;
    return strs;
  }

}
