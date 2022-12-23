package com.br.resource;

import java.text.SimpleDateFormat;
import java.util.Date;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/")
public class ResStatus{
 /**
  * Método GET do caminho raiz, retorna um JSON com o status do servidor e datetime.
  * 
  * @return
  */
 @GET
 @Produces(MediaType.APPLICATION_JSON)
 public String getStatus(){
  SimpleDateFormat objFormat=new SimpleDateFormat("dd/MM/yyyy HH:mm");
  return "{\"status\":\"Online\",\"time\":\""+objFormat.format(new Date())+"\"}";
 }
}
