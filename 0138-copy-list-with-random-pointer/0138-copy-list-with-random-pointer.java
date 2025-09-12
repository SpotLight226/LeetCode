/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> hashMap = new HashMap<>();
        Node result = new Node(-1);
        Node dummy = result;
        Node temp = head;

        while(temp != null) {
            Node newNode = new Node(temp.val);
            hashMap.put(temp, newNode);
            temp = temp.next;
        }

        temp = head;
        while(temp != null) {
            Node copy = hashMap.get(temp);
            copy.random = hashMap.get(temp.random);
            temp = temp.next;
        }

        temp = head;
        dummy.next = hashMap.get(temp);
        dummy.next = hashMap.get(temp);
        dummy = dummy.next;
        while(temp != null) {
            dummy.next = hashMap.get(temp.next);
            temp = temp.next;
            dummy = dummy.next;
        }

        return result.next;

    }
}