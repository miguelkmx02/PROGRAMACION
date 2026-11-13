public class Persona {

    // Atributos de una clase
    private String nombre;
    private String apellidos;
    int edad;
    private String dni;
    String genero;

    // Constructor de una clase
    public Persona (String nombre){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    //Puedo definir mas de un constructor
    public Persona (String nombre, String apellidos, int edad, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.dni = dni;
    }

    //Constructor con todos los parametros
     public Persona (String nombre, String apellidos, int edad, String dni) {
         this.nombre = nombre;
         this.apellidos = apellidos;
         this.edad = edad;
         this.dni = dni;
         this.genero = genero;

     //Constructor por defecto
     public Persona(){}

      //Propiedades


    //Metodo para pasar a String el objeto


     }
}
