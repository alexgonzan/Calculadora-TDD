package calculadora;

public class Calculadora {
	private int ans;
	
	
	public Calculadora() {
		ans = 0;
	}
	
	public int add(int a, int b) {
		ans = a + b;
		return ans;
	}
	
	public int div(int a, int b)throws ArithmeticException {
		
		try {
			
			
			if(a==0 || b ==0) {
				System.out.println("No es posible dividir por 0  ");
				
				ans = 0;
				return ans;
			}else {
				ans = a / b;
				return ans;
			}
			
				
		} catch (ArithmeticException e) {
			throw new ArithmeticException();
		}
	
		

		
				
	
	}
	

	public int sub(int a, int b) {
		ans = a - b;
		return ans;
	}
	
	public int add(int v) {
		ans += v;
		return ans;
	}
	
	public int sub(int v) {
		ans -= v;
		return ans;
	}
	
	public int ans() {
		return ans;
	}

	public void clear() {
		ans = 0;
	}
	
	public void operacionOptima() {
		try{
			Thread.sleep(2000);	
		} catch(InterruptedException e) {
			
		}
		
	}
	/**
	public static int suma(int a, int b) {
		return a+b;
	}
	
	public static int resta(int a, int b) {
		return a-b;
	}
	 * @throws Exception 
	 * @throws ArithmeticException 
	
	**/
	public static void main(String[] args){
		Calculadora calc = new Calculadora();
		int a = 5, b = 2;
		
		int res = calc.div(a, b);
		int resu = calc.add(a, b);
		int resul = calc.sub(a, b);
		
		
		
		System.out.println("Division = " + res);
		System.out.println("Suma = " + resu);
		System.out.println("Resta = " + resul);
		
	}
	

}
