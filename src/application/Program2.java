package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("==== TEST 1: Department findById ====");
		Department department = departmentDao.findById(2);
		System.out.println(department);
		
		System.out.println("\n==== TEST 2: Department findAll ====");
		List<Department> list = departmentDao.findAll();
		for (Department dep : list) {
			System.out.println(dep);
		}
		
		System.out.println("\n==== TEST 4: Department insert ===="); Department
		newDepartment = new Department(null, "Food");
		departmentDao.insert(newDepartment); 
		System.out.println("Inserted! New id = " + newDepartment.getId());
		 
		
		System.out.println("\n==== TEST 3: Department delete ====");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed");
		
		System.out.println("\n==== TEST 2: Department update ====");
	
	}

}
