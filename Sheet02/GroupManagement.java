...

public class GroupManagement {
	private static final int numberOfGroups = 5;
	private static final int maxNumberOfStudentsPerGroup = 30;
	private static final int totalNumberOfStudents = 150;

	private List<Group> groups;
	private List<Student> students;
	private RandomNameGenerator randomNameGenerator = new RandomNameGenerator();

	public void createGroups() {...}
	public void createAndAddStudents() {...}
	public void printGroups() {
		for(Group group : groups) {
			group.printStudents();
		}
	}

	public List<Student> getStudents() {
		return students;
	}

	public static void main(String[] args) {
		GroupManagement management = new GroupManagement();
		management.createGroups();
		management.createAndAddStudents();
		management.printGroups();
	}
}
