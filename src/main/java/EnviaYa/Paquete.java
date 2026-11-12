package EnviaYa;

public abstract class Paquete {
    protected String idPaquete;
    protected double peso;
    protected String zonaDestino;

    public Paquete(String idPaquete, double peso, String zonaDestino){
        this.idPaquete = idPaquete;
        this.peso = peso;
        this.zonaDestino = zonaDestino;
    }

    public String getIdPaquete(){
        return idPaquete;
    }

    public double getPeso(){
        return peso;
    }

    public String getZonaDestino(){
        return zonaDestino;
    }

    public abstract String tipoServicio();

    @Override
    public String toString(){
        return "ID paquete: " + idPaquete + " - Peso pauquete: " + peso + " - Zona de entrega: " + zonaDestino + "Tipo entrega: " + tipoServicio();
    }
}
