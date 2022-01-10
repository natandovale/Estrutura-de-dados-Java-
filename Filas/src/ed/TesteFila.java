package ed;

public class TesteFila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fila fila = new Fila();
		fila.adiciona("A");
		fila.adiciona("B");
		
		String x1 = fila.remove();
		
		System.out.println(x1);
		System.out.println(fila);
	}

}
