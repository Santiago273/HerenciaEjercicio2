public class SistemadePagos {
    public static void main(String[] args) {
        Pagos sistemaPagos = new Pagos();

        TarjetaCredito tarjeta = new TarjetaCredito("Juan Pérez", 12345678, "12/26", 123);
        PayPal paypal = new PayPal("María López", 87654321, "maria.lopez@example.com");

        sistemaPagos.agregarMetodo(tarjeta);
        sistemaPagos.agregarMetodo(paypal);

        System.out.println("\n--- Realizando pagos ---");
        sistemaPagos.realizarPagos();

        System.out.println("\n--- Cancelando pagos ---");
        sistemaPagos.cancelarPagos();

        System.out.println("\n--- Mostrando métodos de pago ---");
        sistemaPagos.mostrarPagos();
    }
}
