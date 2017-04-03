
package aventura;
import java.util.Scanner;



public class Aventura {
    
    static Scanner ent = new Scanner(System.in);
    //Atrib.
    
    private static String lugar1="Bosque";
    private static String lugar2="Castillo";
    private static String lugar3="Mazmorra";
    

   
    public static void main(String[] args) {
        
        Personaje pj = new Personaje();
        Soparara sr = new Soparara();
        Escudodehierro  edh = new Escudodehierro();
        Pocionmagica pm = new Pocionmagica();
        
        int opc=0;
           
        
    
        while(opc==0 && sr.getExiste()==true || edh.getExiste()==true || pm.getExiste()==true ){  //while para mantener el menu mientras existan los objetos
            
            System.out.println("Caminar(1),Mostrar estado(2)");
        
            opc=ent.nextInt();
            switch(opc){    //switch para caminar o mostrar el estado
            case(1):{
                int lugar;
                lugar=pj.caminar();
                
                if(lugar==1){
                    System.out.println("llegaste a el "+lugar1);
                                        
                    int l1=0;
                    while(l1==0 && sr.getExiste()==true){   //while para mantenerte en el lugar
                        System.out.println("has encontrado una 'Sopa rara'");
                        System.out.println("Seguir caminando(1),Mostrar estado(2),Beber 'Sopa rara'(3)");
                    
                        int opc0;
                        opc0=ent.nextInt();
                        
                        switch(opc0){   //switch para decidir que hacer en el lugar
                            case(1):{
                                l1=1;
                                break;
                            }
                            case(2):{
                                pj.mostrarEstado();
                                break;                  
                            }
                            case (3):{
                                sr.dañarRelentizar(pj);
                                l1=1;
                                break;
                            }
                            default: System.out.println("opcion invalidad");
                                break;
                        }
                    }
                }
                if(lugar==2){
                        System.out.println("llegaste a el "+lugar2);
                        
                        int l1=0;
                        while(l1==0 && edh.getExiste()==true){
                            System.out.println("has encontrado un 'Escudo de Hierro'");
                            System.out.println("Seguir caminando(1),Mostrar estado(2),Equipar 'Escudo de Hierro'(3)");

                            int opc0;
                            opc0=ent.nextInt();

                            switch(opc0){
                                case(1):{
                                    l1=1;
                                    break;
                                }
                                case(2):{
                                    pj.mostrarEstado();
                                    break;                  
                                }
                                case (3):{
                                    edh.fortalecerRelentizar(pj);
                                    l1=1;
                                    break;
                                }
                                default: System.out.println("opcion invalidad");
                                break;
                            }
                        }

                }
                if (lugar==3){

                        System.out.println("llegaste a la "+lugar3);
                        
                        int l1=0;
                        while(l1==0 && pm.getExiste()==true){
                            System.out.println("has encontrado una 'Pocion Magica'");
                            System.out.println("Seguir caminando(1),Mostrar estado(2),Bebe 'Pocion magica'(3)");

                            int opc0;
                            opc0=ent.nextInt();

                            switch(opc0){
                                case(1):{
                                    l1=1;
                                    break;
                                }
                                case(2):{
                                    pj.mostrarEstado();
                                    break;                  
                                }
                                case (3):{
                                    pm.vitalizarAgilizar(pj);
                                    l1=1;
                                    break;
                                }
                                default: System.out.println("opcion invalidad");
                                break;
                            }
                        }
                }
            opc=0;    
            break;
            }
            case (2):{
                pj.mostrarEstado();
                opc=0;
                break;
            }
            default: System.out.println("opcion invalidad");
            opc=0;
            break;
                
            
        }
        
        }
        System.out.println("Encontraste los 3 objetos, tu aventura a terminado");
        System.out.println("tu estado final es");
        pj.mostrarEstado();
        
    }
    
}
