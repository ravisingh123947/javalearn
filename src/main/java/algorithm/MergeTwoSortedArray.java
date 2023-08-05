package algorithm;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(4);
        list1.add(7);
        list1.add(10);

        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(5);
        list2.add(6);
        list2.add(11);

        List<Integer> finalList = new ArrayList<>();

        int i1 = 0;
        int i2 = 0;
        while(i1 < list1.size() && i2 < list2.size()) {
            Integer list1Element = list1.get(i1);
            Integer list2Element = list2.get(i2);

            if(list1Element <= list2Element) {
                finalList.add(list1Element);
                i1++;
            } else {
                finalList.add(list2Element);
                i2++;
            }
        }
        if(i1 < list1.size()) {
            while(i1 < list1.size()) {
                finalList.add(list1.get(i1));
                i1++;
            }
        }
        if(i2 < list2.size()) {
            while (i2 < list2.size()) {
                finalList.add(list2.get(i2));
                i2++;
            }
        }
        for(Integer i : finalList) {
            System.out.println(i);
        }
    }
}
