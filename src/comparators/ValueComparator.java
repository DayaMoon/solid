package comparators;

import java.util.Comparator;
import java.util.Map;

public class ValueComparator implements Comparator<Integer> {

    private Map<Integer, String> map;

    public ValueComparator(Map<Integer, String> map) {
        this.map = map;
    }

    @Override
	public int compare(Integer a, Integer b) {
        return map.get(a).compareTo(map.get(b));
    }
}