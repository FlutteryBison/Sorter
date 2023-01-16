package sort;

public interface Sort
{
  public int[] SortList(int maxSpread, int length);
  public int[] SortList(int[] list);

  public SortStats getStats();
}