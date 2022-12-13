/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.udec.poo.viaje;
import java.time.LocalDate;
import co.edu.udec.poo.viajes.modelo.entidades.Cliente;
import co.edu.udec.poo.viajes.modelo.entidades.Hotel;
import co.edu.udec.poo.viajes.modelo.entidades.Sucursal;
import co.edu.udec.poo.viajes.modelo.entidades.Vuelo;
import java.util.ArrayList;
import java.util.List;
//import java.util.Scanner;

/**
 *
 * @author JEIFER ALCALA
 */
public class Principal {

    public static void main(String[] args) {

        // Llamamos al contructor de la clase sucursal.
        Sucursal sucursal1 = new Sucursal("1234", "bellavista", "01800000");
        System.out.println("Caracteristicas de sucursal n° 1: "+"\n"+" sucursal : " + sucursal1.getCodigoSucursal() + "\n"
                + " direccion: " + sucursal1.getDireccion() + "\n" + " numero de telefono: " + sucursal1.getNumeroTelefonico());

        // llamando al constructor  de la clase cliente 1
        Cliente cliente1 = new Cliente("0001");
        //metodo para establecer la fecha de entrada del cliente.
        LocalDate hoy = LocalDate.now();
        //estos establecen el valor de los atributos de los clientes
       
        cliente1.setNombre(" Camila Sofia");
        cliente1.setApellido("Hernandez Guerrero");
        cliente1.setNumeroDeTelefono("317-4224-4324");
        cliente1.setDireccion("Cl 12- av32-54");
       cliente1.setFechaDellegada(hoy);
       cliente1.setFechaDePartida(5, 6, 2023);
       
        /*   System.out.println("\n" + "las caracteristicas del primer cliente son: " + "\n" + "Código: " + cliente1.getCodigoCliente() + "\n"
                + "Nombre: " + cliente1.getNombre() + "\n" + "Apellido: " + cliente1.getApellido() + "\n" + "numero de telefono: " + cliente1.getNumeroDeTelefono()
                + "\n" + "Direccion: " + cliente1.getDireccion());*/
        // (falta la fecha de llegada y partida del cliente
        
        
        //Cliente 2
        Cliente cliente2 = new Cliente("0002");
        //estos establecen el valor de los atributos de los clientes
        cliente2.setNombre("Leidy");
        cliente2.setApellido("Carrera Contreras");
        cliente2.setNumeroDeTelefono("322-4424-4324");
        cliente2.setDireccion("Cl 52- av11-44");
        cliente2.setFechaDellegada(hoy);
         cliente2.setFechaDePartida(3, 7, 2023);
       /* System.out.println("\n" + "las caracteristicas del segundo cliente son: " + "\n" + "Código: " + cliente2.getCodigoCliente() + "\n"
                + "Nombre: " + cliente2.getNombre() + "\n" + "Apellido: " + cliente2.getApellido() + "\n" + "numero de telefono: " + cliente2.getNumeroDeTelefono()
                + "\n" + "Direccion: " + cliente2.getDireccion());*/
        
        
        //Cliente 3
        Cliente cliente3 = new Cliente("0003");
        //estos establecen el valor de los atributos de los clientes
        cliente3.setNombre("carlos alberto");
        cliente3.setApellido("Hernandez Guerrero");
        cliente3.setNumeroDeTelefono("312-4224-4324");
        cliente3.setDireccion("Cl 71- av11-04");
        cliente3.setFechaDellegada(hoy);
        cliente3.setFechaDePartida(1, 1, 2024);
        /* System.out.println("\n" + "las caracteristicas del tercer cliente son: " + "\n" + "Código: " + cliente3.getCodigoCliente() + "\n"
                + "Nombre: " + cliente3.getNombre() + "\n" + "Apellido: " + cliente3.getApellido() + "\n" + "numero de telefono: " + cliente3.getNumeroDeTelefono()
                + "\n" + "Direccion: " + cliente3.getDireccion());*/
       
        //lista de clientes
        List<Cliente> listaCliente = new ArrayList<Cliente>();
        listaCliente.add(cliente1);
        listaCliente.add(cliente2);
        listaCliente.add(cliente3);
        System.out.println("\n"+"lista De Clientes:");
        for(Cliente i : listaCliente){
            System.out.println(i);
        }
        //llamando al constructor de hotel.
        Hotel hotel1 = new Hotel("4321", "infinit", "cl 32- av 43-54");
        hotel1.setCiudad("veneyork");
         // se establecen la demás caracteristicas del Hotel 1.
        hotel1.setNumeroTelefonico("018000666666");
        //faltan las listas relacionadas con el hotel.
        System.out.println("\n" + "Las caracteristicas del primer Hotel son: " + "\n" + hotel1.toString());

        
        //Llamando al constructor de la clase Vuelo
        Vuelo vuelo1 = new Vuelo("0033", "Medellin-Colombia", "carolina sur-E.E.U.U");
        //se establece los demás atributos del vuelo 1
        LocalDate Fecha = LocalDate.of(2022, 12, 31);
        //salida por consola de las caracteristicas principales del vuelo 1.
        System.out.println("");
        System.out.println("Las caracteristicas del vuelo numero 1 son: ");
        System.out.println(vuelo1.toString());
        System.out.println("la fecha es:  "+Fecha.toString());
    }
}
