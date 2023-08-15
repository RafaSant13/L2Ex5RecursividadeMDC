package controller;

public class MDCControle {

	public MDCControle() {
		super();
	}
	
	public int MDC(int x, int y) {
		//Condição de Parada -> Quando x é igual a y, pois assim o MDC é o valor de x
		if (x == y) {
			return x;
		}
		else
		{
			if (x<y)
			{
				int z = x;
				x = y;
				y = z;
			}
			//A função é chamada no retorno, com y subtraindo x para que eles possam se igualar
			return MDC((x - y), y);
		}
	}
}
