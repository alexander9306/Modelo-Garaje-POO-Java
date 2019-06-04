package poo_tarea.entidades;

import java.util.Scanner;
import poo_tarea.entidades.Motor;

public class Coche {
	public Motor motor;
	private String marca;
	private String modelo;
	public String tipo;
	double acumulado_averias;
	public boolean traccion4WD;
	public int cantidadEjes;
	public Scanner myObj = new Scanner(System.in);

	public Coche(String tipo, String marca, String modelo, int motorPotencia) {
		this.marca = marca;
		this.modelo = modelo;
		this.motor = new Motor(motorPotencia);
		tipo = tipo.toLowerCase().strip();
		this.tipo = tipo;
		if (tipo == "jeepeta") {
			System.out.println("Tiene traccion 4X4?");
			if (myObj.nextLine().toLowerCase().strip() == "si") {
				this.traccion4WD = true;
			}
		}
		if (tipo == "camion") {
			System.out.println("Introduzca la cantidad de ejes");
			this.cantidadEjes = myObj.nextInt();
		}
	}

	public Motor getMotor() {
		return motor;
	}

	public String getMarca() {
		return this.marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public double getPrecio_averias() {
		return this.acumulado_averias;
	}

	public void acumularAveria(double acumulado_averias) {
		this.acumulado_averias += acumulado_averias;
	}

}