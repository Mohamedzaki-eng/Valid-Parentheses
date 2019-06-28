package valid_parenthesis;

class Stack {
	int index = -1;
	char stackArray[] = new char[100];

	void push(char x) {
		if (index == 99) {
			System.err.println("It's FULL");
		} else {
			stackArray[++index] = x;
		}
	}

	char pop() {
		if (index == -1) {
			System.out.println("EMPTY");
			return '0';
		} else {
			char element = stackArray[index];
			index--;
			return element;
		}
	}

	boolean isEmpty() {
		return (index == -1) ? true : false;
	}
}
