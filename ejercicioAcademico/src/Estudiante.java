public class Estudiante{
    //Atributos

    private int idEstudiante;
    private String nombreEstudiante;
    public String carrera;
    public int semestreActual;

    // constructor

    public Estudiante(int idEstudiante, String nombreEstudiante, String carrera, int semestreActual)
    {
        this.idEstudiante = idEstudiante;
        this.nombreEstudiante = nombreEstudiante;
        this.carrera = carrera;
        this.semestreActual = semestreActual;
    }

    // Metodos

    public void mostrarEstudiante()  //Metodo para mostrar estudiante
    {
        System.out.println("Identificacion: " +idEstudiante);
        System.out.println("Nombre: " +nombreEstudiante);
        System.out.println("Carrera: " +carrera);
        System.out.println("Semestre: " +semestreActual);
    }

    public void presentarEstudiante()  //Metodo para presentar estudiante
    {
        System.out.println("El estudiante " + nombreEstudiante + " identificad@ con el numero " + idEstudiante + " cursa actualmente: " + 
        semestreActual + " Semestre" + " de " + carrera);
    }

    public void mostrarEstudio()  //muestra metodo estudiar como se planteo en el diagrama
    {
        System.out.println("El estudiante: " + nombreEstudiante + ", estudia actualmente: " +carrera);
    } 

    public void obtenerSemestreAcual()  // Creamos metodo para mostrar el semestre actual
    {
        System.out.println("El estudiante: " + nombreEstudiante + ", cursa actualmente: " + semestreActual + " semestre");
    }


}