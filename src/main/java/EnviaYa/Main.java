package EnviaYa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try{
        Estandar paquete1 = new Estandar("EY2001", 5, "Oriente");
        Express paquete2 = new Express("EY2002", 1.5, "Norte");
        Fragil paquete3 = new Fragil("EY2003", 2, "Centro", "Vajilla");
        Estandar paquete4 = new Estandar("EY2004", 8, "Centro");
        Express paquete5 = new Express("EY2005", 6, "Oriente");
        Fragil paquete6 = new Fragil("EY2006", 3.5, "Sur", "Televisor");
        } catch (SinContenidoException e){
            System.out.println("Se debe especificar el contenido del paquete");
        }

        Despacho.agregarPaquete(paquete1);
        Despacho.agregarPaquete(paquete2);
        Despacho.agregarPaquete(paquete3);
        Despacho.agregarPaquete(paquete4);
        Despacho.agregarPaquete(paquete5);
        Despacho.agregarPaquete(paquete6);

    }
}
