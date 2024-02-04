package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su cédula: ");
        int cedula = scanner.nextInt();
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.next();
        System.out.print("Ingrese sus apellidos: ");
        String apellidos = scanner.next();
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        System.out.print("Ingrese su ciudad: ");
        String ciudad = scanner.next();
        System.out.print("Ingrese el número de boletas que desea comprar: ");
        int boletas = scanner.nextInt();
        if (edad < 18) {
            System.out.println("Lo sentimos, usted no tiene la edad mínima para comprar boletas.");
        } else if (boletas > 4) {
            System.out.println("Lo sentimos, solo se pueden comprar un máximo de 4 boletas.");
        } else {
            double costoTotal = boletas * 450000.0;
            System.out.println("--------------------------------------------------");
            System.out.println("COMPRA DE BOLETAS");
            System.out.println("Cédula: " + cedula);
            System.out.println("Nombre: " + nombre + " " + apellidos);
            System.out.println("Edad: " + edad);
            System.out.println("Ciudad: " + ciudad);
            System.out.println("Número de boletas: " + boletas);
            System.out.println("Costo total: $" + costoTotal);
            System.out.println("--------------------------------------------------");
        }
    }
}