package edu.endava.solid;

import java.util.*;
import java.util.Map.Entry;


// Sort array elements according to max frequency
// input : (1, 2, 3, 1, 7, 7, 7, 8, 0)
// output: (7, 7, 7, 1, 1, 0, 2, 3, 8)

public class SortWithCount
{
	public static void main(String args[])
	{
		int count[] =
		{ 1, 2, 8, 3, 1, 7, 7, 7, 8, 0, 8, 7, 9, 4 };

		for (int i = 0; i < count.length; i++)
			System.out.print(count[i] + " ");
		System.out.println();
		TreeMap<Integer, Integer> sorted_map = new TreeMap<Integer, Integer>();
		for (int i = 0; i < count.length; i++)
		{
			if (sorted_map.containsKey(count[i]))
				sorted_map.put(count[i], sorted_map.get(count[i]).intValue() + 1);
			else
				sorted_map.put(count[i], 1);
		}
		System.out.println(sorted_map);

		ArrayList<Integer> str = new ArrayList<Integer>();
		for (int i = count.length; i >= 0; i--)
		{
			if (sorted_map.containsValue(new Integer(i)))
			{
				Iterator<Entry<Integer, Integer>> it = sorted_map.entrySet().iterator();
				while (it.hasNext())
				{
					Map.Entry pair = (Map.Entry) it.next();
					if (pair.getValue().equals(i))
					{
						for (int j = 0; j < i; j++)
							str.add((Integer) pair.getKey());
					}
				}
			}
		}
		System.out.println(str);
	}
}
