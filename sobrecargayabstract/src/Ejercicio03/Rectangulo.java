package Ejercicio03;

public class Rectangulo extends FiguraGeometrica {
	private double base;
    private double altura;
    
    public Rectangulo(double base, double altura, String colorLinea, String colorRelleno) {
        super(colorLinea, colorRelleno);
        this.base = base;
        this.altura = altura;
    }
    
    public Rectangulo(double base, double altura) {
        this(base, altura, "Negro", "Blanco"); // Values for colorLinea and colorRelleno
    }
    
    @Override
    public void dibujar() {
        System.out.println("Dibujando un rectángulo con base " + base + ", altura " + altura + ", color de línea " + getColorLinea() + " y color de relleno " + getColorRelleno());
    }
    
    @Override
    public double calcularArea() {
        return base * altura;
    }
}