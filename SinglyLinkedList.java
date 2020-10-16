public class SinglyLinkedList{
	
	Node head;
	int length = 0;
	
	public void addElement(char data){
		Node temp = new Node(data);
		Node current = head;
		if (head != null){
			while (current.next != null){
				current = current.next;
			}
			current.next = temp;
		}
		else{
			head = temp;
		}
		length++;
	}
	
	public void removeElement(){
		if (head != null){
			Node current = head;
			while (current.next.next != null){
				current = current.next;
			}
			current.next = null;
		}	
		else{
			head = null;
		}
		length--;
	}
	
	public void peekElement(){
		if (head != null){
			Node current = head;
			while (current.next != null){
				current = current.next;
			}
			System.out.println(current.data);
		}	
		else{
			System.out.println(head.data);
		}
	}
		
}
	
		