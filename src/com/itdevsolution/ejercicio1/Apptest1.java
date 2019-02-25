package com.itdevsolution.ejercicio1;
import java.io.*;


public class Apptest1 {

	public static void main(String[] args) {
		
		Circulo obj1 = new Circulo(5,5,10);
		
		System.out.println("La Circuferencia es : " + obj1.getCircuferencia()); 
		System.out.println("El Diametro equivale a : " + obj1.getDiametro());
	}
	
	public void mostrarCirculo(Circulo obj1) {
		System.out.println(obj1.getCircuferencia());
	}
	

}
