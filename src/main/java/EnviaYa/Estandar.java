package EnviaYa;

public class Estandar extends Paquete implements Entregable{
    public Estandar(String idPaquete, double peso, String zonaDestino){
        super(idPaquete, peso, zonaDestino);
    }

    @Override
    public String tipoServicio(){
        return("Servicio Estandar - Tarifa base");
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
