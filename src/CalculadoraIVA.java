public class CalculadoraIVA {
    private final float tasaIVA = 0.16f;

    public float calcularIVA(float importeFactura) {
        return importeFactura * tasaIVA;
    }
}
