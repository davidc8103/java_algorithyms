package test.stackarray;

public class Main {

	public static void main(String[] args) {
		
		ArrayStack stack = new ArrayStack(10);
		
		stack.push(new Employee("Jane", "Jones", 1234));
		stack.push(new Employee("John", "Doh", 4567));
		stack.push(new Employee("Mary", "Smith", 22));
		stack.push(new Employee("Mike", "Wilson", 3245));
		stack.push(new Employee("Bill", "End", 78));
		
		//stack.printstack();
		
		System.out.println(stack.peek());
		
		System.out.println("Popped: " + stack.pop());
		System.out.println(stack.peek());
		
	}

}
