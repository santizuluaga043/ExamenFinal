package EnviaYa;

public class Fragil extends Paquete implements Entregable{
    private String contenido;

    public Fragil(String idPaquete, double peso, String zonaDestino, String contenido)
            throws SinContenidoException {if(contenido == null){
        throw new SinContenidoException("Se debe especificar el contenido de este paquete");
    }
        super(idPaquete, peso, zonaDestino);
        this.contenido=contenido;
    }

    public String getContenido(){
        return contenido;
    }

    @Override
    public String tipoServicio(){
        return("Servicio Fragil - $5,000 de recargo a la tarifa - Contenido: " + getContenido());
    }

    @Override
    public boolean sePuedeEntregar(){
        return 0 < peso;
    }

    @Override
    public void entregar() throws PesoInvalidoException{
        if (!sePuedeEntregar()){
            throw new PesoInvalidoException("El paquete no puede pesar 0kg");
        }
    }
}
