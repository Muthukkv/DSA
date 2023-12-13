package gfgproblems;
import java.util.*;

public class Solution extends ListNode{
	
    public Solution(int value) {
		super(value);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
    	ListNode ln = new ListNode(1);
    	ListNode ln1 = new ListNode(2);
    	ListNode ln2= new ListNode(3);
    	ListNode ln3 = new ListNode(4);
    	ListNode ln4 = new ListNode(5);
		
		List<ListNode> l = new LinkedList<>();
		l.add(ln);
		l.add(ln1);
		l.add(ln2);
		l.add(ln3);
		l.add(ln4);
		
		for(ListNode i:l) {
			System.out.print(i+"->");
		}
		
	}
}









