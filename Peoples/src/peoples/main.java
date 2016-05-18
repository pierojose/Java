package peoples;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //////////Creacicon de objetos//////////
        people persona1 = new people();
        people persona2 = new people();        
        people persona3 = new people();
        people persona4 = new people();
        Scanner sc = new Scanner(System.in);
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        System.out.println("Persona 1");
        System.out.print("Ingrese nombre: ");
        persona1.nombre = sc.next();
        System.out.print("Ingrese apellido: ");
        persona1.apellido = sc.next();
        System.out.print("Ingrese cedula de indentidad: ");
        persona1.cedulaIdentidad = sc.next();
        System.out.print("Ingrese edad: ");
        persona1.fechaNacimiento = sc.nextInt();
        System.out.print("Ingrese telefono: ");
        persona1.telefono = sc.next();
        System.out.print("Ingrese lugar de residencia: ");
        persona1.lugarResidencia = sc.next();
        System.out.print("Ingrese 1 si es casado y 0 si es soltero: ");
        persona1.casado = sc.nextInt();
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        System.out.println("\nPersona 2");
        System.out.print("Ingrese nombre: ");
        persona2.nombre = sc.next();
        System.out.print("Ingrese apellido: ");
        persona2.apellido = sc.next();
        System.out.print("Ingrese cedula de indentidad: ");
        persona2.cedulaIdentidad = sc.next();
        System.out.print("Ingrese edad: ");
        persona2.fechaNacimiento = sc.nextInt();
        System.out.print("Ingrese telefono: ");
        persona2.telefono = sc.next();
        System.out.print("Ingrese lugar de residencia: ");
        persona2.lugarResidencia = sc.next();
        System.out.print("Ingrese 1 si es casado y 0 si es soltero: ");
        persona2.casado = sc.nextInt();
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        System.out.println("\nPersona 3");
        System.out.print("Ingrese nombre: ");
        persona3.nombre = sc.next();
        System.out.print("Ingrese apellido: ");
        persona3.apellido = sc.next();
        System.out.print("Ingrese cedula de indentidad: ");
        persona3.cedulaIdentidad = sc.next();
        System.out.print("Ingrese edad: ");
        persona3.fechaNacimiento = sc.nextInt();
        System.out.print("Ingrese telefono: ");
        persona3.telefono = sc.next();
        System.out.print("Ingrese lugar de residencia: ");
        persona3.lugarResidencia = sc.next();
        System.out.print("Ingrese 1 si es casado y 0 si es soltero: ");
        persona3.casado = sc.nextInt();
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        System.out.println("\nPersona 4");
        System.out.print("Ingrese nombre: ");
        persona4.nombre = sc.next();
        System.out.print("Ingrese apellido: ");
        persona4.apellido = sc.next();
        System.out.print("Ingrese cedula de indentidad: ");
        persona4.cedulaIdentidad = sc.next();
        System.out.print("Ingrese edad: ");
        persona4.fechaNacimiento = sc.nextInt();
        System.out.print("Ingrese telefono: ");
        persona4.telefono = sc.next();
        System.out.print("Ingrese lugar de residencia: ");
        persona4.lugarResidencia = sc.next();
        System.out.print("Ingrese 1 si es casado y 0 si es soltero: ");
        persona4.casado = sc.nextInt();
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        System.out.println("\nLas personas que viven en Esmeraldas son mayores a 30 años y casados son:");
        if(persona1.lugarResidencia.equalsIgnoreCase("Esmeraldas") && persona1.fechaNacimiento >= 30 && persona1.casado == 1){
            System.out.println(persona1.nombre + " " + persona1.apellido);
        }
        if(persona2.lugarResidencia.equalsIgnoreCase("Esmeraldas") && persona2.fechaNacimiento >= 30 && persona2.casado == 1){
            System.out.println(persona2.nombre + " " + persona2.apellido);
        }
        if(persona3.lugarResidencia.equalsIgnoreCase("Esmeraldas") && persona3.fechaNacimiento >= 30 && persona3.casado == 1){
            System.out.println(persona3.nombre + " " + persona3.apellido);
        }
        if(persona4.lugarResidencia.equalsIgnoreCase("Esmeraldas") && persona4.fechaNacimiento >= 30 && persona4.casado == 1){
            System.out.println(persona4.nombre + " " + persona4.apellido);
        }
    }
}