public class PayPal extends MetodoPago implements Cancelable{

    private String correoElectronico;

    public PayPal(String titular, int numero, String correoElectronico) {
        super(titular, numero);
        this.correoElectronico = correoElectronico;
    }

    @Override
    public void realizarPago() {
        System.out.println("Pago realizado con PayPal del titular: " + titular + " usando el correo: " + correoElectronico);
    }

    @Override
    public void cancelarPago() {
        System.out.println("Pago con PayPal cancelado para el titular: " + titular);
    }

    @Override
    public String toString() {
        return "PayPal [titular=" + titular + ", numero=" + numero + ", correoElectronico=" + correoElectronico + "]";
    }
}
