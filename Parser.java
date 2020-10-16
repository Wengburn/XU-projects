import java.lang.String;

public class Parser{
	
	public void split(String input, Stack stack){
		char[] splitter = input.toCharArray();
		for (char c: splitter){
			stack.push(c);
		}
	}
	
	public void analyze(Stack stack){
		Node current = stack.singlylinkedlist.head;
		int opencount = 0;
		int slashcount = 0;
		int closecount = 0;
		int i = 0;
		while(i == 0){
			if (current.data == '<'){
				opencount++;
			}
			else if (current.data == '/'){
				slashcount++;
			}
			else if (current.data == '>'){
				closecount++;
			}
			if (current.next != null){
				current = current.next;
			}
			else {
				i = 1;
			}
		}
		
		if (opencount == closecount && opencount == (slashcount*2)){
			System.out.println("The code is valid.");
		}
		else {
			System.out.println("The code is not valid.");
		}
	}
}
			
			
			
			
			
		
		
		