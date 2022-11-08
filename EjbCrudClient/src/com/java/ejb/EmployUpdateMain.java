package com.java.ejb;

import java.sql.SQLException;
import java.util.Scanner;

import javax.naming.InitialContext;
import javax.naming.NamingException;

public class EmployUpdateMain {
public static void main(String[] args) throws NamingException, ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		Employ employ = new Employ();
		System.out.println("Enter No  ");
		employ.setEmpno(sc.nextInt());
		   EmployCrudBeanRemote service = null;
		    service = (EmployCrudBeanRemote)
		    		new InitialContext().lookup("EmployCrudBean/remote");
		    if(employ !=null){
		    	System.out.println("Enter Name  ");
				employ.setName(sc.next());
				System.out.println("Enter Department  ");
				employ.setDept(sc.next());
				System.out.println("Enter Designation  ");
				employ.setDesig(sc.next());
				System.out.println("Enter Basic   ");
				employ.setBasic(sc.nextInt());
		    System.out.println(service.updateEmployBean(employ));
		    }
}
}
