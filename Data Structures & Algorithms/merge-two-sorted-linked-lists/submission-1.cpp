/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */

class Solution {
public:
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
        vector<int>stacks;
        ListNode* cur1=list1;
        ListNode* cur2=list2;
        if(list1==nullptr&&list2==nullptr){
            return list1;
        }
        while(cur1!=NULL){
            stacks.push_back(cur1->val);
            cur1=cur1->next;
        }
        while(cur2!=NULL){
            stacks.push_back(cur2->val);
            cur2=cur2->next;
        }
        sort(stacks.begin(),stacks.end());
        ListNode*head=nullptr;
        ListNode*tail=head;
        for(int i=0;i<=stacks.size()-1;i++){
            ListNode* num= new ListNode;
            num->val=stacks[i];
            if(head==nullptr){
                head=num;
                tail=num;
            }
            tail->next=num;
            num->next=nullptr;
            tail=num;
        
        }
        return head;
    }
};
