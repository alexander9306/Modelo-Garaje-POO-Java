package poo_tarea.entidades;
import poo_tarea.entidades.Coche;

public class Garaje {

    public Coche coche;
    public String averia;
    public int numero_de_coches;
    private int counter;

    public boolean acetarCoche(Coche coche, String averia) {
        int counter;
        counter=this.counter;

        if (counter <= 10) {
        this.counter++;
        return true;
        } else {
            return false;
        }
        
    }

    public void devolverCoche(){
        this.counter = 0;
    }
}