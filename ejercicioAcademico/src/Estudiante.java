public class Estudiante{
    //Atributos

    private int idEstudiante;
    private String nombreEstudiante;
    public String semestreActual;

    // constructor

    public Estudiante(int idEstudiante, String nombreEString, String semestreActual){
        this.idEstudiante = idEstudiante;
        this.nombreEstudiante = nombreEstudiante;
        this.semestreActual = semestreActual;
    }
}