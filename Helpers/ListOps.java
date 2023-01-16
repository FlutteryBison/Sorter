package Helpers;

import java.util.Random;

public class ListOps {
  public static int[] generateRandList(int maxSpread, int length)
  {
    Random rand = new Random(System.currentTimeMillis());
    int[] list = new int[length];
    for(int i = 0; i < length; i++)
    {
      list[i] = rand.nextInt(maxSpread);
    }
    return list;
  }

  public static void printList(int[] list)
  {
    for (int i : list) {
      System.out.print(i + " ");
    }
    System.out.println();
  }
}
