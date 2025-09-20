package addTwoNumbers;

public class Main {

	public static void main(String[] args) {
		ListNode ex1l1 = convertList(342);
		ListNode ex1l2 = convertList(465);
		System.out.println(
				"Example 1 : "+printListNode(ex1l1)
				+" + "+printListNode(ex1l2)
				+" = "+printListNode(addTwoNumbers(ex1l1, ex1l2)));
	
		ListNode ex2l1 = convertList(0);
		ListNode ex2l2 = convertList(0);
		System.out.println(
				"Example 2 : "+printListNode(ex2l1)
				+" + "+printListNode(ex2l2)
				+" = "+printListNode(addTwoNumbers(ex2l1, ex2l2)));
	
		ListNode ex3l1 = convertList(9999999);
		ListNode ex3l2 = convertList(9999);
		System.out.println(
				"Example 3 : "+printListNode(ex3l1)
				+" + "+printListNode(ex3l2)
				+" = "+printListNode(addTwoNumbers(ex3l1, ex3l2)));
	
	}
	
	// Starting to use this to not create another class
	public static ListNode addTwoNumbers(ListNode l1,ListNode l2) {
		ListNode result = new ListNode();
		ListNode actual = result;
		int leftover = 0;
		
		// Will cycle until there's no node's left and no leftover
		while( l1 != null|| l2 != null || leftover != 0) {
			
			// Learning to use ternary operators: value = (condition) ? value if true : value if false;
			int v1 = (l1 != null) ? l1.val : 0;
			int v2 = (l2 != null) ? l2.val : 0;
			int sum = v1 + v2 + leftover;
			
			// As in Palindrome, removes the right digit from the sum and saves the rest
			leftover = sum / 10;
			// Then adds the right digit of the sum as a new node
			actual.next = new ListNode(sum % 10) ;
			actual = actual.next;
			
			// To advance in the list
			l1 = (l1 != null) ? l1.next : l1;
			l2 = (l2 != null) ? l2.next : l2;
		}
		
		return result.next;
	}
	
	// For testing purposes
	public static ListNode convertList(int numbers) {
		int reversed = 0;
		ListNode result = new ListNode();
		ListNode actual = result;
		
		// To reverse the number and then make it a linked list according to the problem
		while( numbers > 0) {
			reversed = (reversed * 10) + (numbers % 10);
			numbers = numbers/10;
		}
		
		while ( reversed > 0 ) {
			actual.val = reversed % 10;
			reversed = reversed/10;
			if(reversed > 0) {
				actual.next = new ListNode() ;
				actual = actual.next;
			}
		}
		
		return result;
	}
	
	public static String printListNode(ListNode list) {
		String str = "[";
		
		while (list != null) {
			if(list.next != null)
				str += list.val+",";
			else
				str += list.val+"]";
			
			list = list.next;
		}
		
		return str;
	}
}
