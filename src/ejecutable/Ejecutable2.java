package ejecutable;

import modelo.Pelota;
import modelo.Persona;

public class Ejecutable2 {

	public static void main(String[] args) {
		Persona p=new Persona("Mikel",34,78,180,'h');
		System.out.println(p);
		Pelota pelota=new Pelota("blanca", "pequeña", "adidas");
		System.out.println(pelota);
		p.botarPelota(pelota);
	}

}
