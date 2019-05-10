package practice.stack.example1;

public class StackClass<T> {
  private T elements[];
  private static int pos = -1;
  final int size;

  StackClass(int size) {
    this.size = size;
    elements = (T[]) new Object[size];
  }

  void push(T element) {
    if (!isFull()) {
      elements[pos + 1] = element;
      pos++;
    } else {
      System.out.println("stack is full");
    }
  }

  T pop() {
    T element = null;
    if (!isEmpty()) {
      element = elements[pos];
      pos--;
    } else {
        System.out.println("stack is empty");
    }
    return element;
  }

  private boolean isFull() {
    if (pos == size - 1) return true;
    else return false;
  }

  private boolean isEmpty() {
    if (pos == -1) return true;
    else return false;
  }

  int getPos() {
    return pos;
  }

  void displayAll() {
      if(!isEmpty()) {
          System.out.print("[");
          for(T element: elements) {
              System.out.print(element + ", ");
          }
          System.out.print("]");
          System.out.println();
      }
  }

  void display() {
    display(pos);
  }

  void display(int n) {

    if(n > size) {
      System.out.printf("can't print more than size");
    } else {
      for (int i = 0; i < n; i++) {

      }
    }

  }
}
