package comparators;

import java.util.Arrays;
import java.util.Comparator;

public class Sorter
{

	public static void main(String... args)
	{
		String[] names = {"Ion Popa", "Dan Balan", "Ana Ciubotari", "Vasile Popescu", "John Smith", "Adela Ada"};

		Arrays.sort(names, new Comparator<String>(){
			@Override
			public int compare(String o1, String o2)
			{
				return o1.split(" ")[1].compareTo(o2.split(" ")[1]);
			}
		});

		System.out.println(Arrays.toString(names));
	}

}
