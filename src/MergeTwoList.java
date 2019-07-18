/**
 * created by Zheng Jiateng on 2019/7/18.
 */

import base.ListNode;

/**
 * 合并两个排序的链表
 * cur = cur.next;别忘了
 */
public class MergeTwoList {
    public ListNode Merge(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                cur.next = list1;
                list1 = list1.next;
                cur = cur.next; // 这一行别忘了
            } else{
                cur.next = list2;
                list2 = list2.next;
                cur = cur.next;
            }
        }
        cur.next = list1 == null ? list2 : list1;
        return dummy.next;
    }
}
