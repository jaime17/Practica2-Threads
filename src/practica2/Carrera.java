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
public class Carrera extends Thread{
    private String nombre;

	private Vuelta vuelta;

	private long initialTime;
        private String nombre2;


	public Carrera() {
	}

	public Carrera(String nombre, String nombre2,Vuelta vuelta, long initialTime) {
		this.nombre = nombre;
		this.vuelta = vuelta;
		this.initialTime = initialTime;
                this.nombre2=nombre2;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
        public String getNombre2() {
		return nombre2;
	}

	public void setNombre2(String nombre2) {
		this.nombre2 = nombre2;
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

   
    @Override
	public void run( ) {

		System.out.println("El atleta " + this.nombre + " empieza la carrera en  " 
					+ (System.currentTimeMillis() - this.initialTime) / 1000 
					+ "segundos");
                
                
		for (int i = 0; i < this.vuelta.getTiempo().length; i++) {
			this.Segundos(vuelta.getTiempo()[i]);
                  
                       
			System.out.println("El atleta " + this.nombre + " termina la vuelta: " + (i + 1) 
						+ " en el tiempo: " 
						+ (System.currentTimeMillis() - this.initialTime) / 1000 
						+ " segundos" + "y releva con: " + this.nombre2);
                        
                        
                        
                     
               
       
                    
                        System.out.println("El atleta " + this.nombre2 + " termina en el tiempo: " 
						+ (System.currentTimeMillis() - this.initialTime) / 1000 
						+ " segundos" + "y llega a la meta");
                        
                        
		System.out.println("Los atletas " + this.nombre + " y " + this.nombre2 +  "han finalizado la carrera en el tiempo: " 
						+ (System.currentTimeMillis() - this.initialTime) / 1000 
						+ "segundos");
                      }
                     
        }
        
                
        

	private void Segundos(int segundos) {
		try {
			Thread.sleep(segundos * 1000);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}

   
}

   
