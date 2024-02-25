package Ejercicio02;



import javax.swing.JOptionPane;

abstract class Empleado {

 protected String nombre;
 protected int ID;
 protected double salario;

 public Empleado(String nombre, int ID, double salario) {
     this.nombre = nombre;
     this.ID = ID;
     this.salario = salario;
 }


 public Empleado(String nombre, int ID) {
     this.nombre = nombre;
     this.ID = ID;
 }

 public abstract double calcularSalario();


 public abstract void mostrarDetalles();
}


class EmpleadoPermanente extends Empleado {
 
 private String beneficios;


 public EmpleadoPermanente(String nombre, int ID, double salario, String beneficios) {
     super(nombre, ID, salario);
     this.beneficios = beneficios;
 }

 public EmpleadoPermanente(String nombre, int ID, String beneficios) {
     super(nombre, ID);
     this.beneficios = beneficios;
 }


 @Override
 public double calcularSalario() {
     
     
     return salario;
 }


 @Override
 public void mostrarDetalles() {
     JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\nID: " + ID + "\nSalario: " + salario + "\nBeneficios: " + beneficios);
 }
}


class EmpleadoTemporal extends Empleado {

 private int periodoContrato;


 public EmpleadoTemporal(String nombre, int ID, double salario, int periodoContrato) {
     super(nombre, ID, salario);
     this.periodoContrato = periodoContrato;
 }

 public EmpleadoTemporal(String nombre, int ID, int periodoContrato) {
     super(nombre, ID);
     this.periodoContrato = periodoContrato;
 }

 
 @Override
 public double calcularSalario() {

     return salario;
 }

 
 @Override
 public void mostrarDetalles() {
     JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\nID: " + ID + "\nSalario: " + salario + "\nPeriodo de Contrato: " + periodoContrato + " meses");
 }
}


class EmpleadoContratista extends Empleado {

 private int periodoContrato;


 public EmpleadoContratista(String nombre, int ID, double salario, int periodoContrato) {
     super(nombre, ID, salario);
     this.periodoContrato = periodoContrato;
 }

 public EmpleadoContratista(String nombre, int ID, int periodoContrato) {
     super(nombre, ID);
     this.periodoContrato = periodoContrato;
 }

 
 @Override
 public double calcularSalario() {

     return salario;
 }

 public void mostrarDetalles() {
     JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\nID: " + ID + "\nSalario: " + salario + "\nPeriodo de Contrato: " + periodoContrato + " meses");
 }
}

