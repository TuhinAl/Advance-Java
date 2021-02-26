package generics.bound;

/**
 * @author Alauddin Tuhin
 * @created_on 2/24/21 at 7:46 AM
 * @project java practice
 **/
public class Box<T> {

    private T t;

    public T get() {
        return t;
    }

    public void set(T t) {
        this.t = t;
    }
}
