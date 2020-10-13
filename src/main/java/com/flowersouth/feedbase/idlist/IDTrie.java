package com.flowersouth.feedbase.idlist;

public class IDTrie {

    private TrieNode root;

    /**
     * caller ensure that id is legal
     *
     * @param id
     */
    public void append(String id) {
        char[] chars = id.toCharArray();
        TrieNode terminal = null;
        for (int i = 0; i < chars.length; i++) {
            terminal = root.getOrCreateChildNode(chars[i]);
        }
        terminal.setEnd();
    }

    public boolean contain(String id) {
        char[] chars = id.toCharArray();
        TrieNode current = root;
        for (int i = 0; i < chars.length; i++) {
            current = current.getChildNode(chars[i]);
            if (current == null) {
                return false;
            }
        }
        return current.isTerminal();
    }


    private static class TrieNode {
        char c;
        TrieNode[] children;
        boolean idEnd;

        public TrieNode(char c) {
            this.c = c;
        }

        private void setEnd() {
            idEnd = true;
        }

        private boolean isTerminal() {
            return idEnd;
        }

        private TrieNode getOrCreateChildNode(char c) {
            if (children == null) {
                createChildren();
            }
            int childIdx = IDChars.getCharIdx(c);
            TrieNode childNode = children[childIdx];
            if (childNode == null) {
                childNode = createChild(c, childIdx);
            }
            return childNode;
        }

        private TrieNode getChildNode(char c) {
            if (children == null) {
                return null;
            }
            int childIdx = IDChars.getCharIdx(c);
            TrieNode childNode = children[childIdx];
            return childNode;
        }

        private synchronized TrieNode createChild(char c, int childIdx) {
            if (children[childIdx] == null) {
                TrieNode trieNode = new TrieNode(c);
                children[childIdx] = trieNode;
                return trieNode;
            }
            return children[childIdx];
        }

        private synchronized void createChildren() {
            if (children == null) {
                children = new TrieNode[IDChars.LEGAL_CHAR_SIZE];
            }
        }
    }
}
