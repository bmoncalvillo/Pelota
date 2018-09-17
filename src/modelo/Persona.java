package modelo;

public class Persona {
	private String nombre;
	private int edad;
	private double peso;
	private int talla;
	private char sexo;
	
	public Persona(String nombre, int edad, double peso, int talla, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.talla = talla;
		this.sexo = sexo;
	}

	public Persona() {
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getTalla() {
		return talla;
	}

	public void setTalla(int talla) {
		this.talla = talla;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", talla=" + talla + ", sexo=" + sexo
				+ "]";
	}
	
	public double calcularImc() {
		double tallaMetros=this.talla/100.0;
		double imc=this.peso/(tallaMetros*tallaMetros);
		return imc;
	}
	
	public double esperanzaVida() {
		double anyosVida;
		double imc=this.calcularImc();
		if(this.sexo=='h') {
			anyosVida=75;			
		}
		else{
			anyosVida=80;			
		}
		if(imc>22.5) {
			anyosVida=anyosVida-(imc-22.5)*0.5;
		}
		return anyosVida;
	}
	
	public void botarPelota(Pelota pelota) {
		System.out.println(this.nombre+" bota la pelota "+pelota.getColor()+" "+pelota.getTamanyo());
	}
	
	
	
	
	
	
}
