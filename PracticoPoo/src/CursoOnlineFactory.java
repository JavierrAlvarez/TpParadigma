
public class CursoOnlineFactory implements CursoFactory {
    @Override
    public CursoImplementacion crearCurso() {
        return new CursoOnlineImplementacion();
    }
}