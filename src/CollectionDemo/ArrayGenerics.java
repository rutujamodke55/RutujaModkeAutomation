package CollectionDemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayGenerics {
    public static void main(String[] args){
        List<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(100);
        arrayList2.add(200);
        arrayList2.add(300);
        arrayList2.add(null);
        arrayList2.add(1000);
        for(Integer o : arrayList2){
            System.out.println(o);
        }
    }
}
