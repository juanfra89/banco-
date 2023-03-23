import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        Cuenta cuenta1 = new Cuenta(1, true, 500.0f);
        Cuenta cuenta2 = new Cuenta(2, true, 350.0f);
        Prestamo prestamo1 = new Prestamo(1, 2000f);

        Prestamo[] prestamos1 = {prestamo1};
        Cuenta[] cuentas1 = {cuenta1, cuenta2};
        LocalDate fecha1 = LocalDate.of(2023, 11, 5);
        
        ClienteA clienteA1 = new ClienteA(1l, "Ricardo", "Gomez", "242342",
         "Richard@Fort.com", fecha1, cuentas1, 2000.0f, prestamos1);

        System.out.println(clienteA1.calculoBalance());
        //System.out.println(clienteA1.calculoPrestamo());

        ArrayList<Cliente> clientes = new ArrayList<>();

        clientes.add(clienteA1);

        System.out.println(clientes);
    }   
}
