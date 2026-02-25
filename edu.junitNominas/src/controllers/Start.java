package controllers;

/**
 * 
 */
public class Start {

	/**
	 * @param args
	 */
	/**

	 * Calcula el salario neto de un empleado.
	 * * * Reglas de Negocio:
	 * 1. Salario Base: Se recibe como parámetro.
	 * 2. Antigüedad: Por cada año trabajado, se suman 50€ al base.
	 * 3. Horas Extra: Se pagan a 30€ cada una.
	 * - ¡IMPORTANTE!: La empresa tiene política de "Bienestar".
	 * No se pagan más de 10 horas extra. Si haces más de 10, solo te pagan 10.
	 * 4. Impuestos (IRPF):
	 * - Si el Sueldo Bruto es menor a 2000€: Se retiene un 10%.
	 * - Si el Sueldo Bruto es mayor o igual a 2000€: Se retiene un 15%.
	 * * @param base Salario base mensual (ej. 1500).
	 * @param anios Antigüedad en la empresa.
	 * @param horasExtra Cantidad de horas extra realizadas.
	 * @return Salario Neto final o -1 si hay datos inválidos.
	 */
	public double calcularSalarioNeto(double base, int anios, int horasExtra) {
	    
	  
	    if (base < 0 || anios < 0 || horasExtra < 0) {
	        return -1;
	    }

	    double sueldoBruto = base;

	         sueldoBruto += (anios * 50);

	    
	    if (horasExtra > 10) {
	        horasExtra = 10; 
	    }
	    
	    sueldoBruto += (horasExtra * 30);

	          double sueldoNeto;
	    
	    if (sueldoBruto < 2000) {
	        sueldoNeto = sueldoBruto * 0.90; 
	    } else {
	       sueldoNeto = sueldoBruto * 0.85; 
	    }

	    return sueldoNeto;
	}

}
