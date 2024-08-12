import java.lang.Comparable;

public class Jugador extends Futbolista implements Comparable<Object> {
    public short golesMarcados;
    public byte dorsal;

    public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
        super(nombre, edad, posicion);
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }

    public Jugador() {
        super();
        this.golesMarcados = 289;
        this.dorsal = 7;
    }

    @Override
    public int compareTo(Jugador otroJugador) {
        diferencia = this.edad - otroJugador.getEdad();

        if (diferencia < 0) {
            return -diferencia;
        } else {
            return diferencia;
        }
    }

    public String toString() {
        return "El futbolista " + nombre + " tiene" + edad + ", y juega de " + posicion + " con el dorsal" + dorsal + ". Ha marcado " + golesMarcados;
    }

}