package assignments;

public class EmpGroups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Created new class this contain two arrays
		String[] EmployeeName = new String[3];
		int[] EmployeeIds = new int[3];

		// Created the instance of the Employees class
		Employess obj = new Employess();
		
		//Retrieving data from the Employees class storing in the array
		EmployeeName[0]=obj.Name1;
		EmployeeName[1]=obj.Name2;
		EmployeeName[2]=obj.Name3;
		
		EmployeeIds[0]=obj.id1;
		EmployeeIds[1]=obj.id2;
		EmployeeIds[2]=obj.id3;
		
		System.out.println("Employee Name : "+EmployeeName[0] + " , "+ "Employee Id : "+EmployeeIds[0] );
		System.out.println("Employee Name : "+EmployeeName[1] + " , "+ "Employee Id : "+EmployeeIds[1] );
		System.out.println("Employee Name : "+EmployeeName[2] + " , "+ "Employee Id : "+EmployeeIds[2] );
		

	}

}
