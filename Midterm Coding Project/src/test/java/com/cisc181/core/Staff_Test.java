package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}

	@Test
	public void test() {
		assertEquals(1, 1);
	}
	
	@Test
	public void test_Staff() throws PersonException{
		ArrayList<Staff> listofstaff = new ArrayList<Staff>();
		
		Staff staff1 = new Staff("Anna", "Renee", "Mooney", new Date(96,2,26), "155 Jane Court", "(302)-123-4567",
				"armooney@udel.edu", "monday", 10, 100000.00, new Date(116,2,20), eTitle.MS);
		Staff staff2 = new Staff("Anna", "Renee", "Mooney", new Date(96,2,26), "155 Jane Court", "(302)-123-4567",
				"armooney@udel.edu", "monday", 10, 200000.00, new Date(116,2,20),eTitle.MS);
		Staff staff3 = new Staff("Anna", "Renee", "Mooney",new Date(96,2,26) , "155 Jane Court", "(302)-123-4567",
				"armooney@udel.edu", "monday", 10, 300000.00, new Date(116,2,20), eTitle.MS);
		Staff staff4 = new Staff("Anna", "Renee", "Mooney", new Date(96,2,26), "155 Jane Court", "(302)-123-4567",
				"armooney@udel.edu", "monday", 10, 400000.00, new Date(116,2,20), eTitle.MS);
		Staff staff5 = new Staff("Anna", "Renee", "Mooney",new Date(96,2,26) , "155 Jane Court", "(302)-123-4567",
				"armooney@udel.edu", "monday", 10, 500000.00, new Date(116,2,20), eTitle.MS);
		
		listofstaff.add(staff1);
		listofstaff.add(staff2);
		listofstaff.add(staff3);
		listofstaff.add(staff4);
		listofstaff.add(staff5);
		

		double total = 0;
		double average;
		for(int i = 0; i < listofstaff.size(); i++){
			total += listofstaff.get(i).getSalary();
		}
		average = total/listofstaff.size();
		assertEquals(300000.00, average, 0);
	}
	
}
