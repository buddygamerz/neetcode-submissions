class Solution {
public:
    int countStudents(vector<int>& students, vector<int>& sandwiches) {
    int rotation=0;
    while(!students.empty()&&!sandwiches.empty()){
        if(students[0]==sandwiches[0]){
            sandwiches.erase(sandwiches.begin());
            students.erase(students.begin());
            rotation=0;
        }
        else{
           int temp=students.front();
           students.erase(students.begin());
           students.insert(students.end(), temp);
           rotation++;
           if(rotation==students.size()){
        break;}
        }
        
    }                                                                                          
    int output=students.size();
    return output;

    }
};