package practice.arrays.removedups.generic;

public class GenericArray<T> {
    T a[];
    int current;
    int size;

    public GenericArray(int size) {
        this.size = size;
        this.a = (T[]) new Object[size];
    }

    public void add(T e) {
        if(current == size)
            System.out.println("array is full");
        else
            a[current++] = e;
    }

    public void display(){
        for(int i = 0;i<size;i++)
            System.out.println(a[i]);
    }

}
