package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentSteamIterator implements Iterator<StudentGroup> {
	private int counter;
	private final List<StudentGroup> studentGroups;

	public StudentSteamIterator(List<StudentGroup> studentGroups) {
		this.studentGroups = studentGroups;
		this.counter = 0;
	}

	@Override
	public boolean hasNext() {
		return counter < studentGroups.size();
	}

	@Override
	public StudentGroup next() {
		if (!hasNext()) {
			return null;
		}
		return studentGroups.get(counter++);
	}

}
