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
    ListNode* reverseList(ListNode* head) {
        ListNode* prev=NULL;
        ListNode* curr=head;
        while(curr!=NULL)
        {
            ListNode* temp=curr->next;
            curr->next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        ListNode* a=reverseList(l1);
        ListNode* b=reverseList(l2);
        ListNode* head1=a;
        ListNode* head2=b;
        ListNode* ans=new ListNode(-1);
        ListNode* temp=ans;
        int c=0;
        while(head1!=NULL || head2!=NULL || c>0)
        {
            int sum=0;
            if(head1!=NULL)
            {
                sum+=head1->val;
                head1=head1->next;
            }
            if(head2!=NULL)
            {
                sum+=head2->val;
                head2=head2->next;
            }
            sum+=c;
            c=sum/10;
            sum%=10;
            ListNode* dummy=new ListNode(sum);
            temp->next=dummy;
            temp=temp->next;
        }
        return reverseList(ans->next);
    }
};