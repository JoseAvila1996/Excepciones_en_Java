
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
		for(int i = 1;i <=3; i++) {
			System.out.println(i);
		}
		System.out.println("fin metodo2");
	}
}
