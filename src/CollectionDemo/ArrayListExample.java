package CollectionDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List arrayList = new ArrayList();
        arrayList.add("Rutuja");
        arrayList.add("Pooja");
        arrayList.add("Swati");
        arrayList.add(100);
        arrayList.add(null);
        arrayList.add("Komal");

        List arrayList2 = new ArrayList();
        arrayList2.add("Rutuja");
        arrayList2.add("Anisha");
        arrayList2.add(10.5f);
        arrayList2.add(null);
        arrayList2.add(1000);

        arrayList.addAll(arrayList2);
        // arrayList.clear();
        System.out.println(arrayList2.size());

        // System.out.println(arrayList.contain("Rutuja"));

        //  System.out.println(arrayList2.remove("Anisha"));

        System.out.println(arrayList.removeAll(arrayList2));



      /*  Iterator itr = arrayList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());*/

        for (Object o : arrayList) {
            System.out.println(o);
        }
    }
}
