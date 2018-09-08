/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

/**
 *
 * @author emiaj
 */
public class Vuelta {
 
	private int[] tiempo;

	public Vuelta() {
	}

 	public Vuelta( int[] tiempo) {
		this.tiempo = tiempo;
	}

	 

	public int[] getTiempo() {
		return tiempo;
	}

	public void setTiempo(int[] tiempo) {
		this.tiempo = tiempo;
	}

}