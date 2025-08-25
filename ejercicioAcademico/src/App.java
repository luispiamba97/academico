import javax.print.Doc;

public class App {
    public static void main(String[] args) throws Exception {
        
        //creamos estuiante

        Estudiante estudiante1 = new Estudiante(1143871976 , "Luis", "Sistemas", 4);

        //Creamos docente

        Docente docente1 = new Docente(123456, "Teo", "Programacion");

        //imprimimos los metodos

        System.out.println("Informacion Estudiante");
        System.out.println("-----------------");
        estudiante1.mostrarEstudiante();
        System.out.println("-----------------");
        estudiante1.presentarEstudiante();
        System.out.println("-----------------");
        estudiante1.mostrarEstudio();
        System.out.println("-----------------");
        estudiante1.obtenerSemestreAcual();
        System.out.println("-----------------");

        System.out.println("*********************************************");

        System.out.println("Informacion Docente");
        System.out.println("-----------------");
        docente1.mostrarDocente();
        System.out.println("-----------------");
        docente1.presentacionDocente();
        System.out.println("-----------------");
        docente1.calificar();
        System.out.println("-----------------");

      
    }
}
