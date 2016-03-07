package org.elsys.postfix;

public class Multiply extends BinaryOperation{
	
	public Multiply() {
		super("*");
	}
	
	public double calc(double v1, double v2){
		double res = v1 * v2;
		getContext().push(res);
		return res;
	}

}
