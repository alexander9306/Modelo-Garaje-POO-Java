package poo_tarea.verificacion;
import java.lang.Math;
import poo_tarea.entidades.Coche;
import poo_tarea.entidades.Motor;
import poo_tarea.entidades.Garaje;

public class Prueba {
    public static void main(String[] args) {
        Garaje joseCarros = new Garaje();
        Coche elToreto = new Coche("Nissan", "JUKE");
        Coche jefe = new Coche("Toyota", "CAMRY");

        joseCarros.acetarCoche(elToreto, "No enciende");
        elToreto.acumularAveria(Math.random());
        joseCarros.devolverCoche();

        joseCarros.acetarCoche(jefe, "Aceite");
        jefe.acumularAveria(Math.random());
        jefe.motor.setlitros_de_aceite(10);
        joseCarros.devolverCoche();

        joseCarros.acetarCoche(elToreto, "Acelera demasiado");
        elToreto.acumularAveria(Math.random());
        jefe.getMotor().setPotencia(10);
        joseCarros.devolverCoche();

        joseCarros.acetarCoche(jefe, "delantero aboyado Abollado");
        jefe.acumularAveria(Math.random());
        joseCarros.devolverCoche();

        jefe.motor.getPotencia();
        jefe.getMarca();
        jefe.getPrecio_averias();
        jefe.getModelo();

        elToreto.motor.getPotencia();
        elToreto.getMarca();
        elToreto.getPrecio_averias();
        elToreto.getModelo();
    }
}
