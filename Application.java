/*
 * Name: Juliana Bruno
 * Lab: 6
 * Title: Application.java
 * Description: uses methods in IntLinkedList class to change a single linked list
 * Date: 10/21/25
 */

public class Application {

	public static void main(String[] args) {
		
		//initialization
		IntLinkedList alist = new IntLinkedList();
		alist.addFirst(3);
		alist.addFirst(2);
		alist.addFirst(6);
		alist.addFirst(4);
		alist.addFirst(3);
		System.out.println(" constructed a list:");
		alist.traverse();
				
		//step 1: 
		System.out.println("\n step 1: get length");
		System.out.println("The length of this linkedList is " + alist.getLength());
		
		//step 2:
		System.out.println("\n step 2: add new item at the end");
		System.out.println("The original list is: ");
		alist.traverse();
		System.out.println("Add 5 at the end of the list: ");
		alist.addTail(5);
		alist.traverse();
		
		//step 3:
		System.out.println("\n step 3: finding item");
		System.out.print("Finding the first element contains 4: ");
		IntLinkedList.showContent(alist.findItem(4));
		System.out.println(" ");
		
		//step 4:
		System.out.println("\n step 4: finding maximum value");
		System.out.println("The original list is: ");
		alist.traverse();
		System.out.println("The max value of the list is: " + alist.maxValue());
		
		
		//scaleBy testing (already done for you)
		//take this as an example
		System.out.println("\n Example: scale");
		System.out.println("The original list is: ");
		alist.traverse();
		System.out.println("The new list, which is scaled by 4, is: ");
		IntLinkedList clist = alist.scaleBy(4);
		clist.traverse();
		
		
		//step 5:
		System.out.println("\n step 5: divisible");
		System.out.println("The original list is: ");
		alist.traverse();
		System.out.println("The new list, which is divisible by 3, is: ");
		IntLinkedList dlist = alist.divisibleBy(3);
		dlist.traverse();
		
		//step 6:
		System.out.println("\n step 6: reverse copy");
		IntLinkedList flist = clist.reverseCopy();
		System.out.println("The original list is: ");
		clist.traverse();
		System.out.println("The reversed list is: ");
		flist.traverse();
			
		//step 7:
		System.out.println("\n step 7: filtering");
		System.out.println("The original list is: ");
		alist.traverse();
		System.out.println("The new list is: ");
		IntLinkedList elist = alist.filter(3);
		elist.traverse();
		
		
		
	}

}
