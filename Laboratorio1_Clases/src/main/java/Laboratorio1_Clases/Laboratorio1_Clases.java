package Laboratorio1_Clases;

public class Laboratorio1_Clases {

    public static void main(String[] args) {
        
        //Dando valores a Auto 1
        Auto auto1 = new Auto();
        auto1.Marca="Audi";
        auto1.Color="Rojo";
        auto1.Año=2020;
        auto1.Diseño="Deportivo";
        auto1.Placa="LA-567";
        
        //Dando valores a Auto 2
        Auto auto2 = new Auto();
        auto2.Marca="Toyota";
        auto2.Color="Azul";
        auto2.Año=2000;
        auto2.Diseño="Clasico";
        auto2.Placa="EC-405";
        
        //Dando valores a Persona 1
        Persona persona1 = new Persona();
        persona1.Etnia="Mestiza";
        persona1.Edad=10;
        persona1.Nacionalidad="Peruano";
        persona1.Genero="Masculino";
        persona1.Nombre="Jeremias";
        
        //Dando valores a Persona 2
        Persona persona2 = new Persona();
        persona2.Etnia="Mulato";
        persona2.Edad=40;
        persona2.Nacionalidad="Ecuatoriana";
        persona2.Genero="Femenino";
        persona2.Nombre="Susan";
        
        //Dando valores a Celular 1
        Celular celular1 = new Celular();
        celular1.Color="Azul";
        celular1.Marca="Samsung";
        celular1.Memoria="128 gb";
        celular1.Precio=450;
        celular1.Modelo="S20";
        
        //Dando valores a Celular 2
        Celular celular2 = new Celular();
        celular2.Color="Rojo";
        celular2.Marca="Nokia";
        celular2.Memoria="100 mb";
        celular2.Precio=10;
        celular2.Modelo="1100";
        
        //Imprime en la pantalla
        System.out.println("Auto 1: ");
        System.out.println("Año: "+auto1.Año);
        System.out.println("Color: "+auto1.Color);
        System.out.println("Diseño: "+auto1.Diseño);
        System.out.println("Marca: "+auto1.Marca);
        System.out.println("Placa: "+auto1.Placa);
        System.out.println("");
        System.out.println("Auto 2:");
        System.out.println("Año: "+auto2.Año);
        System.out.println("Color: "+auto2.Color);
        System.out.println("Diseño: "+auto2.Diseño);
        System.out.println("Marca: "+auto2.Marca);
        System.out.println(" Placa: "+auto2.Placa);
        System.out.println("");
        System.out.println("Persona 1:");
        System.out.println("Edad: "+persona1.Edad);
        System.out.println("Etnia: "+persona1.Etnia);
        System.out.println("Genero: "+persona1.Genero);
        System.out.println("Nacionalidad: "+persona1.Nacionalidad);
        System.out.println("Nombre: "+persona1.Nombre);
        System.out.println("");
        System.out.println("Persona 2:");
        System.out.println("Edad: "+persona2.Edad);
        System.out.println("Etnia: "+persona2.Etnia);
        System.out.println("Genero: "+persona2.Genero);
        System.out.println("Nacionalidad: "+persona2.Nacionalidad);
        System.out.println("Nombre: "+persona2.Nombre);
        System.out.println("");
        System.out.println("Celular 1:");
        System.out.println("Color: "+celular1.Color);
        System.out.println("Marca: "+celular1.Marca);
        System.out.println("Memoria: "+celular1.Memoria);
        System.out.println("Modelo: "+celular1.Modelo);
        System.out.println("Precio: "+celular1.Precio);
        System.out.println("");
        System.out.println("Celular 2:");
        System.out.println("Color: "+celular2.Color);
        System.out.println("Marca: "+celular2.Marca);
        System.out.println("Memoria: "+celular2.Memoria);
        System.out.println("Modelo: "+celular2.Modelo);
        System.out.println("Precio: "+celular2.Precio);
    }
}
