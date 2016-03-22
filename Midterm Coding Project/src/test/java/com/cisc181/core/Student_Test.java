package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;
import com.cisc181.eNums.eTitle;

public class Student_Test {

	@BeforeClass
	public static void setup() {
	}

	@Test
	public void test() {
		assertEquals(1, 1);
	}

	public void test_Student() throws PersonException{
		ArrayList<Course> listofcourses = new ArrayList<Course>();
		
		Course course1 = new Course(865745c6-efd5-11e5-9ce9-5e5517507c66(),"Econ" , eMajor.BUSINESS);
		Course course2 = new Course(7a154632-4681-4c61-9a00-1bd4875ed72e, "Thermo", eMajor.CHEM);
		Course course3 = new Course(adb35d94-efd5-11e5-9ce9-5e5517507c66, "Electricity and Magnetism", eMajor.PHYSICS);
		
	
		
		listofcourses.add(course1);
		listofcourses.add(course2);
		listofcourses.add(course3);
		
		ArrayList<Semester> listofsemesters = new ArrayList<Semester>():
			Semester semester_spring = new Semester(627ee152-efd7-11e5-9ce9-5e5517507c66,new Date(116,1,10), new Date(116,4,25);
			Semester semester_fall = new Semester(aefe84f6-efd7-11e5-9ce9-5e5517507c66, new Date(115,8,1),new Date(115,11,1));
			
		listofsemesters.add(semester_spring);
		listofsemesters.add(semester_fall);
		
		ArrayList<Section> listofsections = new ArrayList<Section>();
		
		Section section1 = new Section(listofcourses.get(0).getCourseID(),listofsemesters.get(0).getSemesterID(),aefe80b4-efd7-11e5-9ce9-5e5517507c66, 010);
		Section section2 = new Section(listofcourses.get(0).getCourseID(),listofsemesters.get(1).getSemesterID(),d1d538ac-efd8-11e5-9ce9-5e5517507c66, 011);
		Section section3 = new Section(listofcourses.get(1).getCourseID(),listofsemesters.get(0).getSemesterID(),d1d540a4-efd8-11e5-9ce9-5e5517507c66, 012);
		Section section4 = new Section(listofcourses.get(1).getCourseID(),listofsemesters.get(1).getSemesterID(),f4fb57a8-efd8-11e5-9ce9-5e5517507c66, 013);
		Section section5 = new Section(listofcourses.get(2).getCourseID(),listofsemesters.get(0).getSemesterID(),f4fb5a3c-efd8-11e5-9ce9-5e5517507c66, 014);
		Section section6 = new Section(listofcourses.get(2).getCourseID(),listofsemesters.get(1).getSemesterID(),f4fb5c58-efd8-11e5-9ce9-5e5517507c66, 015);
		
		listofsections.add(section1);
		listofsections.add(section2);
		listofsections.add(section3);
		listofsections.add(section4);
		listofsections.add(section5);
		listofsections.add(section6);
		
		ArrayList<Student> listofstudents = new ArrayList<Student>();
		
		Student student1 = new Student("Anna","Renee","Mooney", new Date(96,2,26), eMajor.BUSINESS,
				"155 Jane Way","(302)-123-4567","armooney@udel.edu");
		Student student2 = new Student("Rose","Marie","Moon", new Date(95,1,2), eMajor.NURSING,
				"155 Jane Street","(302)-333-4567","rmmoon@udel.edu");
		Student student3 = new Student("Ann","Ret","Moody", new Date(94,1,5), eMajor.PHYSICS,
				"155 Jane Road","(302)-222-4567","armoody@udel.edu");
		Student student4 = new Student("Steve","Rey","Valko", new Date(93,5,8), eMajor.CHEM,
				"155 Janey Way","(302)-444-4567","srvalko@udel.edu");
		Student student5 = new Student("Sarah","Rebecca","Monet", new Date(100,9,13), eMajor.COMPSI,
				"1550 Janet Way","(302)-999-4567","srmonet@udel.edu");
		Student student6 = new Student("Anny","Ann","Peterton", new Date(101,11,26), eMajor.BUSINESS,
				"255 Janard Way","(302)-888-4567","aapeterton@udel.edu");
		Student student7 = new Student("Luke","George","Smith", new Date(96,8,15), eMajor.BUSINESS,
				"155 Janardy Way","(302)-101-4567","smith@udel.edu");
		Student student8 = new Student("Gabbs","Seana","Peden", new Date(96,9,4), eMajor.COMPSI,
				"1558 Janardo Way","(302)-255-4567","gabbs@udel.edu");
		Student student9 = new Student("Mo","Capps","Armstrong", new Date(100,10,26), eMajor.CHEM,
				"1557 Jane Court","(302)-898-4567","cappsarm@udel.edu");
		Student student10 = new Student("Coly","Alexa","Bull", new Date(96,8,16), eMajor.COMPSCI,
				"15 Janandot Way","(302)-897-4567","bulls@udel.edu");
		listofstudents.add(student1);
		listofstudents.add(student2);
		listofstudents.add(student3);
		listofstudents.add(student4);
		listofstudents.add(student5);
		listofstudents.add(student6);
		listofstudents.add(student7);
		listofstudents.add(student8);
		listofstudents.add(student9);
		listofstudents.add(student10);
	
	}

}