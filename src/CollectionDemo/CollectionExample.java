package CollectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionExample {
    public static void main(String[]args){


        List<String> arrayList = new ArrayList<>();
        arrayList.add("Rutuja");
        arrayList.add("Pooja");
        arrayList.add("Swati");
       // arrayList.add(100);
       // arrayList.add(null);
        arrayList.add("Komal");
       // Collections.sort(arrayList);
        //Collections.sort(arrayList());
        for(String o :arrayList){
            System.out.println(o);


        }
    }
}
