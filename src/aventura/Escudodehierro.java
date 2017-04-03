
package aventura;


public class Escudodehierro {
    
    //Atrib.
    
    private boolean existe = true;
    
    //Metod.

    public void setExiste(boolean existe) {
        this.existe = existe;
    }

    public boolean getExiste() {
        return existe;
    }
    
    public void fortalecerRelentizar(Personaje pj){
        
        Personaje pjescudado = pj;
        pjescudado.setArmadura(pjescudado.getArmadura()+50);
        pjescudado.setVelocidad(pjescudado.getVelocidad()-10);
        System.out.println("Tu armadura a aumentado 50 puntos. Tu velocidad a disminuido 10 puntos");
        existe=false;
        
    }
}
