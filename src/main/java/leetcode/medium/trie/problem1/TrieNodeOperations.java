package leetcode.medium.trie.problem1;

import java.util.HashMap;
import java.util.HashSet;

public class TrieNodeOperations {
  public TrieNode root;

  public TrieNodeOperations() {
    root = new TrieNode();
  }

  public void insert(String word) {
    HashMap<Character, TrieNode> children = root.children;

    for (int i = 0; i < word.length(); i++) {
      char c = word.charAt(i);

      TrieNode t = null;
      if (children.containsKey(c)) {
        t = children.get(c);
      } else {
        t = new TrieNode(c);
        children.put(c, t);
      }
      children = t.children;

      if(i == word.length() - 1)
        t.isLeaf = true;
    }
  }

  public boolean search(String word) {
    TrieNode t = searchNode(word);

    if(t!=null && t.isLeaf)
      return true;

    return false;
  }

  public TrieNode searchNode(String word) {
    int len = word.length();
    HashMap<Character, TrieNode> children = root.children;
    TrieNode t = null;

    for (int i = 0; i < len; i++) {
      char c = word.charAt(i);
      if (children.containsKey(c)) {
        t = children.get(c);
        children = t.children;
      } else {
        return null;
      }
    }
    return t;
  }
}
