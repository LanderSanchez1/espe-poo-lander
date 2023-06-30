package com.mycompany.poo_u2_p10_sobrecarga_landers;

/**
 *
 * @author Lander Sanchez
 */
public class POO_U2_P10_SOBRECARGA_LanderS {

    public static void main(String[] args) {
        Persona pers1=new Persona ("Lander", 18);
        pers1.jugar();
        
        Persona pers2=new Persona (235033763);
        pers2.jugar("Futbol");
    }
}
