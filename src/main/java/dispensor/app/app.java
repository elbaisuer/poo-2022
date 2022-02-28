package dispensor.app;

import dispensor.dominio.DispensadorDePapa;
import dispensor.dominio.PaquetePapa;

public class app {
    public static void main(String[] args) {
        PaquetePapa papaQuete= new PaquetePapa("Papas Margarita ", "Margarita", "Limon", 200);
        DispensadorDePapa papaDispensor= new DispensadorDePapa("Frito Lay", 20, 2, papaQuete);

        papaDispensor.dispensarPaquetePapa(1);
        papaDispensor.vaciar();
        papaDispensor.llenar();
        papaDispensor.dispensarPaquetePapa(1);
        papaDispensor.llenar();
        papaDispensor.dispensarPaquetePapa(23);

        papaDispensor.mostrarSabor();

        papaDispensor.mostrarCantidadActual();

        PaquetePapa papaQuete2= new PaquetePapa("Papas Margarita", "Margarita", "Pollo", 200);
        papaDispensor.cambiarPaquetePapa(papaQuete2);
        papaDispensor.llenar();
        papaDispensor.dispensarPaquetePapa(1);
        papaDispensor.vaciar();
        papaDispensor.llenar();
        papaDispensor.dispensarPaquetePapa(1);
        papaDispensor.llenar();
        papaDispensor.dispensarPaquetePapa(23);

        papaDispensor.mostrarSabor();
    }


}
