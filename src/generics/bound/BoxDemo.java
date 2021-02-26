package generics.bound;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alauddin Tuhin
 * @created_on 2/24/21 at 7:45 AM
 * @project java practice
 **/
public class BoxDemo {

    public static <U extends String> void addBox(U u, List<Box<U>> boxes) {
            Box<U> box = new Box<>();
            box.set(u);
            boxes.add(box);
    }

    public static <U>void outputBoxes(List<Box<U>> boxes){
        int counter = 0;
        for (Box<U> box : boxes){
            U boxContent = box.get();
            System.out.println("Box: "+counter +" contains ["+boxContent.toString()+"]");
            counter++;
        }
    }

    public static void main(String [] args){
        ArrayList<Box<String>> list = new ArrayList<>();
        BoxDemo.addBox(String.valueOf("Box-Type-1"), list);
        BoxDemo.addBox(String.valueOf("Box-Type-2"),list);
        BoxDemo.addBox(String.valueOf("Box-Type-3"),list);
        BoxDemo.addBox(String.valueOf("Box-Type-4"), list);
        BoxDemo.addBox(String.valueOf("Box-Type-5"),list);
        BoxDemo.addBox(String.valueOf("Box-Type-6"),list);
        BoxDemo.outputBoxes(list);
    }



}
