package ru.miit.ProgrammingJ2EE.SortingMethod;

import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Default;
import java.util.Collections;
import java.util.List;

/**
 * Created by Андрей on 27.02.2016.
 */

@Alternative
public class BubbleSort implements ICollectionSorter {
    @Override
    public <T extends Comparable<? super T>> void sort(List<T> list) {
        System.out.println("BubbleSort");
        boolean repeat = true;
        while (repeat) {
            repeat = false;
            for (int i = 0, j = i + 1; j < list.size(); i++, j++) {
                T bubbleItem = list.get(i);
                T item = list.get(j);
                if (bubbleItem.compareTo(item) > 0) {
                    Collections.swap(list, i, j);
                    repeat = true;
                }
            }
        }
    }
}
