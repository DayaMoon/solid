package comparators;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class SortByValue
{

	public static void main(String... args)
	{
		Map<Integer, List<Integer>> random = new HashMap<Integer, List<Integer>>();

			random.put(1, Arrays.asList(new Integer[]{1, 2, 3}));
			random.put(3, Arrays.asList(new Integer[]{-1, -2, -3}));
			random.put(2, Arrays.asList(new Integer[]{4, 5, 6}));
			random.put(4, Arrays.asList(new Integer[]{8, 9, 10}));

		System.out.println("Initial Map: " + Arrays.toString(random.entrySet().toArray()));

		TreeMap<Integer, List<Integer>> sorted = new TreeMap<Integer, List<Integer>>(new ValueListComparator(random));
		sorted.putAll(random);

		System.out.println("Sorted Map: " + Arrays.toString(sorted.entrySet().toArray()));

		String string = "clamping_range_a1_min_I";
		System.out.println(string.substring(string.length() - 1));

		System.out.println(String.format("%05d", 123));
		System.out.println(String.format("%05d", 1234));
		System.out.println(String.format("%05d", 12345));

		String URL = "http://www.nbc.com/Heroes/novels/downloads/";
		System.out.println(isValidHttpUrl(URL));

		URL = "https://www.facebook.com/";
		System.out.println(isValidHttpUrl(URL));

	}


	public static boolean isValidHttpUrl(String urlString) {

		try
		{
			HttpURLConnection huc = (HttpURLConnection) (new URL(urlString)).openConnection();
			huc.setRequestMethod("GET");
			huc.connect();

			if (200==huc.getResponseCode())
			{
				return true;
			}
			return false;
		}
		catch (IOException   e)
		{
			e.printStackTrace();
			return false;
		}
	}
}
