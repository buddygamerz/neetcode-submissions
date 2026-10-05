class node{
    private 
        node[] children;
        String word;
    public node(){
        children =new node[26];
        word=null;
    }

}

class Solution {
    private node root=new node();
    List<String> result = new ArrayList<>();
    public List<String> findWords(char[][] board, String[] words) {
        for(int i=0;i<words.length;i++){
            insert(words[i]);}
      for (int i = 0; i < board.length; i++) {
        for (int j = 0; j < board[0].length; j++) {
            dfs(board, i, j, root);
        }
    }

    return result;
}
    public void insert(String word){
        node current=root;
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            int index=c-'a';
            if(current.children[index]==null){
                current.children[index]=new node();
            }
            current=current.children[index];
        }
        current.word=word;
    }
    public void dfs(char[][]board,int row,int col,node current){
      
        if(row>=board.length||row<0||col>=board[0].length||col<0){
            return;
        }
        if(board[row][col]=='#'){
            return;
        }
        char c=board[row][col];
        node next=current.children[c-'a'];
        if(next==null){
            return;
        }
          
        if(next.word!=null){
            result.add(next.word);
            next.word=null;
        }
        char original=board[row][col];
        board[row][col]='#';
        dfs(board,row+1,col,next);dfs(board,row,col+1,next);dfs(board,row-1,col,next);dfs(board,row,col-1,next);
        board[row][col]=original;
       
    }
}
