package leetcode.minwordbreak;

public class TrieNode {
  boolean endOfTree;
  TrieNode children[] = new TrieNode[26];

  TrieNode() {
    endOfTree = false;
    for (int i = 0; i < 26; i++) {
      children[i] = null;
    }
  }
}
