package 链表;

import java.util.Scanner;

public class 判断一个链表是否有环 {

    public static class ListNode{
        String val;
        ListNode next;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode();
        ListNode phead=head;
        Scanner sc=new Scanner(System.in);

        while (sc.hasNext()){
            String next = sc.next();
            phead.val=next;
            phead.next=new ListNode();
            phead=phead.next;
        }

        boolean b = hasCircle(head);
        System.out.println("输入链表有环："+b);
    }

    public static boolean hasCircle(ListNode head){

        ListNode fast=head;
        ListNode slow=head;

        while (fast!=null&&fast.next!=null){

            if (fast==slow) return true;
            fast=fast.next.next;
            slow=slow.next;
        }

        return false;
    }
}
