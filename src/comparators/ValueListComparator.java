package comparators;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class ValueListComparator implements Comparator<Integer>
{

	Map<Integer, List<Integer>> map;



	public ValueListComparator(Map<Integer, List<Integer>> map)
	{
		this.map=map;
	}

	@Override
	public int compare(Integer o1, Integer o2)
	{
		System.out.print(map.get(o1).iterator().next() + " ");
		System.out.print(map.get(o2).iterator().next()+ " ");
		System.out.println(map.get(o1).iterator().next().compareTo(map.get(o2).iterator().next()));
		return map.get(o1).iterator().next().compareTo(map.get(o2).iterator().next());
	}

}
