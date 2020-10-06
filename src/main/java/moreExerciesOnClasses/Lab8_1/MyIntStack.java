package main.java.moreExerciesOnClasses.Lab8_1;

public class MyIntStack {
	private int[] contents;
	private int tos; // Top of the stack

	// constructors
	public MyIntStack(int capacity) {
		contents = new int[capacity];
		tos = -1;
	}

	// case 1
//	public void push(int element) {
//		try {			
//			contents[++tos] = element;
//		} catch (Exception e) {
//			throw new IllegalStateException("Stack is full!");
//		}
//	}

	// case 2
//	public boolean push(int element) {
//		if (tos == contents.length - 1) {
//			contents[++tos] = element;
//		}
//		
//		return false;
//	}

	// case 3
	public void push(int element) {
		if (tos == contents.length - 1) {
			int[] newContents = new int[contents.length + 10];
			System.arraycopy(contents, 0, newContents, 0, tos);

			newContents[++tos] = element;
		}
	}

	public int pop() {
		return contents[tos--];
	}

	public int peek() {
		return contents[tos];
	}

	public boolean isEmpty() {
		return tos < 0;
	}

	public boolean isFull() {
		return tos == contents.length - 1;
	}
}
