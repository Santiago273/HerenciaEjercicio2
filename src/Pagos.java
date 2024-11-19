import java.util.ArrayList;

public class Pagos {
    private ArrayList<MetodoPago> metodosPago;

    public Pagos() {
        metodosPago = new ArrayList<>();
    }

    public void agregarMetodo(MetodoPago metodo) {
        metodosPago.add(metodo);
        System.out.println("Método de pago agregado: " + metodo.getTitular());
    }

    public void realizarPagos() {
        for (MetodoPago metodo : metodosPago) {
            metodo.realizarPago();
        }
    }

    public void cancelarPagos() {
        for (MetodoPago metodo : metodosPago) {
            if (metodo instanceof Cancelable) {
                ((Cancelable) metodo).cancelarPago();
            }
        }
    }

    public void mostrarPagos() {
        for (MetodoPago metodo : metodosPago) {
            System.out.println(metodo);
        }
    }
}
