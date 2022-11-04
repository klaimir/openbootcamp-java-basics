public abstract class Coche {
	
	String color;
	String fabricante;
	Double peso;
	Integer velocidad = 0;

	/**
	 * @param color
	 * @param fabricante
	 * @param peso
	 * @param velocidad
	 */
	public Coche(String color, String fabricante, Double peso, Integer velocidad) {
		super();
		this.color = color;
		this.fabricante = fabricante;
		this.peso = peso;
		this.velocidad = velocidad;
	}

	public Coche() {
		// TODO Auto-generated constructor stub
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Integer getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(Integer velocidad) {
		this.velocidad = velocidad;
	}
	
	@Override
	public String toString() {
		return "Coche [color=" + color + ", fabricante=" + fabricante + ", peso=" + peso + ", velocidad=" + velocidad
				+ "]";
	}
	
	public void acelerar(Integer cantidad) {
		if(cantidad > 0 && cantidad <= 120) {
			this.velocidad += cantidad;
		}
	}
}