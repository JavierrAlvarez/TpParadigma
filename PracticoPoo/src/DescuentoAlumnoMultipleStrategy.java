
public class DescuentoAlumnoMultipleStrategy  implements DescuentoStrategy {
    @Override
    public double aplicarDescuento(double costo) {
        // Lógica para aplicar descuento a alumnos con múltiples cursos
        return costo * 0.8; // 20% de descuento
    }
}