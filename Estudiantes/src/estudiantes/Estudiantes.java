package estudiantes;


import org.xml.sax.*;
import javax.swing.JOptionPane;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.stream.*;
import javax.xml.transform.sax.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.*;
import java.util.Arrays;
import java.util.Vector;

public class Estudiantes {
	
	static toXML pro = new toXML();
	//static toJSON pro1 = new toJSON();

    public static void main(String[] args) {
        //VARIABLES 
        File archivo = new File("estudiantes.txt");
        File archivo1 = null;
        FileReader fr = null;
        BufferedReader br = null;
        Alumnos alum = new Alumnos();
        
        String[][] estudiantes = new String[5][5];
        String matricula = "";
        String nombre = "";
        String materia = "";
        double nota_parciales = 0;
        double nota_examen = 0;

        String lineafichero = ""; //Cada linea del fichero.txt 
        String codigo = ""; //Codigo a borrar 
        String codigoLinea = ""; //Codigo de cada linea del fichero.txt 
        FileWriter fw = null;
        BufferedWriter bw = null;
        Vector lineasAcopiar = new Vector(); //Vector para almacenar lineas a copiar 
        Vector aprobados = new Vector();
        
        int op = 0;
        int cont = 2;

        do {
        	op=Integer.parseInt(JOptionPane.showInputDialog("Seleccion una opcion\n\n"+"1.) Ingrese Estudiante\n"
        +"2.) Listar Estudiantes\n"+"3.) Buscar Estudiante por matricula\n"+"4.) Editar información de Estudiante\n"
        +"5.) Mostrar Estudiantes que aprueban\n"+"6.) Guardar información\n"+"7.) Exportar información a XML\n"
        +"8.) Salir\n"));
            switch (op) {
                case 1:
                    if (cont < 5) {
                        JOptionPane.showMessageDialog(null,"Ingrese nuevo alumno");
                        alum.matricula = JOptionPane.showInputDialog("Ingrese matricula");
                        alum.nombre = JOptionPane.showInputDialog("Ingrese nombre");
                        alum.materia = JOptionPane.showInputDialog("Ingrese materia");
                        alum.nota_parciales =Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota parciales"));
                        alum.nota_examen = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota examen"));
                    } else {
                    	JOptionPane.showMessageDialog(null,"No hay espacio para mas alumnos");
                    }
                    break;

                case 2:
                    System.out.println("Los estudiantes ingresados son:");
                    try {
                        // Apertura del fichero y creacion de BufferedReader para poder
                        // hacer una lectura comoda (disponer del metodo readLine()).
                        fr = new FileReader(archivo);
                        br = new BufferedReader(fr);

                        // Lectura del fichero
                        String linea;
                        String texto = "";
                        while ((linea = br.readLine()) != null) {
                            texto += linea + "\n";
                        }
                        String[] dato = texto.split("\n");
                        for (int i = 0; i < dato.length; i++) {
                            //System.out.println(dato[i].split(";")[0]);
                            System.out.println(dato[i].split(";")[1]);
                            System.out.println(dato[i].split(";")[2]);
                            System.out.println(dato[i].split(";")[3]);
                            System.out.println(dato[i].split(";")[4]);
                            System.out.println("");
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("Error al leer el fichero");
                    }
                    break;

                case 3:
                    String busca = JOptionPane.showInputDialog("Ingrese la matricula a buscar: ");
                    try {
                        // Apertura del fichero y creacion de BufferedReader para poder
                        // hacer una lectura comoda (disponer del metodo readLine()).
                        fr = new FileReader(archivo);
                        br = new BufferedReader(fr);

                        // Lectura del fichero
                        String linea;
                        String texto = "";
                        while ((linea = br.readLine()) != null) {
                            texto += linea + "\n";
                        }
                        String[] dato = texto.split("\n");
                        for (int i = 0; i < dato.length; i++) {
                            if (dato[i].split(";")[0].equals(busca)) {
                                System.out.println(dato[i].split(";")[1]);
                                System.out.println(dato[i].split(";")[2]);
                                System.out.println(dato[i].split(";")[3]);
                                System.out.println(dato[i].split(";")[4]);
                            } else {
                                JOptionPane.showMessageDialog(null,"Ese número de matricula no existe en el registro");
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("Error al leer el fichero");
                    }
                    break;

                case 4:
                    codigo = JOptionPane.showInputDialog("Ingrese la matricula del alumno a editar");

                    try {
                        //RECORRER EL FICHERO PARA COMPROBAR 
                        fr = new FileReader(archivo);
                        br = new BufferedReader(fr);
                        //Recorremos linea a linea el fichero 
                        while (br.ready()) {
                            lineafichero = br.readLine();
                            //Guardamos los tres primeros caracteres de la linea(el codigo) 
                            codigoLinea = lineafichero.substring(0, 4);
                            //Si el codigo de la linea es diferente al codigo introducido: 
                            //Añadimos la linea en el vector lineasAcopiar 
                            if (!codigoLinea.equals(codigo)) {
                                lineasAcopiar.add(lineafichero);
                            }
                        }
                        br.close();

                        //RECORREMOS EL VECTOR Y GUARDAMOS LA LINEAS EN EL FICHERO 
                        fw = new FileWriter(archivo);
                        bw = new BufferedWriter(fw);
                        //Recorremos el vector 
                        for (int l = 0; l < lineasAcopiar.size(); l++) {
                            //Guardamos en linea cada String del vector 
                            lineafichero = (String) lineasAcopiar.elementAt(l);
                            //Escribimos la linea en el fichero y hacemos un salto de linea 
                            bw.write(lineafichero);
                            bw.newLine();
                        }
                        bw.close();

                        
                        JOptionPane.showMessageDialog(null,"Ingrese los nuevos datos del alumno");
                        matricula = JOptionPane.showInputDialog("Ingrese matricula");
                        nombre = JOptionPane.showInputDialog("Ingrese nombre");
                        materia = JOptionPane.showInputDialog("Ingrese materia");
                        nota_parciales =Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota prueba"));
                        nota_examen = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota examen"));

                        FileWriter escribir = new FileWriter(archivo, true);
                        PrintWriter escribirbien = new PrintWriter(escribir);
                        escribirbien.print(matricula + ";" + nombre + ";" + materia + ";" + nota_parciales + ";" + nota_examen);
                        escribirbien.close();
                        escribir.close();

                        JOptionPane.showMessageDialog(null,"El alumno con matricula " + codigo + " ha sido editado");

                    } catch (Exception e) {
                        System.out.println("Error: " + e);
                    }
                    break;

                case 5:
                    System.out.println("Los que apureban son");
                    try {
                        // Apertura del fichero y creacion de BufferedReader para poder
                        // hacer una lectura comoda (disponer del metodo readLine()).
                        fr = new FileReader(archivo);
                        br = new BufferedReader(fr);

                        // Lectura del fichero
                        String linea;
                        String texto = "";
                        while ((linea = br.readLine()) != null) {
                            texto += linea + "\n";
                        }
                        String[] dato = texto.split("\n");
                        for (int i = 0; i < estudiantes.length; i++) {
                            for (int j = 0; j < estudiantes[i].length; j++) {
                                estudiantes[i][j] = dato[i].split(";")[j];
                            }
                        }

                        for (int i = 0; i < 5; i++) {
                            if (Double.parseDouble(estudiantes[i][4]) >= 8 && Double.parseDouble(estudiantes[i][4]) + Double.parseDouble(estudiantes[i][3]) >= 30) {
                                aprobados.add(estudiantes[i][1]);
                            }
                        }
                        for (int i = 0; i < aprobados.size(); i++) {
                            System.out.println(aprobados.elementAt(i));
                        }
                    } catch (Exception e) {
                        System.out.println("Error: " + e);
                    }

                    break;

                case 6:
                	
                    try {
                        FileWriter escribir = new FileWriter(archivo, true);
                        PrintWriter escribirbien = new PrintWriter(escribir);
                        escribirbien.print(alum.matricula + ";" + alum.nombre + ";" + alum.materia + ";" + alum.nota_parciales + ";" + alum.nota_examen);
                        escribirbien.close();
                        escribir.close();
                    } catch (Exception e) {
                        System.out.println("Error al escribir");
                    }
                    System.out.println("Los datos del estudiante se han guardado");
                    break;
                    
                case 7:
                	pro.begin();
                	//pro1.getXMLfromJson();                        
                 break;
                 
                case 8:
                        
                 break;

                case 9:
                	JOptionPane.showMessageDialog(null,"Ud. ha Salido");
                    break;

                default:
                	JOptionPane.showMessageDialog(null,"Elija una opcion correcta");
                    break;

            }

        } while (op != 9);
    }
}

class Alumnos {

    String matricula;
    String nombre;
    String materia;
    double nota_parciales;
    double nota_examen;
}