package com.mx.dzuniga;

public abstract class Abstracta {
	abstract void miMetodo();
	
	public static void main(String[] args) {
		System.out.println("Antes");
		Estatic estatic = new Estatic();
		System.out.println(estatic.salida());
		
		int num = 10;
		Integer numeroUno = new Integer(num);
		Integer numeroDos = new Integer(num);
		int numUno = new Integer(num);
		int numDos = new Integer(num);
		int numberUno = num;
		int numberDos = num;
		System.out.println("------ numero primitivo int ------");
		System.out.println(num);
		System.out.println("----------------------------------");
		if (numberUno == numberDos) {
			System.out.println("number Iguales");
			System.out.println(numberUno);
			System.out.println(numberDos);
		} else {
			System.out.println("number No Iguales");
		}
		if (numUno == numDos) {
			System.out.println("num Iguales");
			System.out.println(numUno);
			System.out.println(numDos);
		} else {
			System.out.println("num No Iguales");
		}
		if (numeroDos == numeroUno) {
			System.out.println("Iguales");
		} else {
			System.out.println("No Iguales");
			System.out.println(numeroUno);
			System.out.println(numeroDos);
		}
	}
	
	static{
		System.out.println("Jujujuju");
	}
	
	static class Estatic{
		public String salida(){
			return "salia";
		}
	}
}
