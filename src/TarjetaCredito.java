public class TarjetaCredito extends MetodoPago implements Cancelable{
    private String fechaExpiracion;
    private int codigoSeguridad;

    public TarjetaCredito(String titular, int numero, String fechaExpiracion, int codigoSeguridad) {
        super(titular, numero);
        this.fechaExpiracion = fechaExpiracion;
        this.codigoSeguridad = codigoSeguridad;
    }

    @Override
    public void realizarPago() {
        System.out.println("Pago realizado con tarjeta de crédito del titular: " + titular);
    }

    @Override
    public void cancelarPago() {
        System.out.println("Pago con tarjeta de crédito cancelado para el titular: " + titular);
    }

    @Override
    public String toString() {
        return "TarjetaCredito [titular=" + titular + ", numero=" + numero + ", fechaExpiracion=" + fechaExpiracion
                + ", codigoSeguridad=" + codigoSeguridad + "]";
    }
}
