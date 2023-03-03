package com.ceatcurso.maquinaria;

import com.cursoceat.empleado.Mecanico;

public class Locomotora {
	String matricula;
	int potencia;
	int antiguedad;
	Mecanico mecanico;
	public Locomotora(String matricula, int potencia, int antiguedad, Mecanico mecanico) {
		this.matricula = matricula;
		this.potencia = potencia;
		this.antiguedad = antiguedad;
		this.mecanico = mecanico;
	}
	
	

}
