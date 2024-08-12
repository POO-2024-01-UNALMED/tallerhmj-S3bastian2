package futbol;

public class Portero extends Futbolista {
    public short golesRecibidos;
    public byte dorsal;

    public Portero(String nombre, int edad, String posicion, short golesRecibidos, byte dorsal) {
        super(nombre, edad, "Portero");
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }

    public boolean jugarConLasManos() {
        return true;
    }
    public String toString() {
        return "El futbolista " + nombre + " tiene" + edad + ", y juega de " + posicion + " con el dorsal" + dorsal + ". Le han marcado " + golesRecibidos;
    }

    @Override
    public int compareTo(Portero otroPortero) {
        diferenciaGoles = this.golesRecibidos - otroJugador.getGolesRecibidos();

        if (diferenciaGoles < 0) {
            return -diferenciaGoles;
        } else {
            return diferenciaGoles;
        }
    }

    public short getGolesRecibidos() {
        return golesRecibidos;
    }

    public void setGolesRecibidos(short golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }
}
