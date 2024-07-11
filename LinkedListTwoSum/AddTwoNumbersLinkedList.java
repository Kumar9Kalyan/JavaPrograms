package programs.leetcode;


public class AddTwoNumbersLinkedList {
	
	
	
	public static void main(String... args) {

		ListNode l1= new ListNode(2);
		ListNode l2= new ListNode(4);
		ListNode l3= new ListNode(7);
		
		l1.next=l2;
		l2.next=l3;
		l3.next=null;
		
		ListNode l4= new ListNode(3);
		ListNode l5= new ListNode(1);
		ListNode l6= new ListNode(9);
		
		l4.next=l5;
		l5.next=l6;
		l6.next=null;
		
		ListNode result= addTwoNumbers(l1,l4);
		
		while(result!=null) 
		{
			System.out.println(result.val);
			result=result.next;
		}

	}
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummyHead= new ListNode(0);
		ListNode tail=dummyHead;
		int carry=0;
		
		while(l1!=null|| l2!=null||carry!=0)
		{
			int digit1= (l1!=null)?l1.val:0;
			int digit2=(l2!=null)?l2.val:0;
			
			int sum=digit1+digit2+carry;
			int digit= sum%10;
			carry = sum/10;
			
			ListNode newNode = new ListNode(digit);
			tail.next=newNode;
			tail=tail.next;
			
			l1= (l1!=null)?l1.next:null;
			l2=(l2!=null)?l2.next:null;
			
			
		}
		
		ListNode result= dummyHead.next;
		dummyHead.next=null;
		
		
		return result;
		
	}
	
}
