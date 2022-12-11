/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.udec.poo.viaje;

import co.edu.udec.poo.viajes.modelo.entidades.Cliente;
import co.edu.udec.poo.viajes.modelo.entidades.Hotel;
import co.edu.udec.poo.viajes.modelo.entidades.Sucursal;
import co.edu.udec.poo.viajes.modelo.entidades.Vuelo;
//import java.util.Scanner;

/**
 *
 * @author JEIFER ALCALA
 */
public class Principal {

    public static void main(String[] args) {

        // Llamamos al contructor de la clase sucursal.
        Sucursal sucursal1 = new Sucursal("1234", "bellavista", "01800000");
        System.out.println("el codigo de la primera sucursal es: " + sucursal1.getCodigoSucursal() + "\n"
                + " direccion: " + sucursal1.getDireccion() + "\n" + " numero de telefono: " + sucursal1.getNumeroTelefonico());

        // llamando al constructor  de la clase cliente
        Cliente cliente1 = new Cliente("432424244");
        //estos establecen el valor de los atributos de los clientes
        cliente1.setNombre("carlos alberto");
        cliente1.setApellido("Hernandez Guerrero");
        cliente1.setNumeroDeTelefono("312-4224-4324");
        cliente1.setDireccion("Cl 32- av32-54");
        // (falta la fecha de llegada y partida del cliente)

        System.out.println("\n" + "las caracteristicas del primer cliente son: " + "\n" + "Código: " + cliente1.getCodigoCliente() + "\n"
                + "Nombre: " + cliente1.getNombre() + "\n" + "Apellido: " + cliente1.getApellido() + "\n" + "numero de telefono: " + cliente1.getNumeroDeTelefono()
                + "\n" + "Direccion: " + cliente1.getDireccion());

        //llamando al constructor de hotel.
        Hotel hotel1 = new Hotel("4321", "infinito", "cl 32- av 43-54");
        hotel1.setCiudad("veneyork");
        // se establecen la demás caracteristicas del Hotel 1.
        hotel1.setNumeroTelefonico("018000666666");
        //faltan las listas relacionadas con el hotel.
        System.out.println("\n" + "Las caracteristicas del primer Hotel son: " + "\n" + "Codigo de hotel: " + hotel1.getCodigoHotel());

        //Llamando al constructor de la clase Vuelo
        Vuelo vuelo1 = new Vuelo("0033", "Medellin-Colombia", "carolina sur-E.E.U.U");
            

    }
}

