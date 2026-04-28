class Solution {
public:

        int calPoints(vector<string>& operations) {
            vector<string>result;
            vector<string>stacks;
            for(int i=0; i<operations.size();i++){
                if(operations[i]=="+"&&stacks.size()>=2){
                   
                    int val1 = stoi(stacks[stacks.size()-1]);
                    int val2 = stoi(stacks[stacks.size()-2]);
                    int temp = val1 + val2;
                    stacks.push_back(to_string(temp));
                }
                else if(operations[i]=="C"&&stacks.size()>0){
                    stacks.pop_back();
                }
                else if(operations[i]=="D"&&stacks.size()>0){
                    int val = stoi(stacks.back());
                    int temp = 2 * val;
                    stacks.push_back(to_string(temp));

                }
               else if(operations[i]!="D"&&operations[i]!="C"&&operations[i]!="+"){
                stacks.push_back(operations[i]);
               }
            }
            int res=0;
            for(int i=0;i<stacks.size();i++){
                int val = stoi(stacks[i]);  // convert string to int
                res += val;

            }
            
            
            return res;


    }
};




            