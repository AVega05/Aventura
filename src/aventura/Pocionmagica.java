
package aventura;


public class Pocionmagica {
    
    //Atrib.
    
    private boolean existe = true;
    
    //Metod.

    public void setExiste(boolean existe) {
        this.existe = existe;
    }

    public boolean getExiste() {
        return existe;
    }
    
    public void vitalizarAgilizar(Personaje pj){
        
        Personaje pjpocima = pj;
        pjpocima.setPuntosDeSalud(pjpocima.getPuntosDeSalud()+100);
        pjpocima.setVelocidad(pjpocima.getVelocidad()+30);
        System.out.println("Tu salud a aumentado 100 puntos. Tu velocidad a aumentado 30 puntos");
        existe=false;
    }
    
}
