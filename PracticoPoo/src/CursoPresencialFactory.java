
public class CursoPresencialFactory implements CursoFactory {
    @Override
    public CursoImplementacion crearCurso() {
        return new CursoPresencialImplementacion();
    }
}