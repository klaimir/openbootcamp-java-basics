package com.openbootcamp.java.summay;

public class CocheElectrico extends Coche {
	
	String motorElectrico;

	/**
	 * @param color
	 * @param fabricante
	 * @param peso
	 * @param velocidad
	 * @param motorElectrico
	 */
	public CocheElectrico(String color, String fabricante, Double peso, Integer velocidad, String motorElectrico) {
		super(color, fabricante, peso, velocidad);
		this.motorElectrico = motorElectrico;
	}

	public CocheElectrico() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the motorElectrico
	 */
	public String getMotorElectrico() {
		return motorElectrico;
	}

	/**
	 * @param motorElectrico the motorElectrico to set
	 */
	public void setMotorElectrico(String motorElectrico) {
		this.motorElectrico = motorElectrico;
	}

	@Override
	public String toString() {
		return "com.openbootcamp.java.basics.CocheElectrico [motorElectrico=" + motorElectrico + ", color=" + color + ", fabricante=" + fabricante
				+ ", peso=" + peso + ", velocidad=" + velocidad + "]";
	}

	@Override
	public void acelerar(Integer cantidad) {
		Integer cantidadAjustada = cantidad * 2;
		super.acelerar(cantidadAjustada);
	}	

}
