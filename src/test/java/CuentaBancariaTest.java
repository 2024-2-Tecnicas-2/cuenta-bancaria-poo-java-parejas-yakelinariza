
import com.mycompany.cuenta.bancaria.poo.CuentaBancaria;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CuentaBancariaTest {
    // TODO Adiciona tus pruebas unitarias aquí.
    // Los métodos deben estar anotados con la anotación @Test. Por ejemplo:
    //
    // @Test
    // public void miPrueba() {
    //      double valorEsperado = 10;
    //      double valorActual = Calculadora.calcular(7, 3, '+');
    //      assertEquals(valorEsperado, valorActual);
    // }

    private CuentaBancaria cuenta;

    @BeforeEach
    public void setUp() {
        cuenta = new CuentaBancaria("Juan Pérez", "1234567890", 1000.0, 1.5);
    }

    @Test
    public void miPrueba() {
        cuenta.ingresar(500.0);
        assertEquals(1500.0, cuenta.getSaldo());

        cuenta.ingresar(-100.0);
        assertEquals(1500.0, cuenta.getSaldo()); // No debe cambiar
    }

    @Test
    public void miPruebaDos() {
        cuenta.retirar(500);
        assertEquals(500.0, cuenta.getSaldo());
    }
    
    @Test 
    public void miPruebaTresInteres(){
        cuenta.setTipoInteres(-1.0);
        assertEquals(1.5 , cuenta.getTipoInteres());
    
    }
}