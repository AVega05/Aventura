
package aventura;


public class Soparara {
    
    //Atrib.
    
    private boolean existe = true;
    
    //Metod.

    public void setExiste(boolean existe) {
        this.existe = existe;
    }

    public boolean getExiste() {
        return existe;
    }

    public void dañarRelentizar(Personaje pj){
       
        Personaje pjsopero = pj;
        pjsopero.setPuntosDeSalud(pjsopero.getPuntosDeSalud()-50);
        pjsopero.setVelocidad(pjsopero.getVelocidad()-5);
        System.out.println("Tu salud disminuto 50 puntos. Tu velocidad disminuyo 5 puntos");
        existe = false;
        
    }
    
    
}
