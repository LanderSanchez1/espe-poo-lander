
package Poo.operadores.logicos;

/**
 *
 * @author Lander Sanchez
 */
public class JohnGalarzaPOOOperadoresLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int val1=1;
        int val2=10;
        System.out.println((val1==val2)&&(val1!=val2));
        System.out.println((val1>val2)||(val2<val1));
        System.out.println(!(val1!=val2));
        
     
        int a=(int)(Math.random()*100);
     
        if(a>=10 && a<=60)
        {
         System.out.println(a);
        }
    }
    
}
