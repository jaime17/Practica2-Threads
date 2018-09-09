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
       Vuelta relevo1 = new Vuelta( new int[] { 30, 10,});
       Vuelta relevo2 = new Vuelta(new int[] { 20, 20,});
       Vuelta relevo3 = new Vuelta( new int[] { 15, 12,});
       Vuelta relevo4 = new Vuelta(new int[] { 22, 18,});

        // Tiempo inicial de referencia
        long initialTime = System.currentTimeMillis();
       
		Carrera ato = new Carrera("Pedro","salvador", relevo1, initialTime);
		Carrera alo = new Carrera("Juan","beto", relevo2, initialTime );
                Carrera ate = new Carrera("Miguel","Alvaro", relevo3, initialTime);
		Carrera ale= new Carrera("Rodrigo","Luis", relevo4, initialTime);
                ato.start();
                alo.start();  
                ate.start();
                ale.start();
                
                
}


}
