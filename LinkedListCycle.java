package LinkedListCycle;
import java.util.*;


class Lists {
	boolean hasCycle(Node head) {
		ArrayList<Node> list = new ArrayList<Node>();
		list.add(head);
		if (head == null) {
			return false;
		}
		Node nextN = head.next;
		while (nextN != null) {
			if (list.contains(nextN)) {
				return true;
			} else {
				list.add(nextN);
				nextN = nextN.next;
			}
		}
		return false;
	}
}