/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import javaapplication3.Persona;
import java.util.Scanner;

/**
 *
 * @author esqui
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //TODO code application logic here
         // Definiciones 
        Scanner scan = new Scanner(System.in); 
        Cliente cliente1 = new Cliente();
        Trabajador empleado = new Trabajador();
        //set de valores de Cliente
        System.out.println("Ingrese el Nombre del Cliente: ");
        cliente1.setNombre(scan.next());
        System.out.println("Ingrese la edad del cliente: ");
        cliente1.setEdad(scan.nextInt());
        System.out.println("Ingrese el numero de telefono del cliente: ");
        cliente1.setTelefono(scan.next());
        System.out.println("Ingrese el Credito del cliente: ");
        cliente1.setCredito(scan.nextDouble());
        
        //get de valores de Cliente
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("--------------------------");
        System.out.println("Nombre del cliente es: " + cliente1.getNombre() +
                ", La edad del cliente es: " + cliente1.getEdad() + 
                ", Numero de telefono del cliente es: " + cliente1.getTelefono() + 
                ", El credito del cliente es: " + cliente1.getCredito());
        System.out.println("--------------------------");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        
        //set de valores de empleado
         System.out.println("Ingrese el Nombre del Empleado: ");
        empleado.setNombre(scan.next());
        System.out.println("Ingrese la edad del Empleado: ");
        empleado.setEdad(scan.nextInt());
        System.out.println("Ingrese el numero de telefono del Empleado: ");
        empleado.setTelefono(scan.next());
        System.out.println("Ingrese el saldo del Empleado: ");
        empleado.setSalario(scan.nextDouble());
        
        //get de valores de empleado
         System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("--------------------------");
        System.out.println("Nombre del Empleado es: " + empleado.getNombre() +
                ", La edad del Empleado es: " + empleado.getEdad() + 
                ", Numero de telefono del Empleado es: " + empleado.getTelefono() + 
                ", El salario del Empleado es: " + empleado.getSalario());
        System.out.println("--------------------------");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        
        
        
      
    }
    
}
