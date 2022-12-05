/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udec.poo.viajes.modelo.entidades;

/**
 *
 * @author JEIFER ALCALA
 */
public class Cliente {
  private String CodigoCliente;
  private String Nombre;
  private String Apellido;
  private String Direccion;
  private String NumeroDeTelefono;
  private String FechaDellegada;
  private String FechaDePartida;
 
//constructor por defecto
 public Cliente (){
 
 }
 //constructor con parametro
 public Cliente (String CodigoCliente){
 this.CodigoCliente = CodigoCliente;
 }
}
