package ru.miit.ProgrammingJ2EE.SortingMethod;

import java.util.List;

/**
 * Created by Андрей on 27.02.2016.
 */
public interface ICollectionSorter {
    <T extends Comparable<? super T>> void sort(List<T> list);
}
