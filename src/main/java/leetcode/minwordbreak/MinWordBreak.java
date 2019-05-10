package leetcode.minwordbreak;

public class MinWordBreak {
  public static void main(String args[]) {
    String keys[] = {"cat", "mat", "ca", "ma",
            "at", "c", "dog", "og", "do" };

    Trie trie = new Trie();

    // Construct trie

    int i;
    for (i = 0; i < keys.length ; i++)
      trie.insert(keys[i]);

    trie.minWordBreak("catmatat");

    System.out.println(trie.minWordBreak);
  }
}
