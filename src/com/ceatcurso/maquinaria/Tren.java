package com.ceatcurso.maquinaria;

import com.cursoceat.empleado.Maquinista;

public class Tren {
	Locomotora locomotora;
	Maquinista maquinista;
	Vagon vagones[];
	private int nVagones;
	public Tren(Locomotora locomotora, Maquinista maquinista) {
		this.locomotora = locomotora;
		this.maquinista = maquinista;
		vagones = new Vagon[5];
		nVagones = 0;
	}
	public void engancharVagon (int cargaMax, int cargaActual, String mercancia) {
		if (nVagones<=5) {
			System.out.println("El tren no admite más vagones");
		}else {
			Vagon v=new Vagon(cargaActual, cargaMax, cargaActual, mercancia);
			vagones[nVagones]=v;
			nVagones++;
		}
	}
	
	
		
	}



