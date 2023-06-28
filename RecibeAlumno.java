import java.util.ArrayList;
public class RecibeAlumno{
    String nombre;
    int edad; 
    String sexo; 
    String nombreTutor; 
    public static void main(String args[]) {
        ArrayList<RecibeAlumno> alumnosActuales = new ArrayList();
        RecibeAlumno miGrupo = new RecibeAlumno();
        
        miGrupo.nombre = "Juan Pérez";
        miGrupo.edad = 18;
        miGrupo.sexo = "hombre";
        miGrupo.nombreTutor = "Monserrat López"; RecibeAlumno alumno1 = new RecibeAlumno();
        alumnosActuales.add(miGrupo);
        System.out.println("Alumnos actuales en la clase: " + alumnosActuales.size());
    }
}