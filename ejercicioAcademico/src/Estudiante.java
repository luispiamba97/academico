public class Estudiante{
    //Atributos

    private int idEstudiante;
    private String nombreEstudiante;
    public int semestreActual;

    // constructor

    public Estudiante(int idEstudiante, String nombreEString, int semestreActual)
    {
        this.idEstudiante = idEstudiante;
        this.nombreEstudiante = nombreEstudiante;
        this.semestreActual = semestreActual;
    }

    // Metodos

    public void mostrarEstudiante()  //Metodo para mostrar estudiante
    {
        System.out.println("Identificacion: " +idEstudiante);
        System.out.println("Nombre: " +nombreEstudiante);
        System.out.println("Semestre: " +semestreActual);
    }

    public void presentarEstudiante()  //Metodo para presentar estudiante
    {
        System.out.println("El estudiante " + nombreEstudiante + " ,identificad@ con: " + idEstudiante + ", y cursa actualmente: " + 
        semestreActual + " Semestre");
    }

    


}