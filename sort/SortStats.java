package sort;

public class SortStats {
  
  public long numComparisons = 0;
  public long numSwaps = 0;
  public int arraySize = 0;
  public int additionalMem = 0;

  

  public void printStats()
  {
    System.out.println("Sorting Statistics");
    System.out.println("Num Comparisons:   " + numComparisons);
    System.out.println("Num Swaps:         " + numSwaps);
    System.out.println("Array Size:        " + arraySize);
    System.out.println("Additional Memory: " + additionalMem);
    System.out.println();
  }

}
