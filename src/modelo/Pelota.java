package modelo;

public class Pelota {
	private String color, tamanyo, marca;

	public Pelota(String color, String tamanyo, String marca) {
		this.color = color;
		this.tamanyo = tamanyo;
		this.marca = marca;
	}

	public Pelota() {
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTamanyo() {
		return tamanyo;
	}

	public void setTamanyo(String tamanyo) {
		this.tamanyo = tamanyo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Pelota [color=" + color + ", tamanyo=" + tamanyo + ", marca=" + marca + "]";
	}
	
	
}
