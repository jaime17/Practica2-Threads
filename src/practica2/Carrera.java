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
public class Carrera {
    private String nombre;

	private Vuelta vuelta;

	private long initialTime;


	public Carrera() {
	}

	public Carrera(String nombre,Vuelta vuelta, long initialTime) {
		this.nombre = nombre;
		this.vuelta = vuelta;
		this.initialTime = initialTime;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getInitialTime() {
		return initialTime;
	}

	public void setInitialTime(long initialTime) {
		this.initialTime = initialTime;
	}

	public Vuelta getVuelta() {
		return vuelta;
	}

	public void setVuelta(Vuelta vuelta) {
		this.vuelta = vuelta;
	}

   
	public void start( ) {

		System.out.println("El atleta " + this.nombre + " empieza la carrera en  " 
					+ (System.currentTimeMillis() - this.initialTime) / 1000 
					+ "segundos");

		for (int i = 0; i < this.vuelta.getTiempo().length; i++) {
			
			this.Segundos(vuelta.getTiempo()[i]);
			System.out.println("El atleta termina la vuelta: " + (i + 1) 
						+ "en el tiempo: " 
						+ (System.currentTimeMillis() - this.initialTime) / 1000 
						+ "segundos");
		}

		System.out.println("El atleta " + this.nombre + " ha finalizado la carrera en el tiempo: " 
						+ (System.currentTimeMillis() - this.initialTime) / 1000 
						+ "segundos");
             
	}
        


	private void Segundos(int segundos) {
		try {
			Thread.sleep(segundos * 1000);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}

   
}

   
