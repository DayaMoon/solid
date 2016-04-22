import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class comparators
{

	public static void main(String[] args){

		foo(new ArrayList<Integer>());
		boo(new TreeSet<Integer>());
	}

	static void foo(List<Integer> list ){};

	static void boo(Set<Integer> list ){};
}
