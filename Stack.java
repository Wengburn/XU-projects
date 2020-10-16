public class Stack{
	
	
	SinglyLinkedList singlylinkedlist;
	
	public Stack(SinglyLinkedList singlylinkedlist){
		this.singlylinkedlist = singlylinkedlist;
	}
	
	public void push(char data){
		singlylinkedlist.addElement(data);
	}
	
	public void pop(){
		singlylinkedlist.removeElement();
	}
}