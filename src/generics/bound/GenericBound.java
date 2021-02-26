package generics.bound;

import generics.GenericMethod;

public class GenericBound <T extends Number>{

    private T t;

    public T get() {
        return t;
    }

    public void set(T t) {
        this.t = t;
    }

    public <U extends Integer> void inspect(U u){
        System.out.println("T "+t.getClass().getName());
        System.out.println("U "+u.getClass().getName());
    }

    public static  <T extends  Comparable<T>>int countGreaterThan(T [] array, T elem){

        int count = 0;
        for(T e : array)
            if (e.compareTo(elem)>0)
                ++count;
            return count;

    }

        public static void main(String [] args){
            GenericBound<Integer> integer = new GenericBound<>();
            integer.set( new Integer(10));
            integer.inspect(24);
            Integer [] array = { 12,3,12,4,31,46,43,64,32,46,23,26,42,15,56,24};
             GenericBound.countGreaterThan(array,35);
        }
}
