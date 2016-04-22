package edu.endava.solid;

import java.util.*;

public final class LoopStyles {

  public static void main(String... aArguments) {
    List<String> flavours = new ArrayList<>();
    flavours.add("chocolate");
    flavours.add("strawberry");
    flavours.add("vanilla");

    useWhileLoop(flavours);
    System.out.println("");
    useForLoop(flavours);

    System.out.println(findLongestCommonPrefix("clamping_range_a1_min_0","clamping_range_a1_max_0"));
    System.out.println(findLongestCommonPrefix("Spannbereich a1 min","Spannbereich a1 max"));
  }

  private static void useWhileLoop(Collection<String> aFlavours) {
    Iterator<String> flavoursIter = aFlavours.iterator();
    while (flavoursIter.hasNext()){
      System.out.println(flavoursIter.next());
    }
  }

  /**
  * Note that this for-loop does not use an integer index.
  */
  private static void useForLoop(Collection<String> aFlavours) {
	  int i=0;
    for (Iterator<String> flavoursIter = aFlavours.iterator(); flavoursIter.hasNext();){
   	System.out.println(i++);
      System.out.println(flavoursIter.next());
      if (flavoursIter.hasNext())
      	System.out.println(flavoursIter.next());
    }
  }

  private static String  findLongestCommonPrefix(String s1, String s2) {
	  char[] c1 = s1.toCharArray();
	  char[] c2 = s2.toCharArray();

		for( int i = 0; i < Math.min(c1.length, c2.length);  i++) {
			if (c1[i] != c2[i]) {
				return s1.substring(0, i-1);
			}
		}
		return s2;
	}
}