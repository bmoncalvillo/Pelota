package ejecutable;

import modelo.Persona;

public class Ejecutable1 {

	public static void main(String[] args) {
		Persona p=new Persona("Mikel",34,78,180,'h');
		System.out.println(p);
		System.out.println("IMC:"+p.calcularImc());
		p.setTalla(185);
		p.setPeso(95);
		System.out.println(p);
		System.out.println("IMC:"+p.calcularImc());
		

	}

}
