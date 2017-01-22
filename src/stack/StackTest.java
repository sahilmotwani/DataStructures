package stack;

import java.util.Stack;

import org.junit.Test;
public class StackTest {
	@Test
	public void test(){
		StackUsingLinkedList<Integer> i = new StackUsingLinkedList<Integer>();
		i.push(5);
		i.push(6);
		i.push(3);
		i.push(8);
		i.push(0);
		i.push(9);
		i.push(3);
		i.pop();
		i.pop();
		i.pop();
		i.pop();
		i.traverse();
		
	}

	public boolean arePairs(char opening,char closing){
		if(opening=='{' && closing=='}') return true;
		if(opening=='[' && closing==']') return true;
		if(opening=='(' && closing==')') return true;
		return false;
	}
	@Test
	public void checkForBalancedParantheses(){
		String exp="{[]})";
		StackUsingArray<Character> stack = new StackUsingArray<Character>();
		boolean s=false;
		for(int i=0;i<=exp.length()-1;i++){
			if("{[(".indexOf(exp.charAt(i))!=-1){
				stack.push(exp.charAt(i));
			}
			else if("}])".indexOf(exp.charAt(i))!=-1){
				if(stack.isEmpty()){
					s=true;
					break;
					}
				if(arePairs(stack.top(), exp.charAt(i)))
					stack.pop();
				else{
					s=true;
					break;
				}
			}
		}
		if(stack.isEmpty()&&s==false)
		System.out.println(true);
		else
			System.out.println(false);
		
	}
}
