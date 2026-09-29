class PrefixTree {
    PrefixTree[] children;
    boolean isEndOfWord;

    public PrefixTree() {
        children = new PrefixTree[26]; // 0 = 'a', 1 = 'b', ..., 25 = 'z'
        isEndOfWord = false;
    }

    public void insert(String word) {
        PrefixTree current = this;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int index = c - 'a';
            if (current.children[index] == null) {
                current.children[index] = new PrefixTree();
            }
            current = current.children[index];
        }
        current.isEndOfWord = true;
    }

    public boolean search(String word) {
        PrefixTree current = this;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int index = c - 'a';
            if (current.children[index] == null) {
                return false;
            }
            current = current.children[index];
        }
        return current.isEndOfWord;
    }

    public boolean startsWith(String prefix) {
        PrefixTree current = this;
        for (int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            int index = c - 'a';
            if (current.children[index] == null) {
                return false;
            }
            current = current.children[index];
        }
        return true;
    }
}
