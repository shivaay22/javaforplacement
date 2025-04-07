// package trie;

public class class1 {
    Node root;

    class Node {
        Node[] children = new Node[26];
        boolean ans;

        Node() {
            for (int i = 0; i < 26; i++) {
                this.children[i] = null;
            }
            this.ans = false; 
        }
    }

    class1() {
        this.root = new Node(); 
    }

    public void insert(String s) {
        int index, len = s.length();
        Node temp = root;
        for (int level = 0; level < len; level++) {
            index = s.charAt(level) - 'a';
            if (temp.children[index] == null) {
                temp.children[index] = new Node();
            }
            temp = temp.children[index];
        }
        temp.ans = true;
    }

    public boolean search(String s)
    {
        int index,len = s.length();
        Node temp = root;
        for(int level = 0;level<len;level++)
        {
            index = s.charAt(level) - 'a';
            if(temp.children[index] == null)
            {
                return false; 
            }
            temp = temp.children[index];
        }
        return temp.ans;
    }



    public static void main(String[] args) {
        class1 c1 = new class1();
        c1.insert("hello"); // Example usage
    }
}
