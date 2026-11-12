package EnviaYa;

import java.util.ArrayList;

public class Despacho {
    private ArrayList<Paquete> paquetes;

    public Despacho(){
        paquetes = new ArrayList<>();
    }

    public static void agregarPaquete(Paquete paquete){
        paquetes.add(paquete);
    }

    public void mostrarPaquetes() {
        for (Paquete paquete : paquetes) {
            System.out.println(paquete);
        }
    }
}
