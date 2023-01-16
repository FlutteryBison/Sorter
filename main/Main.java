package main;

import sort.Sort;
import sorters.bubble.BubbleSort;

public class Main {
  public static void main(String[] args) {
    Sort sorter = new BubbleSort();
    int[] list = sorter.SortList(1000, 100000);
    sorter.getStats().printStats();
    
  }

}
