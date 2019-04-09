import base.ListNode;

/**
 * created by Zheng Jiateng on 2019/4/9.
 */

/**
 * 反转链表： 三个指针 一个指向当前节点，一个指向前一个，一直提前保存后一个节点，防止链表断裂
 *
 * 输入一个链表，反转链表后，输出新链表的表头。
 * a->b->c->d->null
 * null<-a<-b<-c<-d
 */
public class ReverseList {
    public ListNode ReverseList(ListNode head) {
        ListNode reversedHead = null;
        ListNode node = head;
        ListNode previous = null;
        while (node != null) {
            if (node.next == null) {
                reversedHead = node;
            }
            ListNode next = node.next;
            node.next = previous;
            previous = node;
            node = next;
        }
        return reversedHead;
    }
}
