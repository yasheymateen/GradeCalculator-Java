package com.fdmgroup.tdd.gradecalculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GradeCalculatorTest {
	@Test
	public void test_ensuresMeritValueIsFailWhenInputZero() {
		//Arrange
		GradeCalculator grade = new GradeCalculator();
		
		//Act
		String mark = grade.getClassification(0);
		
		//Assert
		assertEquals("fail", mark);
		
	}
	@Test
	public void test_checksMeritClassificationIsFailWhenValueGreaterThanZero() {
		//Arrange
		GradeCalculator grade = new GradeCalculator();
		
		//Act
		String mark = grade.getClassification(40);
		
		//Assert
		assertEquals("fail", mark);
		
	}	
	@Test
	public void test_checksMeritClassificationIsPass() {
		//Arrange
		GradeCalculator grade = new GradeCalculator();
		
		//Act
		String mark = grade.getClassification(76.9);
		
		//Assert
		assertEquals("pass", mark);		
	}
	@Test
	public void test_checksMeritClassificationIsMerit() {
		//Arrange
		GradeCalculator grade = new GradeCalculator();
		
		//Act
		String mark = grade.getClassification(80);
		
		//Assert
		assertEquals("merit", mark);
		
	}
	@Test
	public void test_checksMeritClassificationIsDistinction() {
		//Arrange
		GradeCalculator grade = new GradeCalculator();
		
		//Act
		String mark = grade.getClassification(100.00);
		
		//Assert
		assertEquals("distinction", mark);
		
	}
	void test() {
		fail("Not yet implemented");
	}
}
