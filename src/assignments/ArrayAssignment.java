package assignments;

public class ArrayAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][][] student = new String[5][5][6];
		// Sem 1 Subject Name
		student[0][0][0] = "Mathematic1";
		student[0][0][1] = "Physics";
		student[0][0][2] = "Chemistry";
		student[0][0][3] = "Computer Programming";
		student[0][0][4] = "EngineeringDrawing";
		student[0][0][5] = "Basic Electrical Eng";
		// Sem 1 Subject Marks
		student[0][1][0] = "Pass(78)";
		student[0][1][1] = "Pass(85)";
		student[0][1][2] = "Fail(21)";
		student[0][1][3] = "Pass(74)";
		student[0][1][4] = "Pass(88)";
		student[0][1][5] = "Pass(79)";

		// Sem 2 Subject Name
		student[1][0][0] = "Mathematic11";
		student[1][0][1] = "Mechanics";
		student[1][0][2] = "Environmental sci";
		student[1][0][3] = "Basic Electronics";
		student[1][0][4] = "Engineering Physics";
		student[1][0][5] = "Engineering Graphics";
		// Sem 2 Subject Marks
		student[1][1][0] = "Pass(82)";
		student[1][1][1] = "Pass(77)";
		student[1][1][2] = "Fail(93)";
		student[1][1][3] = "Fail(19)";
		student[1][1][4] = "Fail(24)";
		student[1][1][5] = "Pass(90)";

		// Sem 3 Subject Name
		student[2][0][0] = "Data Structures";
		student[2][0][1] = "Discrete Mathematics";
		student[2][0][2] = "Digital Electronics";
		student[2][0][3] = "Operating Systems";
		student[2][0][4] = "Signals and Systems";
		student[2][0][5] = "Oject-oriented prog.";
		// Sem 3 Subject Marks
		student[2][1][0] = "Pass(88)";
		student[2][1][1] = "Pass(81)";
		student[2][1][2] = "Fail(76)";
		student[2][1][3] = "Fail(32)";
		student[2][1][4] = "Pass(85)";
		student[2][1][5] = "Pass(78)";

		// Sem 4 Subject Name
		student[3][0][0] = "Algoriths";
		student[3][0][1] = "Computer Networks";
		student[3][0][2] = "Database systems";
		student[3][0][3] = "Microprocessors";
		student[3][0][4] = "Communication Eng";
		student[3][0][5] = "Software Engineering";
		// Sem 4 Subject Marks
		student[3][1][0] = "Pass(91)";
		student[3][1][1] = "Pass(73)";
		student[3][1][2] = "Fail(19)";
		student[3][1][3] = "Pass(80)";
		student[3][1][4] = "Pass(76)";
		student[3][1][5] = "Pass(87)";

		// Sem 5 Subject Name
		student[4][0][0] = "Probability & Stats";
		student[4][0][1] = "Machine Learning";
		student[4][0][2] = "Compiler Design";
		student[4][0][3] = "Theory of Computation";
		student[4][0][4] = "Embedded Systems";
		student[4][0][5] = "Computer Graphics";
		// Sem 5 Subject Marks
		student[4][1][0] = "Pass(86)";
		student[4][1][1] = "Pass(88)";
		student[4][1][2] = "Fail(84)";
		student[4][1][3] = "Pass(95)";
		student[4][1][4] = "Pass(73)";
		student[4][1][5] = "Pass(90)";

		System.out.println("Semester 2nd , Subject 4th and 5th names are : "+ student[1][0][3] +" & "+student[1][0][4]);
		System.out.println("Semester 4th , Subject 3rd and 6th Status/Marks are : "+student[3][1][2] + " & "+student[3][1][5] );
	}

}
