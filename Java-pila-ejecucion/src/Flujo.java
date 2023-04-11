
public class Flujo {
	public static void main(String[] args) {
		System.out.println("Inicio main");
		metodo1();
		System.out.println("Fin main");
	}
	public static void metodo1() {
		System.out.println("Inicio metodo1");
		try {				//try sirve para detectar un error y catch si llega a ocurrir que hacer o imprimir y dejarlo continuar si asi se requiere
			metodo2();
			
		} catch (MyException me) {
			// TODO: handle exception
			me.printStackTrace();
		}
		
		System.out.println("Fin metodo1");
	}
	private static void metodo2() {
		System.out.println("inicio metodo 2");
		throw new MyException("surgio error");
	
	}
}
