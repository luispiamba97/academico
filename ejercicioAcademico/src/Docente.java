public class Docente {

    //  Atributos

    private int idDocente;
    private String nombreDocente;
    public String materia;

    // constructor

    public Docente( int idDocente, String nombreDocente, String materia)
    {
        this.idDocente = idDocente;
        this.nombreDocente = nombreDocente;
        this.materia = materia;
    }

    //  Metodos

    public void mostrarDocente()  //Metodo para mostrar informacion de docente
    {
        System.out.println("Identificacion: " + idDocente);
        System.out.println("Nombre Docente: " +nombreDocente);
        System.out.println("Materia: " +materia);
    }

    public void presentacionDocente()   //Metodo para la presentacion del docente
    {
        System.out.println("El docente " +nombreDocente + " con el id " +idDocente + " dicta la materia " +materia);
    }

    public void calificar()
    {
        System.out.println("El docente " + nombreDocente + " se encuentra calificando examenes de: " +materia);
    }
    
}
