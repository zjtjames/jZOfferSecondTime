/**
 * created by Zheng Jiateng on 2019/4/9.
 */

import base.ListNode;

/**
 * 在o(1)时间内删除链表节点
 * 用下一个节点的内容覆盖要删除的节点的内容 把下一个节点的next赋值给要删除节点的next
 * 如果要删除的节点是尾节点，则要从头开始遍历
 * 如果链表只有一个节点，则删除节点之后还要把头节点设置为null
 *
 * 给定单向链表的头指针和一个节点指针，在在o(1)时间内删除该节点
 */

public class DeleteNode {
    public void deleteNode(ListNode head, ListNode toBeDeleted) {
        if (head == null || toBeDeleted == null) {
            return;
        }
        // 要删除的节点不是尾节点
        if (toBeDeleted.next != null) {
            toBeDeleted.val = toBeDeleted.next.val;
            toBeDeleted.next = toBeDeleted.next.next;
        }
        // 链表只有一个节点，要删除头结点（也是尾节点）
        else if (head == toBeDeleted) {
            head = null;
        }
        // 链表中有多个节点，删除尾节点
        else {
            ListNode node = head;
            while (node.next != toBeDeleted) {
                node = node.next;
            }
//            node.next
        }

    }
}
