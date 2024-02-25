package Ejercicio03;

public class Principal {
	public static void main(String[] args) {
        Circulo circulo1 = new Circulo(5);
        circulo1.dibujar();
        System.out.println("Área del círculo: " + circulo1.calcularArea());

        Rectangulo rectangulo1 = new Rectangulo(4, 6);
        rectangulo1.dibujar();
        System.out.println("Área del rectángulo: " + rectangulo1.calcularArea());

        Triangulo triangulo1 = new Triangulo(3, 7);
        triangulo1.dibujar();
        System.out.println("Área del triángulo: " + triangulo1.calcularArea());
    }
}
