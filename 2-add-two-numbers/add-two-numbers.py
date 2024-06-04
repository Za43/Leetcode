# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        carry = 0
        ret = ListNode(0)
        head = ret
        while (l1 != None or l2 != None):
            if l1 == None:
                x = 0
            else: 
                x = l1.val
                l1=l1.next
            if l2 == None:
                y = 0
            else: 
                y = l2.val
                l2=l2.next
            ret.next = ListNode((x + y + carry) % 10)
            ret = ret.next
            carry = (x + y + carry)//10
        if carry != 0:
            ret.next = ListNode(carry)
        return head.next