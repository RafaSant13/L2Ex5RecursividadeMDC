package view;
import controller.MDCControle;

public class Principal {

	public static void main(String[] args) {
		MDCControle MC = new MDCControle();
		int x = 20;
		int y = 24;
		System.out.println("O M�ximo Divisor Comum de "+x+" e "+y+" �: "+MC.MDC(x, y) );

	}

}
