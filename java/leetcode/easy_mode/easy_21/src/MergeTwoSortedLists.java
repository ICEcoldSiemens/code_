class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


public class MergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode starter = new ListNode(-1); // starting node
        ListNode current = starter; // the current node before next

        // While both lists have numbers, we traverse through both lists
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            }
            else{
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
           if (list1 != null) {
               current.next = list1;
           } else{
               current.next = list2;
           }
           return starter.next;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1); ListNode list2 = new ListNode(2);
        ListNode m = mergeTwoLists(list1, list2); // Attempt One - Time complexity of O(N + M)
        System.out.println(m.val);
    }
}
