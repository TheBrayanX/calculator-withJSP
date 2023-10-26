package calculadora.data;

public class resultado {
	float result = 0f;
	operaciones ope = new operaciones();

	public resultado() {
		super();
	}

	public float getResult() {
		return result;
	}

	public void setResult(float a, float b, int op) {
		if(op == 1){
			this.result = ope.sumar(a,b);
		} else if (op == 2){
			this.result = ope.restar(a,b);
		} else if (op == 3){
			this.result = ope.multiplicar(a,b);
		} else if (op == 4){
			this.result = ope.dividir(a,b);
		}
	}
	
}
