
public class Flujo {
	public static void main(String[] args) {
		System.out.println("Inicio main");
		metodo1();
		System.out.println("Fin main");
	}
	public static void metodo1() {
		System.out.println("Inicio metodo1");
		metodo2();
		System.out.println("Fin metodo1");
	}
	private static void metodo2() {
		System.out.println("inicio metodo 2");
		throw new ArithmeticException("surgio error");
	
	}
}
