package es.ubu.asi;

import javax.xml.ws.BindingProvider;


public class CalculadoraClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float inicial1 = 3.138085f, inicial2 = 8.850995f, result = 0.0f;

		CalculadoraService servicio = new CalculadoraService();		
		Calculadora c = servicio.getCalculadoraPort();

		System.out.println(String.format("Valores iniciales: %f %f", inicial1, inicial2));
		result = c.multiplicar(inicial1, inicial2);
		System.out.println(String.format("Resultado (multiplicar): %f", result));
		System.out.println("Resultado almacenado: " + c.consultar());
		result = c.dividir(inicial1, inicial2);
		System.out.println(String.format("Resultado (dividir): %f", result));
		System.out.println("Resultado almacenado: " + c.consultar());
		
		((BindingProvider)c).getRequestContext().put(BindingProvider.SESSION_MAINTAIN_PROPERTY,true);
	}

}
