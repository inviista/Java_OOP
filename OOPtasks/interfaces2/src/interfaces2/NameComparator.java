package interfaces2;

import java.util.Comparator;

// a.compareTo(b)
// compare(a,b)
public class NameComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.name.compareTo(o2.name);
	}
	
}
