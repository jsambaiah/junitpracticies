package com.corejava.juintbasics.collections;

import java.util.*;

public class EmpArrayList {

	public static void main(String[] args) {
		
		List<Employee> empAL = new ArrayList<Employee>();

		
		Employee emp1 = new Employee();
		emp1.setEmpID(101);
		emp1.setEmpName("kavitha");
		emp1.setSalary(20000);
		emp1.setAge(14);
		emp1.setGender("Female");
		
		Employee emp2 = new Employee();
		emp2.setEmpID(105);
		emp2.setEmpName("Yakshitha");
		emp2.setSalary(30000);
		emp2.setAge(10);
		emp2.setGender("Female");
		
		Employee emp3 = new Employee();
		emp3.setEmpID(103);
		emp3.setEmpName("samba");
		emp3.setSalary(50000);
		emp3.setAge(38);
		emp3.setGender("Male");
		
		Employee emp4 = new Employee(101,"Kavitha",65000,8,"Female");
		Employee emp5 = new Employee(121,"Dhruvan",30000,25,"Male");
		Employee emp6 = new Employee(125,"Charan",40000,15,"Male");
		
		empAL.add(emp1);
		empAL.add(emp2);
		empAL.add(emp3);
		empAL.add(emp4);
		empAL.add(emp5);
		empAL.add(emp6);
		
		//Using for loop we can get employee data
		/* for(int i = 0; i < empAL.size(); i++){
		    System.out.println( empAL.get(i) );
		}
		*/
		
		//Using Iterator we can get employee data
		/*Iterator<Employee> itr = empAL.iterator();
		while(itr.hasNext())
		{
			System.out.println("Employee Id Name Salary Age Gender.."  + itr.next());
		}*/
		
		
		 // Sorting student entries by roll number
        Collections.sort(empAL, new SortById());
        // Display message on console for better readability
        System.out.println("Sorted by Employee ID");
 
        // Again iterating over entries to print them
        for (int i = 0; i < empAL.size(); i++)
            System.out.println(empAL.get(i));
		
        
        Comparator.comparing(Employee::getEmpName)
        .thenComparingInt(Employee::getAge)
        .thenComparingInt(Employee::getSalary);
        
       // Collections.sort(empAL, new SortByNameAndAge());
        
        System.out.println("************");
        System.out.println("Sorted by Employee Name and age");
        for (Employee emp : empAL) {
            System.out.println(emp.toString());
        }

	}

}
