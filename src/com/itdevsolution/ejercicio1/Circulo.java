package com.itdevsolution.ejercicio1;

public class Circulo extends Punto {
	
	private double radio;
	private double diametro;
	private double circuferencia;
	private double area;
	
	public Circulo(int x, int y, double radio) {
		super(x,y);
		this.radio = radio;
	}
	
	public double getRadio() {
		return radio;
	}
	
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double getDiametro() {
		return 2 * getRadio();
	}
	
	public double getCircuferencia() {
		return 3.1416 * getRadio();
	}
	
	public double getArea() {
		return 3.1416 * getRadio() * getRadio();
	}
	
	
	
}
