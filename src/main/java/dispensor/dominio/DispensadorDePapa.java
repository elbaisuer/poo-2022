package dispensor.dominio;

public class DispensadorDePapa {
    public String marca;
    public int capacidad;
    public int cantidadActual;
    public PaquetePapa paquetePapa;

    public DispensadorDePapa(String marca, int capacidad, int cantidadActual, PaquetePapa paquetePapa){
        this.marca=marca;
        this.capacidad=capacidad;
        this.cantidadActual=cantidadActual;
        this.paquetePapa=paquetePapa;

    }

    public void dispensarPaquetePapa(int paqueteADispensar){
    if (this.cantidadActual>=paqueteADispensar){
        this.cantidadActual-=paqueteADispensar;
        System.out.println(" Se dispenso "  + paqueteADispensar + " paquete de " + this.paquetePapa.nombre+ "de " + this.paquetePapa.sabor + " correctamente. ");


    }
    else {
        System.out.println(" No se pudo dispensar, no hay suficientes paquetes, la cantidad restante de paquetes es: "+ this.cantidadActual);

    }
    }

    public void mostrarSabor(){
        System.out.println("El sabor es "+ paquetePapa.sabor);
    }

    public void cambiarPaquetePapa(PaquetePapa nuevoPaquetePapa){
        this.paquetePapa= nuevoPaquetePapa;
        vaciar();
    }

    public void vaciar(){
        this.cantidadActual=0;
        System.out.println("se ha vaciado con exito ");
    }

    public void llenar(){
        this.cantidadActual=capacidad;
        System.out.println("Se ha llenado con exito");
    }

    public void mostrarCantidadActual(){
        System.out.println("La cantidad actual es: "+ cantidadActual);
    }
}
