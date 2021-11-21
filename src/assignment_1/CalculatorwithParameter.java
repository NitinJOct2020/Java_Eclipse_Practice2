package assignment_1;

public class CalculatorwithParameter {
	void add(int num1, int num2) {
		int add=num1+num2;
		System.out.println("Addition is "+add);
	}
	void sub(int num1, int num2) {
		int sub=num1-num2;
		System.out.println("Substraction is "+sub);
	}
	void mul(int num1, int num2) {
		int mul=num1*num2;
		System.out.println("Multiplication is "+mul);
	}
	void div(int num1, int num2) {
		int div=num1/num2;
		System.out.println("Division is "+div);
	}
	public static void main(String[] args) {
		CalculatorwithParameter calculatorwithParameter = new CalculatorwithParameter();
		calculatorwithParameter.add(10,5);
		calculatorwithParameter.sub(10,5);
		calculatorwithParameter.mul(10,5);
		calculatorwithParameter.div(10,5);
	}
}
