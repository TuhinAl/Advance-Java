package generics.bound;

public class ClassBound <T extends Integer>{
    private T n;

    public ClassBound(T n) {
        this.n = n;
    }
    public boolean isEven(){
        return n.intValue() % 2 == 0;
    }

}
