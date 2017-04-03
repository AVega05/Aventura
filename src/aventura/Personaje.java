
package aventura;
import java.util.Random;

public class Personaje {
    
    //Atrib.
    
    private int puntosDeSalud=200;
    private int armadura=100;
    private int velocidad=30;
    
    //Metod.

    public void setPuntosDeSalud(int puntosDeSalud) {
        this.puntosDeSalud = puntosDeSalud;
    }
    
    public int getPuntosDeSalud() {
        return puntosDeSalud;
    }

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }
    
    public int getArmadura() {
        return armadura;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getVelocidad() {
        return velocidad;
    }
    
    
    public int caminar(){
       Random azar = new Random();
       int caminar = azar.nextInt(3)+1;
       return caminar; 
    }
    
    public void mostrarEstado(){
        
        System.out.println("Puntos de salud = "+puntosDeSalud);
        System.out.println("Armadura = "+armadura);
        System.out.println("Velocidad = "+velocidad);
        
    }
    
}
