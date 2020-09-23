package com.fdmgroup.tdd.gradecalculator;

public class GradeCalculator implements GradeCalculatorService {
	public String getClassification(double mark) {
		if (mark >= 90 && mark <= 100) {
			return "distinction";
		}
		else if (mark >= 80) {
			return "merit";
		}
		else if (mark > 75)
			return "pass";
		else
			return "fail";
	}
	public static void main(String[] args) {
		GradeCalculator grade = new GradeCalculator();
		String mark = grade.getClassification(0);
		String mark1 = grade.getClassification(40.0);
		System.out.println(mark);
		System.out.println(mark1);
	}
}
