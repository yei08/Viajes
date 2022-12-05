/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udec.poo.viajes.modelo.entidades;

import java.util.List;

/**
 *
 * @author JEIFER ALCALA
 */
public class Hotel {
  private String CodigoHotel;
  private String Nombre;
  private String Direccion;
  private String Ciudad;
  private String NumeroTelefonico;
  private List <Cliente> listaDeClientes;
 
  //constructor por defercto
  public Hotel (){
  
  }
  //constructor con parametros
  public Hotel (String CodigoHotel, String NombreHotel,
  String DireccionHotel){
     this.CodigoHotel = CodigoHotel;
     this.Nombre = NombreHotel;
     this.Direccion = DireccionHotel;
  } 

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public void setNumeroTelefonico(String NumeroTelefonico) {
        this.NumeroTelefonico = NumeroTelefonico;
    }

    public String getCodigoHotel() {
        return CodigoHotel;
        
    }
 
}
