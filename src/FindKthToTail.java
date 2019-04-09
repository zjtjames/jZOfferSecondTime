/**
 * created by Zheng Jiateng on 2019/4/9.
 */

import base.ListNode;

/**
 * 链表中倒数第k个结点: 用两个指针 第一个指针先走k-1步 然后两个指针再一起走,期间两个指针距离保持在k-1，当第一个到尾时，第二个即指向倒数第k个
 * 注意鲁棒性:如果k比结点数量还大，则在ahead一开始走k-1步时，就会出现ahead.next == null的情况
 *
 * 输入一个链表，输出该链表中倒数第k个结点。
 */
public class FindKthToTail {
    public ListNode FindKthToTail(ListNode head, int k) {
        if (head == null || k < 1) {
            return null;
        }
        ListNode ahead = head;
        ListNode behind = head;
        for (int i = 0; i < k - 1; i++) {
            if (ahead.next == null) {
                return null;
            } else {
                ahead = ahead.next;
            }
        }
        while (ahead.next != null) {
            ahead = ahead.next;
            behind = behind.next;
        }
        return behind;
    }
}
