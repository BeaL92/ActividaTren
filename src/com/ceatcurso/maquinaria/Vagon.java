package com.ceatcurso.maquinaria;

public class Vagon {
	static int id;
	int cargaMax;
	int cargaActual;
	String tipoMercancia;
	public Vagon(int id, int cargaMax, int cargaActual, String tipoMercancia) {
		this.id = id++;
		this.cargaMax = cargaMax;
		this.cargaActual = cargaActual;
		this.tipoMercancia = tipoMercancia;
	}
	
}
