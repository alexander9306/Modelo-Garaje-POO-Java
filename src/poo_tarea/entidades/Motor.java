package poo_tarea.entidades;

public class Motor {
    private int litros_de_aceite;
    private int potencia;

    public Motor(int potencia) {
        this.litros_de_aceite = 0;
        this.potencia = potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getPotencia() {
        return this.potencia;
    }

    public void setlitros_de_aceite(int litros_de_aceite) {
        this.litros_de_aceite = litros_de_aceite;
    }

    public int getlitros_de_aceite() {
        return this.litros_de_aceite;
    }
}