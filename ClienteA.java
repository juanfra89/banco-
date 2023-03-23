import java.time.LocalDate;

public class ClienteA extends Cliente implements InterfaceClienteService {

    public ClienteA(Long idCliente, String nombre, String apellido, 
    String telefono, String email, LocalDate fechaAlta, Cuenta[] cuentas,
    Float ingresoMensual, Prestamo[] prestamos) {
        super(idCliente,nombre,apellido,telefono,email,fechaAlta,cuentas,ingresoMensual,prestamos);
    }

    @Override
    public Float calculoPrestamo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calculoPrestamo'");
    }

    @Override
    public Float calculoBalance() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calculoBalance'");
    }
  

}
