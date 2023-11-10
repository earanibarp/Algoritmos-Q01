package encapsulamiento.ejercicio2;

public class Cuenta {

    // Atributos
    private int nroCuenta;
    private float saldo;

    //M�todos
    public Cuenta(int nroCuenta, float saldo) {
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void depositarDinero(float cantidad) {
        saldo += cantidad;
    }

    public void retirarDinero(float cantidad) {
        saldo -= cantidad;
    }
}
