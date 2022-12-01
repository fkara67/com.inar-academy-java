package chapters.chapter_13.Exercises.Exercises_13_08;

import java.util.ArrayList;

public class MyStackWithClone implements Cloneable {
    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }
    public int getSize() {
        return list.size();
    }
    public Object peek() {
        return list.get(getSize() - 1);
    }
    public Object pop() {
        Object o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }
    public void push(Object o) {
        list.add(o);
    }
    @Override
    public String toString() {
        return "stack: " + list.toString();
    }

    @Override
    public MyStackWithClone clone() {
        try {
            // Perform a shallow copy
            MyStackWithClone clone = (MyStackWithClone) super.clone();
            // Deep copy on list
            clone.list = (ArrayList<Object>) (list.clone());
            return clone;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
    /*     this is shallow copy:(reference copy on objects and ArrayList is an object)
           public MyStackWithClone clone() throws CloneNotSupportedException {
                return (MyStackWithClone) super.clone();
           }
     */
}
