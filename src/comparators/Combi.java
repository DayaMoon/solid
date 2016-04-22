package comparators;

import java.util.Arrays;

/**
 *  Input ⇒ x = { 2, 3, 5 } and y = { 10 }

    5 + 5 = 10 (valid)
    2 + 3 + 5 = 10 (valid)
    3 + 2 + 5 = 10 (invalid - you already have such sum but in different order)
    3 + 5 + 2 = 10 (invalid - you already have such sum but in different order)
    5 + 2 + 3 = 10 (invalid - you already have such sum but in different order)
    5 + 3 + 2 = 10 (invalid - you already have such sum but in different order)
    3 + 3 + 2 + 2 = 10 (valid)
    3 + 2 + 3 + 2 = 10 (invalid - you already have such sum but in different order)
    2 + 2 + 3 + 3 = 10 (invalid - you already have such sum but in different order)
    2 + 3 + 2 + 3 = 10 (invalid - you already have such sum but in different order)
    2 + 3 + 3 + 2 = 10 (invalid - you already have such sum but in different order)
    2 + 2 + 2 + 2 + 2 = 10 (valid)


 * @author dmunteanu
 *
 */

public class Combi
{

	//public static void main(String[] args ){
	public static void main(String[] args){

	//	  Bag<Integer> b = new Bag<>();
		//  x = { 1, 7, 11, 20, 15 }, and a number y = { 1500 }

		//int var = combi(1500, new int[] { 1, 7, 11, 20, 15 }, 0);
		System.out.println("------------");
		//System.out.println(var);
		System.out.println(findCombinationsCount(1500,  new int[] { 1, 7, 11, 20, 15 }));  //9805253

		System.out.println(findCombinationsCount(10,  new int[] { 2, 3, 5 }));   //4
		System.out.println("------------");

	}


	public static int combi(int n, int[] v, int i) {

		if (n < 0) {
			System.out.println();
			return 0;
		}
		if (n == 0) {

			return 1;
		}
		if (i == v.length && n > 0) {
			return 0;
		}

		return combi(n - v[i], v, i) + combi(n, v, i + 1);
	}

	public static int findCombinationsCount(int sum, int vals[]) {
      if (sum < 0) {
          return 0;
      }
      if (vals == null || vals.length == 0) {
          return 0;
      }

      int dp[] = new int[sum + 1];
      dp[0] = 1;
      for (int i = 0; i < vals.length; ++i) {
          for (int j = vals[i]; j <= sum; ++j) {
              dp[j] += dp[j - vals[i]];
          }
      }

      return dp[sum];
  }
}
