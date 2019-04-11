package 携程;

import java.util.List;
import java.util.Scanner;

public class solve1 {

    public class ListNode{
        private String value;
        private ListNode next;

        public ListNode(String value) {
            this.value = value;
        }
    }

    public boolean isCircled(){
        Scanner sc=new Scanner(System.in);
        ListNode head=new ListNode("");
        while (sc.hasNext()){
            head.next=new ListNode(sc.next());
            head=head.next;
        }

        ListNode fast=head;
        ListNode slow=head;

        while (true){
            fast=fast.next.next;
            slow=slow.next;

            if (fast==slow){
                return true;
            }

            if (fast==null||slow==null){
                return false;
            }
        }
    }
}
