class Solution {
public:
    bool isValid(string s) {
        vector<char>stacks;
        bool result=true;
        for(int i=0;i<s.size();i++){
           char top;
           if(s[i]=='['||s[i]=='{'||s[i]=='('){
            stacks.push_back(s[i]);
            top=stacks.back();
        }
        else if(s[i]==']'&&top=='['){
            stacks.push_back(s[i]);
            
                stacks.pop_back();
                stacks.pop_back();
                top=stacks.back();
            }
        else if(s[i]==')'&&top=='('){
            stacks.push_back(s[i]);
           
                 stacks.pop_back();
                stacks.pop_back();
                top=stacks.back();
            }
        else if(s[i]=='}'&&top=='{'){
            stacks.push_back(s[i]);
            
                 stacks.pop_back();
                stacks.pop_back();
                top=stacks.back();
            }
        else{
            result=false;
        }
        }
       if(stacks.size()>0){
         result=false;
       }
        return result;
        }
};

        
    
    