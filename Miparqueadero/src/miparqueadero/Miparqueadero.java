/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miparqueadero;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Miparqueadero {

    private static Vehiculo[] Vehiculo;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese el numero correspondiente");
        System.out.println("1.-para ingresar Vehiculo  2.-para Retirar Vehiculo  3.-para Consultar cupos ");
        System.out.print("Elija la opcion:");
        int opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                Vehiculo miVehiculo=new Vehiculo();
                miVehiculo=Vehiculo[100];
                                     
                System.out.println("Ha seleccionado Ingresar Vehiculo");
                String placa = null;
                String propietario;
                float cilindraje;
               
                System.out.printf("Hora de ingreso");
                break;

            case 2:
                System.out.println("Retirar");
                System.out.println("ingrese la placa del Vehiculo");
                 if( placa != null )
        {
            int horaingreso = 530;
            int horasalida = 630;
            int valor = (horasalida - horaingreso)* 100;
                    System.out.println(valor);
                    
            
                break;
        }
            case 3:
            
                System.out.println("Consultar");
                
                
                break;

        }
        }
    }

        
    
    

    


