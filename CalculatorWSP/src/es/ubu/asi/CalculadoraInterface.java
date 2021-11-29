package es.ubu.asi;

import java.util.List;


/**
 * Interface.
 * 
 * @author davalv
 *
 */
public interface CalculadoraInterface {
	public float sumar(float sumando1, float sumando2);
	public float restar(float minuendo, float sustraendo);
	public float multiplicar(float factor1, float factor2);
	public float dividir(float dividendo, float divisor);
	public List<Float> consultar();
}
