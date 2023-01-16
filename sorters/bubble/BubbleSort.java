package sorters.bubble;


import Helpers.ListOps;
import sort.Sort;
import sort.SortStats;

/**
 * Class that performs a bubble sort on a list of integers
 */
public class BubbleSort implements Sort {

  //Statistics about the most recent sort
  private SortStats stats;


  
  
  /** 
   * Creates a list with given length and sets each element to a random integer between 0 and max spread.
   * Then sorts the list using bubble sort.
   * @param maxSpread   // The spread of the numbers in the list
   * @param length      // The number of integers in the list to sort.
   * @return int[]      // The sorted list.
   */
  public int[] SortList(int maxSpread, int length) {
    //generate list
    int[] list = ListOps.generateRandList(maxSpread, length);

    return sort(list);
    
  }

  
  /** 
   * Sorts the given list using bubble sort.
   * @param list    //The list to sort.
   * @return int[]  //The sorted list.
   */
  public int[] SortList(int[] list) {
    return sort(list);
  }


  private int[] sort(int[] list)
  {

    //Reset sort stats
    stats = new SortStats();
    stats.arraySize = list.length * 4; //int is 4 bytes
    stats.additionalMem = 0;

    int temp;
    boolean swapped = true;
    for(int i = 0; i < list.length && swapped; i++)
    {
      swapped = false;
      for(int j = 0; j < list.length-1 -i; j++)
      {
        stats.numComparisons++;

        if(list[j] > list[j+1])
        {
          temp = list[j];
          list[j] = list[j+1];
          list[j+1] = temp;
          swapped = true;
          stats.numSwaps++;
        }
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
