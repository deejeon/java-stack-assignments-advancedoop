package com.danieljeon.calculator;

import java.io.Serializable;

public class Calculator implements Serializable {
	private double operandOne;
	private double operandTwo;
	private String operation;
	private double result;
	
	public Calculator() {
		
	}
	
	public Calculator(double operandOne, String operation, double operandTwo) {
		this.operandOne = operandOne;
		this.operation = operation;
		this.operandTwo = operandTwo;
	}
	
	public void performOperation() {
		if (this.operation == "+") {
			this.setResult(this.operandOne + this.operandTwo);
		}
		else if (this.operation == "-") {
			this.setResult(this.operandOne - this.operandTwo);
		}
	}
	
	public double getOperandOne() {
		return operandOne;
	}
	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}
	public double getOperandTwo() {
		return operandTwo;
	}
	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}
	
}
