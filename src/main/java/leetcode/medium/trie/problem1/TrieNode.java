package leetcode.medium.trie.problem1;

import java.util.HashMap;

public class TrieNode {
  char c;
  boolean isLeaf = false;
  HashMap<Character, TrieNode> children = new HashMap<Character, TrieNode>();

  public TrieNode() {}

  public TrieNode(char c) {
    this.c = c;
  }
}
