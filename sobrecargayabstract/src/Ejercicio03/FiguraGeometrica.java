package Ejercicio03;

abstract class FiguraGeometrica {
	private String colorLinea;
    private String colorRelleno;
    
    public FiguraGeometrica(String colorLinea, String colorRelleno) {
        this.colorLinea = colorLinea;
        this.colorRelleno = colorRelleno;
    }
    
    public abstract void dibujar();
    public abstract double calcularArea();
    public String getColorLinea() {
        return colorLinea;
    }
    
    public String getColorRelleno() {
        return colorRelleno;
    }
}