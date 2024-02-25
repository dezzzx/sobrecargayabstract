package Ejercicio03;

public class Triangulo extends FiguraGeometrica {
	private double base;
    private double altura;
    
    public Triangulo(double base, double altura, String colorLinea, String colorRelleno) {
        super(colorLinea, colorRelleno);
        this.base = base;
        this.altura = altura;
    }
    
    public Triangulo(double base, double altura) {
        this(base, altura, "Negro", "Blanco"); // Values for colorLinea and colorRelleno
    }
    
    @Override
    public void dibujar() {
        System.out.println("Dibujando un triángulo con base " + base + ", altura " + altura + ", color de línea " + getColorLinea() + " y color de relleno " + getColorRelleno());
    }
    
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}
