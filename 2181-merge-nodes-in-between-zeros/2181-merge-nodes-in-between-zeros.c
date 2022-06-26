/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


struct ListNode* mergeNodes(struct ListNode* head){
  struct ListNode* curr=head;
   struct ListNode* temp=head->next;
    if(head==NULL)
        return NULL;
    while(temp!=NULL)
    {
        if(temp->val!=0 && temp!=curr)
        {
            curr->val+=temp->val;
            
        }
        else
        {   curr->next=temp->next;
            curr=temp->next;
         temp=temp->next;
        }
        if(temp==NULL)
            break;
        temp=temp->next;
    }
    return head;
}