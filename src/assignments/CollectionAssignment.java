package assignments;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CollectionAssignment {

	public static void main(String[] args) {
		// Student 1 details

		Map<String, String> student1 = new LinkedHashMap<String, String>();
		student1.put("Name", "John Doe");
		student1.put("Age", "Twenty");
		student1.put("Gender", "Male");
		student1.put("Roll Number", "SBA12345");
		student1.put("Grade", "A++");
		student1.put("Major", "Computer Science");
		student1.put("GPA", "A3.8");
		student1.put("Email", "john@example.com");
		student1.put("PAN Number", "SDF6543210");
		student1.put("Address", "123 Elm St");
        
        
		// Student 2 details

		Map<String, String> student2 = new LinkedHashMap<String, String>();
		student2.put("Name", "Jane Smith");
		student2.put("Age", "Twenty One");
		student2.put("Gender", "Female");
		student2.put("Roll Number", "SBA12346");
		student2.put("Grade", "B+");
		student2.put("Major", "Mathematics");
		student2.put("GPA", "A3.8");
		student2.put("Email", "jane@example.com");
		student2.put("PAN Number", "REW6543211");
		student2.put("Address", "456 Oak St");
        
        
    	// Student 3 details

		Map<String, String> student3 = new LinkedHashMap<String, String>();
		student3.put("Name", "Mike Brown");
		student3.put("Age", "Twenty Two");
		student3.put("Gender", "Male");
		student3.put("Roll Number", "SBA12347");
		student3.put("Grade", "A+");
		student3.put("Major", "Physics");
		student3.put("GPA", "A3.9");
		student3.put("Email", "mike@example.com");
		student3.put("PAN Number", "TYR6543212");
		student3.put("Address", "789 Pine St");
        
        
        Map<String, Map<String,String>> student = new LinkedHashMap<String, Map<String,String>>();
        student.put("student1", student1);
        student.put("student2", student2);
        student.put("student3", student3);
        
       
        
        //Employee 1 details
        Map<String, String> Employee1 = new LinkedHashMap<String, String>();
        Employee1.put("Employee ID", "E001");
        Employee1.put("Name", "Alice Green");
        Employee1.put("Age", "Thirty");
        Employee1.put("Gender", "Female");
        Employee1.put("Department", "Engineering");
        Employee1.put("Position", "Software Engineer");
        Employee1.put("Salary", "75K Pounds");
        Employee1.put("Email", "alice@example.com");
		Employee1.put("PAN Number", "SDF6543210");
		
		   //Employee 2 details
        Map<String, String> Employee2 = new LinkedHashMap<String, String>();
        Employee2.put("Employee ID", "E002");
        Employee2.put("Name", "Bob Johnson");
        Employee2.put("Age", "Thirty Five");
        Employee2.put("Gender", "Male");
        Employee2.put("Department", "Marketing");
        Employee2.put("Position", "Marketing Manager");
        Employee2.put("Salary", "85K Pounds");
        Employee2.put("Email", "bob@example.com");
        Employee2.put("PAN Number", "REW6543211");
        
        //Employee 3 details
        Map<String, String> Employee3 = new LinkedHashMap<String, String>();
        Employee3.put("Employee ID", "E003");
        Employee3.put("Name", "Carol White");
        Employee3.put("Age", "Twenty Eight");
        Employee3.put("Gender", "Female");
        Employee3.put("Department", "Sales");
        Employee3.put("Position", "Sales Executive");
        Employee3.put("Salary", "65K Pounds");
        Employee3.put("Email", "carol@example.com");
        Employee3.put("PAN Number", "TYR6543212");
	    
        Map<String,Map<String,String>> employee = new LinkedHashMap<String,Map<String,String>>();
        employee.put("Employee1", Employee1);
        employee.put("Employee2", Employee2);
        employee.put("Employee3", Employee3);
        
        
        //Product 1 details
        Map<String, String> Product1 = new LinkedHashMap<String, String>();
        Product1.put("Product ID", "P001");
        Product1.put("Name", "Laptop");
        Product1.put("Category", "Electronics");
        Product1.put("Price", "12K Pounds");
        Product1.put("Stock Quantity", "Not Available");
        Product1.put("Supplier", "Tech Supplies");
        Product1.put("Warranty", "2 years");
        Product1.put("Rating", "4.5 Stars");
        Product1.put("Manufacturing Date", "Aug 2023");
        Product1.put("Expiry Date", "Aug 2028");
        
      //Product 2 details
        Map<String, String> Product2 = new LinkedHashMap<String, String>();
        Product2.put("Product ID", "P002");
        Product2.put("Name", "Desk Chair");
        Product2.put("Category", "Furniture");
        Product2.put("Price", "150K Pounds");
        Product2.put("Stock Quantity", "Two");
        Product2.put("Supplier", "Office Depot");
        Product2.put("Warranty", "1 year");
        Product2.put("Rating", "4 Stars");
        Product2.put("Manufacturing Date", "Sep 2024");
        Product2.put("Expiry Date", "N/A");
        
        //Product 3 details
        Map<String, String> Product3 = new LinkedHashMap<String, String>();
        Product3.put("Product ID", "P003");
        Product3.put("Name", "Coffee Maker");
        Product3.put("Category", "Kitchen");
        Product3.put("Price", "75 Pounds");
        Product3.put("Stock Quantity", "Two Hundred");
        Product3.put("Supplier", "KitchenWorld");
        Product3.put("Warranty", "6 months");
        Product3.put("Rating", "4.2 Stars");
        Product3.put("Manufacturing Date", "Jan 2025");
        Product3.put("Expiry Date", "Jan 2027");
        
        Map<String,Map<String,String>> Products = new LinkedHashMap<String,Map<String,String>>();
        Products.put("Product1", Product1);
        Products.put("Product2", Product2);
        Products.put("Product3", Product3);
      
        
        System.out.println("Supplier Name is :  "+Product2.get("Supplier"));
        
	}

}
