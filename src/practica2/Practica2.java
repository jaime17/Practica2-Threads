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
public class Practica2 {

    /**
     * @param args the command line arguments
     */
        
    public static void main(String[] args) {
       Vuelta vuelta1 = new Vuelta( new int[] { 2, 2, 1, 5, 2, 3 });
       Vuelta vuelta2 = new Vuelta(new int[] { 1, 3, 5, 1, 1 });

        // Tiempo inicial de referencia
        long initialTime = System.currentTimeMillis();
		Carrera ato = new Carrera("Pedro", vuelta1, initialTime);
		Carrera alo = new Carrera("Juan", vuelta2, initialTime);
                Carrera ate = new Carrera("Beto", vuelta1, initialTime);
		Carrera ale= new Carrera("Salvador", vuelta2, initialTime);
                ato.start();
                alo.start();
                ate.start();
                ale.start();
                
                
}


}
