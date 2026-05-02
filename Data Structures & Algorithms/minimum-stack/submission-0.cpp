class MinStack {
vector<int>st;
public:
 
    MinStack() {}
    
    //  for(int i=0;i<minStack.size();i++){
    //   if(minStack[i]=="MinStack"){
    //     vector<int>st;
    //   }
    //   else if(minStack[i]=="push"){
    //     push(minstack[i+1]);
    //     i++;
    //   }
    //   else if(minStack[i]=="pop"){
    //     pop();
    //     i++;
    //   }
    //   else if(minStack[i]=="getMin"){
    //     getMin();
    //     i++;
    //   }
    //    else if(minStack[i]=="top"){
    //     push();
    //     i++;
    //   }
    //  }
    //   }
    
    void push(int val) {
        st.push_back(val);
    }
    
    void pop() {
        st.pop_back();
    }
    
    int top() {
        return st.back();
    }
    
    int getMin() {
       int min=*min_element(st.begin(),st.end());
       return min;
    }
};
