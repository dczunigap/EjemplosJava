package com.mx.dzuniga;

public class UsoAbstracto extends Abstracta {

	final int NUMERO = 24;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsoAbstracto usoAbs = new UsoAbstracto();
		usoAbs.miMetodo();
		
		String s[] = new String[]{"Zero", "One", "Two"};
	}

	@Override
	void miMetodo() {
		// TODO Auto-generated method stub
		System.out.println("Vacaciones");
	}

}
