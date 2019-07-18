import base.ListNode;

/**
 * created by Zheng Jiateng on 2019/4/9.
 */

/**
 * 反转链表：输入一个链表，反转链表后，输出新链表的表头。
 * a->b->c->d->null
 * null<-a<-b<-c<-d
 *
 * 要点：三个指针 一个指向当前节点，一个指向前一个，一个提前保存后一个节点，防止链表断裂
 * if判断设置新头是易漏点
 */
public class ReverseList {
    public ListNode ReverseList(ListNode head) {
        ListNode previos = null;
        ListNode next = null;
        ListNode newHead = null;
        ListNode cur = head;
        while (cur != null) {
            if (cur.next == null) { // 这个if判断设置新头是易漏点
                newHead = cur;
            }
            next = cur.next;
            cur.next = previos;
            previos = cur;
            cur = next;
        }
        return newHead;
    }
}
