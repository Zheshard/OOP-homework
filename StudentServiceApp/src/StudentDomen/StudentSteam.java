package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentSteam implements Iterable<StudentGroup> {
	private long steamID;
	private List<StudentGroup> studentGroups;

	public long steamID() {
		return steamID;
	}

	public void setStudentID(long steamID) {
		this.steamID = steamID;
	}

	public StudentSteam(List<StudentGroup> studentGroups) {
		this.studentGroups = studentGroups;
	}

	public List<StudentGroup> getStudentGroup() {
		return studentGroups;
	}

	public void setStudents(List<StudentGroup> studentGroups) {
		this.studentGroups = studentGroups;
	}

	@Override
	public Iterator<StudentGroup> iterator() {
		return new StudentSteamIterator(studentGroups);
	}

}
