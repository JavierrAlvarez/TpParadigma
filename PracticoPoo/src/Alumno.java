
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.*;

public class Alumno implements Observador {

    //Atributos
    private String legajo;
    private List<Cursos> cursosInscritos;
    private boolean accesoDescuento;
    private DescuentoStrategy descuentoStrategy;

    //Constructor
    public Alumno(String nombre, String apellido, String dni, Date crearFecha, int edad) {
        super();
        this.cursosInscritos = new ArrayList<>();
    }

    public Alumno(String legajo) {
        this.legajo = legajo;
    }

    //Getter y Setter
    

    public String getLegajo() {
        return legajo;
    }

    public void setAccesoDescuento(boolean accesoDescuento) {
        this.accesoDescuento = accesoDescuento;
    }

    public List<Cursos> getCursosInscritos() {
        return cursosInscritos;
    }

    public void agregarCursoInscrito(Cursos curso) {
        cursosInscritos.add(curso);
    }
    
    
    public void setDescuentoStrategy(DescuentoStrategy descuentoStrategy) {
        this.descuentoStrategy = descuentoStrategy;
    }

    //Metodos
    public void actualizar(String mensaje) {
        System.out.println("Notificación para el alumno " + getNombre() + ": " + mensaje);
    }

    

    String getNombre() {
		// TODO Auto-generated method stub
		return null;
	}

	public String toString() {
        return "Alumno Nombre = " + this.getNombre() +
                "\nAlumno Apellido = " + this.getApellido() +
                "\nAlumno Dni = " + this.getDni() +
                "\nAlumno Fecha = " + this.getFechaNacimiento() +
                "\nAlumno Edad = " + this.getEdad() +
                "\nAlumno Legajo = " + this.getLegajo();
    }

    private String getFechaNacimiento() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getEdad() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getApellido() {
		// TODO Auto-generated method stub
		return null;
	}

	String getDni() {
		// TODO Auto-generated method stub
		return null;
	}

	//CrearLegajo
    public String generarLegajo(String dni) {
        String ultimoDigito = getDni().substring(getDni().length());
        SimpleDateFormat dateFormat = new SimpleDateFormat("yy"); // Obtener los dos primeros dígitos del año actual
        String anio = dateFormat.format(new Date());
        legajo = ultimoDigito + "." + anio;
        return legajo;
    }

    //Descuento
    public boolean tieneAccesoDescuento() {
        System.out.println("Evaluando descuento para " + getNombre() + ": " + (getCursosInscritos().size() > 1));
        return getCursosInscritos().size() > 1;
    }

    public static int cantidadAlumnosConDescuento(List<Alumno> alumnos) {
        int count = 0;
        for (Alumno alumno : alumnos) {
            if (alumno.tieneAccesoDescuento()) {
                count++;
            }
        }
        return count;
    }

}