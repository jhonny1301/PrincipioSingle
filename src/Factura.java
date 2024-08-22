import java.util.Date;

public class Factura {
    public String codigo;
    public Date fechaEmision;
    public float importeFactura;
    public float importeIVA;
    public float importeDeduccion;
    public float importeTotal;
    public int porcentajeDeduccion;

    private CalculadoraIVA calculadoraIVA;
    private CalculadoraDeduccion calculadoraDeduccion;

    public Factura() {
        this.calculadoraIVA = new CalculadoraIVA();
        this.calculadoraDeduccion = new CalculadoraDeduccion();
    }

    public void calcularTotal() {
        // Delegamos el cálculo de la deducción y el IVA a sus respectivas clases
        importeDeduccion = calculadoraDeduccion.calcularDeduccion(importeFactura, porcentajeDeduccion);
        importeIVA = calculadoraIVA.calcularIVA(importeFactura);
        // Calculamos el total
        importeTotal = (importeFactura - importeDeduccion) + importeIVA;
    }
}
