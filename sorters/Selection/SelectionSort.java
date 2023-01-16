package sorters.Selection;

import Helpers.ListOps;
import sort.Sort;
import sort.SortStats;

public class SelectionSort implements Sort{
  private SortStats stats;

  /** 
   * Creates a list with given length and sets each element to a random integer between 0 and max spread.
   * Then sorts the list using Selection sort.
   * @param maxSpread   // The spread of the numbers in the list
   * @param length      // The number of integers in the list to sort.
   * @return int[]      // The sorted list.
   */
  public int[] SortList(int maxSpread, int length) {
    int[] list = ListOps.generateRandList(maxSpread, length);
    return sort(list);
  }

  /** 
   * Sorts the given list using selection sort.
   * @param list    //The list to sort.
   * @return int[]  //The sorted list.
   */
  public int[] SortList(int[] list) {
    return sort(list);
  }

  private int[] sort(int[] list)
  {
    int n = list.length;

    stats = new SortStats();
    stats.arraySize = n * 4; //int is 4 bytes
    

    for(int i=0; i<n-1; i++)
    {
      int minIndex = i;

      for(int j=i+1; j<n; j++)
      {
        stats.numComparisons++;
        if(list[j]<list[minIndex])
        {
          minIndex = j;
        }
      }

      //move smallest index to lowest unsorted position
      if(i!=minIndex){
        int temp = list[i];
        list[i] = list[minIndex];
        list[minIndex] = temp;
        stats.numSwaps++;
      }


    }

    return list;

  }

  /** 
   * Returns the statistics about the most recently performed sort.
   * @return SortStats //Stats about the most recently performed sort
   */
  public SortStats getStats() {
    return stats;
  }
  
}
