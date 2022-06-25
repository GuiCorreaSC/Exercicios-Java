package curso_POO;

public class CurrencyConverter {

	public double dolar;
	public double dolarbuy;

	
	public double convertor(){
		return dolar * dolarbuy / 100 * 6 + dolar * dolarbuy;
		
	}


	public String toString() {
		return "Valor convertido +6% de IOF /n R$ " 
				+convertor();
	}
	
}
