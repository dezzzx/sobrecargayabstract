package Ejercicio03;

public class Circulo extends FiguraGeometrica {
private double radio;
    
    public Circulo(double radio, String colorLinea, String colorRelleno) {
        super(colorLinea, colorRelleno);
        this.radio = radio;
    }
    
    public Circulo(double radio) {
        this(radio, "Negro", "Blanco");
    }
    
    @Override
    public void dibujar() {
        System.out.println("Dibujando un círculo con radio " + radio + ", color de línea " + getColorLinea() + " y color de relleno " + getColorRelleno());
    }
    
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}