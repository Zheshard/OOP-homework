import java.net.NoRouteToHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import Controllers.EmploeeController;
import StudentDomen.Emploee;
import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.StudentSteam;
import StudentDomen.User;

public class App {
	public static void main(String[] args) throws Exception {
		User u1 = new User("Сергей", "Иванов", 25);
		Student s1 = new Student("Сергей", "Иванов", 25, (long) 101);
		Student s2 = new Student("Андрей", "Сидоров", 22, (long) 111);
		Student s3 = new Student("Иван", "Петров", 22, (long) 121);
		Student s4 = new Student("Игорь", "Иванов", 23, (long) 301);
		Student s5 = new Student("Даша", "Цветкова", 23, (long) 171);
		Student s6 = new Student("Лена", "Незабудкина", 23, (long) 104);

		List<Student> listStud = new ArrayList<Student>();
		listStud.add(s1);
		listStud.add(s2);
		listStud.add(s3);
		listStud.add(s4);
		listStud.add(s5);
		listStud.add(s6);

		StudentGroup group = new StudentGroup(listStud);

		List<Student> listStud2 = new ArrayList<Student>();
		listStud2.add(s1);
		listStud2.add(s2);
		listStud2.add(s3);

		StudentGroup group2 = new StudentGroup(listStud2);

		List<Student> listStud3 = new ArrayList<Student>();
		listStud3.add(s1);
		listStud3.add(s2);
		listStud3.add(s3);
		listStud3.add(s4);
		listStud3.add(s5);

		StudentGroup group3 = new StudentGroup(listStud3);

		List<StudentGroup> listGroups = new ArrayList<StudentGroup>();
		listGroups.add(group);
		listGroups.add(group2);
		listGroups.add(group3);

		StudentSteam steam = new StudentSteam(listGroups);

		Collections.sort(steam.getStudentGroup());

		int i = 1;
		for (StudentGroup gr : steam) {
			System.out.println("Группа " + i++);
			for (Student stud : gr) {
				System.out.println(stud);
			}
		}

		// System.out.println("============= после сортировки =============");
		// Collections.sort(group.getStudents());

		// for (Student stud : group) {
		// System.out.println(stud);
		// }

		// Emploee peron1 = new Emploee("Иванов", "Олег", 55, 110);
		// Student s1 = new Student("Сергей", "Иванов", 22, (long)101);

		// //EmploeeController contrEmp = new EmploeeController();
		// EmploeeController.paySalary(peron1);
		// //contrEmp.paySalary(s1);

		// Integer studHour[] = {124,234,231,1,45};
		// System.out.println(EmploeeController.mean(studHour));

		// Double emplSalary[] = {12555.23,34213.5,10000.0};
		// System.out.println(EmploeeController.mean(emplSalary));

		// System.out.println(u1);
		// System.out.println(s1);
		// System.out.println(group);
	}
}
