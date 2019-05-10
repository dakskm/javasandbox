package leetcode.medium.trie.problem1;

public class TrieTest {
  public static void main(String args[]) {
    TrieNodeOperations trie = new TrieNodeOperations();

    trie.insert("Apple");
    trie.insert("Almond");
    trie.insert("Alright");
    trie.insert("Applet");

    System.out.println(trie.search("Apple"));
  }
}
