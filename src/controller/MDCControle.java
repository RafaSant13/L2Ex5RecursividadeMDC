package controller;

public class MDCControle {

	public MDCControle() {
		super();
	}
	
	public int MDC(int x, int y) {
		//Condi��o de Parada -> Quando x � igual a y, pois assim o MDC � o valor de x
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
			//A fun��o � chamada no retorno, com y subtraindo x para que eles possam se igualar
			return MDC((x - y), y);
		}
	}
}
