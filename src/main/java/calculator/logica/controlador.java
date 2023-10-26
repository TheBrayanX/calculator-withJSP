package calculator.logica;

import calculadora.data.resultado;

public class controlador {
	float num1 = 0f;
	float num2 = 0f;
	int op = 0;
	resultado rs = new resultado();
	
	public controlador() {
		super();
	}
	
	public controlador(String num1, String num2, String op) {
		super();
		this.num1 = Float.parseFloat(num1);
		this.num2 = Float.parseFloat(num2);
		this.op = Integer.parseInt(op);
	}

	public float getNum1() {
		return num1;
	}

	public void setNum1(float num1) {
		this.num1 = num1;
	}

	public float getNum2() {
		return num2;
	}

	public void setNum2(float num2) {
		this.num2 = num2;
	}

	public float getResult() {
		rs.setResult(num1,num2,op);
		return rs.getResult();
	} 

	public int getOp() {
		return op;
	}

	public void setOp(int op) {
		this.op = op;
	}
	
	
}
