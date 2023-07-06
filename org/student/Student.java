package org.student;

import org.college.College;
import org.department.Department;

public class Student extends Department {


		public void studentName() {
			System.out.println("studentName");
			}
		
		public void studentDept() {
			System.out.println("studentDept");
		}
		public void studentId() {
			System.out.println("studentId");}
		
		public static void main(String args[]) {
			
			Student obj=new Student() ;
			obj.collegeName();
			obj.collegeCode();
			obj.collegeRank();
			obj.deptName();
			obj.studentName();
			obj.studentDept();
			obj.studentId();
			
		}

		
			
		}




