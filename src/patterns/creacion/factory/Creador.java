package patterns.creacion.factory;

public class Creador extends CreadorAbstracto {
    @Override
    public IArchivo crear(int tipo) {
        IArchivo objeto;

        switch (tipo) {
            case AUDIO:
                objeto = new ArchivoAudio();
                break;
            case VIDEO:
                objeto = new ArchivoVideo();
                break;
            default:
                objeto = null;
        }

        return objeto;
    }
}
