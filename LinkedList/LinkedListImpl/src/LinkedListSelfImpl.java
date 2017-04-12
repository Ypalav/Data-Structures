import java.awt.List;
import java.io.ObjectInputStream.GetField;
import java.util.HashMap;
import java.util.Map;

public class LinkedListSelfImpl {
	private int length = 0;
	ListNode head;

	public LinkedListSelfImpl() {
		length = 0;
	}

	public synchronized ListNode getHead() {
		return head;
	}

	public void printList(ListNode head) {
		ListNode currenListNode = head;
		if(head==null)
			System.out.println("empty list");
		while (currenListNode != null) {
			System.out.println("data " + currenListNode.getData());
			currenListNode = currenListNode.getNext();
		}
	}

	public synchronized void insertAtBegin(ListNode node) {
		node.setNext(head);
		head = node;
		length++;
	}

	public synchronized void insertAtEnd(ListNode node) {
		ListNode curreNode = head;
		if (head == null)
			head = node;
		while (curreNode.getNext() != null) {
			curreNode = curreNode.getNext();
		}
		curreNode.setNext(node);
		length++;
	}

	public synchronized void insertAtGivenPosition(int data, int position) {
		if (position < 0)
			position = 0;
		if (position > length) {
			position = length;
		}
		if (head == null) {
			head = new ListNode(data);
			length++;
		} else if (position == 0) {
			ListNode newListNode = new ListNode(data);
			newListNode.setNext(head);
			head = newListNode;
			length++;
		} else {
			ListNode tempNode = head;
			for (int i = 1; i < position; i++) {
				tempNode = tempNode.getNext();
			}
			ListNode newListNode = new ListNode(data);
			newListNode.setNext(tempNode.getNext());
			tempNode.setNext(newListNode);
			length++;
		}
	}

	public synchronized ListNode deleteAtBegin() {
		ListNode temp = head;
		if (temp != null) {
			head = temp.getNext();
			temp.setNext(null);
			length--;
		}
		return head;
	}

	public synchronized ListNode deleteAtEnd() {
		ListNode currentListNode = head;
		ListNode tempNode = currentListNode;
		if (head == null)
			return null;
		if (head.getNext() == null) {
			return head;
		}
		while (currentListNode.getNext() != null) {
			tempNode = currentListNode;
			currentListNode = currentListNode.getNext();
		}
		tempNode.setNext(null);
		length--;
		return tempNode;
	}

	public synchronized ListNode reverseList(ListNode head) {
		if (head == null || head.getNext() == null) {
			return head;
		} else {
			ListNode newListNode = reverseList(head.getNext());
			head.getNext().setNext(head);
			head.setNext(null);
			return newListNode;
		}
	}

	// recursive approach
	public ListNode MergeLists(ListNode headA, ListNode headB) {

		// This is a "method-only" submission.
		// You only need to complete this method

		if (headA == null) {
			return headB;
		} else if (headB == null) {
			return headA;
		}

		if (headA.getData() < headB.getData()) {
			headA.setNext(MergeLists(headA.getNext(), headB));
			return headA;
		} else {
			headB.setNext(MergeLists(headA, headB.getNext()));
			return headB;
		}
	}

	// iterative approach
	public ListNode merge(ListNode headA, ListNode headB) {

		ListNode newList = new ListNode(0);
		ListNode curreNode = newList;
		while (headA != null && headB != null) {
			if (headA.getData() > headB.getData()) {
				curreNode.setNext(headB);
				// newList.setData(headB.getData());
				headB = headB.getNext();
			} else {
				curreNode.setNext(headA);
				// newList.setData(headA.getData());
				headA = headA.getNext();
			}
			curreNode = curreNode.getNext();
		}
		if (headA != null) {
			curreNode.setNext(headA);
			// newList.setData(headA.getData());
		} else if (headB != null) {
			curreNode.setNext(headB);
			// newList.setData(headB.getData());
		}

		return newList.getNext();
	}

	public ListNode reverseInPairs(ListNode headA) {
		ListNode temp1 = null;
		ListNode temp2 = null;

		while (headA != null && headA.getNext() != null) {
			if (temp1 != null)
				temp1.getNext().setNext(headA.getNext());

			temp1 = headA.getNext();
			headA.setNext(headA.getNext().getNext());
			temp1.setNext(headA);
			if (temp2 == null)
				temp2 = temp1;
			headA = headA.getNext();
		}
		return temp2;
	}

	public synchronized ListNode deleteAtGivenPosition(int position) {
		if (position < 0)
			position = 0;
		if (position > length)
			position = length;

		if (head == null)
			return null;
		else if (head.getNext() == null) {
			head = null;
			return head;
		} else {
			ListNode curreListNode = head;
			for (int i = 1; i < position; i++) {
				curreListNode = curreListNode.getNext();
			}
			curreListNode.setNext(curreListNode.getNext().getNext());
		}
		length--;
		return head;
	}

	public ListNode reverseKPairs(ListNode head, int k) {

		ListNode current = head;
		int count = k;
		while (current != null && count > 0) {
			current.getNext().setNext(current);
			current.setNext(null);
			current = current.getNext();
			count--;
		}

		return current;
	}

	// iterative version palindrome
	public boolean checkPalindrome(ListNode head) {
		ListNode currentNode = head;
		ListNode slowPtr = head;
		ListNode fastPtr = head;
		// find middle
		while (fastPtr.getNext() != null) {
			slowPtr = slowPtr.getNext();
			fastPtr = fastPtr.getNext().getNext();
		}
		ListNode currentAfterSplit = slowPtr.getNext();
		ListNode prev = null;
		// reverse the list after middle
		while (currentAfterSplit.getNext() != null) {
			ListNode next = currentAfterSplit.getNext();
			currentAfterSplit.setNext(prev);
			prev = currentAfterSplit;
			currentAfterSplit = next;
		}
		// compare it with the list before middle
		while (currentAfterSplit != null) {
			if (currentNode.getData() != currentAfterSplit.getData()) {
				return false;
			}
			currentNode = currentNode.getNext();
			currentAfterSplit = currentAfterSplit.getNext();
		}
		return true;
	}

	public void getJosephusCircle(ListNode listNode, int m) {
		ListNode currentHead = listNode;
		int n = 1;
		// traverse till end
		while (currentHead.getNext() != null) {
			currentHead = currentHead.getNext();
			n += 1;
		}
		// make it circular
		currentHead.setNext(listNode);

		// remove every mth element
		while (n > 0) {
			for (int i = 0; i < m - 1; ++i) {
				currentHead = currentHead.getNext();
			}
			currentHead.setNext(currentHead.getNext().getNext());
			n--;
		}

		System.out.println(currentHead.getData());
	}
	//without buffer O(n^2)
	public ListNode removeDuplicates(ListNode head) {
		ListNode currentHead = head;
		ListNode prev=null;
		if(head==null || head.getNext() == null)
			return head;
		while (currentHead != null) {
			ListNode next = currentHead.getNext();
			prev = currentHead;
			while (next != null) {
				// ListNode newNext = currentHead.getNext();
				if (currentHead.getData() == next.getData())
					prev.setNext(next.getNext());
				prev=next;
				next = next.getNext();
			}
			currentHead = currentHead.getNext();
		}
		return head;
	}
	//with buffer O(n)-time O(n)-space
	public void remDuplicates(ListNode head){
		Map<Integer, Boolean> mapper = new HashMap<Integer, Boolean>();
		ListNode currentHead = head;
		ListNode next=null;
		while(currentHead.getNext()!=null){
			next = currentHead.getNext();
			if(mapper.get(next.getData()) != null){
				currentHead.setNext(next.getNext());
			}else{
				mapper.put(next.getData(), true);
				currentHead = currentHead.getNext();
			}
		}
	}
	public static void main(String args[]) {
		ListNode listNode = new ListNode(14);
		LinkedListSelfImpl impl = new LinkedListSelfImpl();
		impl.insertAtBegin(listNode);
		listNode = new ListNode(18);
		impl.insertAtBegin(listNode);
		listNode = new ListNode(13);
		impl.insertAtBegin(listNode);
		listNode = new ListNode(12);
		impl.insertAtBegin(listNode);
		listNode = new ListNode(14);
		impl.insertAtBegin(listNode);
		listNode = new ListNode(18);
		impl.insertAtEnd(listNode);
		impl.printList(impl.getHead());

		/*
		 * ListNode listNode1 = new ListNode(17); LinkedListSelfImpl impl1 = new
		 * LinkedListSelfImpl(); impl1.insertAtBegin(listNode1); listNode1 = new
		 * ListNode(9); impl1.insertAtBegin(listNode1); listNode1 = new
		 * ListNode(8); impl1.insertAtBegin(listNode1); listNode1 = new
		 * ListNode(6); impl1.insertAtBegin(listNode1); listNode1 = new
		 * ListNode(5); impl1.insertAtBegin(listNode1); listNode1 = new
		 * ListNode(19); impl1.insertAtEnd(listNode1);
		 * impl1.printList(impl1.getHead());
		 */

		/*
		 * LinkedListSelfImpl newImpl = new LinkedListSelfImpl();
		 * 
		 * //newImpl.MergeLists(impl.getHead(), impl1.getHead()); ListNode
		 * newHead = newImpl.merge(impl.getHead(), impl1.getHead());
		 * System.out.println("==============="); newImpl.printList(newHead);
		 */

		/*
		 * System.out.println("========reverse k pairs=======");
		 * LinkedListSelfImpl newImpl1 = new LinkedListSelfImpl(); ListNode
		 * newHead1 = newImpl1.reverseInPairs(impl.getHead());
		 * newImpl1.printList(newHead1); LinkedListSelfImpl newImpl1 = new
		 * LinkedListSelfImpl(); ListNode newHead1 =
		 * newImpl1.reverseKPairs(impl.getHead(), 2);
		 * newImpl1.printList(newHead1);
		 */

		System.out.println("========check palindrome=======");
		LinkedListSelfImpl newImpl1 = new LinkedListSelfImpl();
		/* System.out.println(newImpl1.checkPalindrome(impl.getHead())); */

		/* impl.getJosephusCircle(impl.getHead(), 2); */

		
		impl.printList(impl.removeDuplicates(impl.getHead()));
		// impl.reverseList(impl.getHead());
		/*
		 * impl.deleteAtBegin(); impl.deleteAtEnd();
		 */
		/* impl.deleteAtGivenPosition(1); */

		/*
		 * listNode = new ListNode(14); listNode = new ListNode(15); listNode =
		 * new ListNode(16);
		 */
		// impl.printList();
	}

}
