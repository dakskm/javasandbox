package practice.generics;

public class GenObject<T> {
    T obj;

    GenObject(T obj) {
        this.obj = obj;
    }

    public T removeDups() {
        String temp = "";

        char[] b = this.obj.toString().toCharArray();

        for(int i=0; i< b.length; i++) {
            String checkStr = String.valueOf(b[i]);
            if(!temp.contains(checkStr)) {
                temp = temp + checkStr;
            }
        }

        return (T) temp;
    }
}
