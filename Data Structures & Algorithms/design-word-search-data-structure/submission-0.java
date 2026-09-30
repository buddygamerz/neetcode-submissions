class node{
    node[] children;
    boolean end;
    public node(){
        children= new node[26];
        end=false;
    } 
}
class WordDictionary {
    private node root;
    public WordDictionary() {
        root=new node();
    }

    public void addWord(String word) {
        node current=root;
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            int index=c-'a';
            if(current.children[index]==null){
                current.children[index]=new node();
            }
            current=current.children[index];
        }
        current.end=true;
    }

    public boolean search(String word) {
        return dfs(0,word,root);
    }
    public boolean dfs(int index,String word,node curr){
        if(index==word.length()){
            return curr.end;
        }
        char c=word.charAt(index);
        if(c=='.'){
            for(int i=0;i<26;i++){
                if(curr.children[i]!=null){
                    if (dfs(index+1,word,curr.children[i])){
                        return true;
                    }
                }
            }
            return false;
        }
        else{
                int targetslot=c-'a';
           
                if(curr.children[targetslot]==null){
                    return false;
                }
                return dfs(index+1,word,curr.children[targetslot]);
        }
      
        }
        
    }

