package EnviaYa;

public interface Entregable {
    public boolean sePuedeEntregar();

    void entregar() throws PesoInvalidoException;
}
