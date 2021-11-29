package es.ubu.asi;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;



/**
 * Calculadora.
 * 
 * @author davalv
 */
@WebService
public class Calculadora implements CalculadoraInterface {
	
	@Resource
	private WebServiceContext wsContext;

	private List<Float> resultados;
    /**
     * Default constructor. 
     */
    public Calculadora() {
        this.resultados = new ArrayList<>();
    }

	@Override
	@WebMethod
	public float sumar(float sumando1, float sumando2) {
		float resultado = sumando1 + sumando2;
		resultados.add(resultado);
		return resultado;
	}

	@Override
	@WebMethod
	public float restar(float minuendo, float sustraendo) {
		float resultado = minuendo - sustraendo;
		resultados.add(resultado);
		return resultado;
	}

	@Override
	@WebMethod
	public float multiplicar(float factor1, float factor2) {
		float resultado = factor1 * factor2;
		resultados.add(resultado);
		return resultado;
	}

	@Override
	@WebMethod
	public float dividir(float dividendo, float divisor) {
		float resultado = dividendo / divisor;
		resultados.add(resultado);
		return resultado;
	}

	@Override
	@WebMethod
	public List<Float> consultar() {
		return this.resultados;
	}
    

}
