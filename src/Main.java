import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Factura
        Factura factura = new Factura();

        // Configurar los datos de la factura
        factura.codigo = "FAC-001";
        factura.fechaEmision = new Date();
        factura.importeFactura = 12000.0f;
        factura.porcentajeDeduccion = 5; // 5% de deducción

        // Calcular el total de la factura
        factura.calcularTotal();

        // Imprimir los resultados
        System.out.println("Código de la Factura: " + factura.codigo);
        System.out.println("Fecha de Emisión: " + factura.fechaEmision);
        System.out.println("Importe de la Factura: " + factura.importeFactura);
        System.out.println("Importe de la Deducción: " + factura.importeDeduccion);
        System.out.println("Importe del IVA: " + factura.importeIVA);
        System.out.println("Importe Total: " + factura.importeTotal);
    }
}
