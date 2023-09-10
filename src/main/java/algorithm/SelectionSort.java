package algorithm;

import org.springframework.data.mongodb.core.aggregation.ArrayOperators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SelectionSort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(1);
        list.add(2);
        list.add(3);

        int min = 0;

        for(int i=0 ; i<list.size() ; i++) {
            min = list.get(i);
            int indexToSwap = i;
            for(int j = i+1;j<list.size(); j++) {
                if(list.get(j) < min) {
                    min = list.get(j);
                    indexToSwap = j;
                }
            }
            if(indexToSwap != i) {
                Collections.swap(list,i,indexToSwap);
            }

        }

        System.out.println(list);

    }
}
