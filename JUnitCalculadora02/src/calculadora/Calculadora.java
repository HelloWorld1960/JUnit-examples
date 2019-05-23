package calculadora;

public class Calculadora {
	//Atributos.
	public static int ans;
	
	//Constructor.
	public Calculadora() {
		ans = 0;
	}
	
	//Metodos.
	
	public static int add(int a, int b) {
		ans = a + b;
		return (ans);
	}
	
	public static int sub(int a, int b){
		ans = a - b;
		return (ans);
	}
	
	public static int div(int a, int b) {
		if(b == 0) {
			throw new ArithmeticException("No puedes dividir por cero!!!");
		}
		ans = a / b;
		return (ans);
	}
	
	public int add(int v) {
		ans+= v;
		return (ans);
	}
	
	public int sub(int v) {
		ans-= v;
		return (ans);
	}
	
	public int ans() {
		return (ans);
	}
	
	public void clear() {
		ans = 0;
	}
	
	public void operacionOptima() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		}
	}

}
