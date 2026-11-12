package EnviaYa;

public class Express extends Paquete implements Entregable{
    public Express(String idPaquete, double peso, String zonaDestino){
        super(idPaquete, peso, zonaDestino);
    }

    @Override
    public String tipoServicio(){
        return("Servicio Express - 50% de recargo a la tarifa");
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
