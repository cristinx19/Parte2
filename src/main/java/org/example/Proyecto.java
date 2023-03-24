package org.example;

import java.time.LocalDate;
import java.util.*;


/**
 * Class Proyecto
 */
public class Proyecto {

  //
  // Fields
  //

  private LocalDate fechaInicio;
  private LocalDate fechaFin;
  private String descripcion;

  private Lugar lugarcito;
  
  //
  // Constructors
  //
  public Proyecto () { };

  public Proyecto(LocalDate fechaInicio, LocalDate fechaFin, String descripcion, Lugar lugarcito) {
    this.fechaInicio = fechaInicio;
    this.fechaFin = fechaFin;
    this.descripcion = descripcion;
    this.lugarcito = lugarcito;
  }

  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of fechaInicio
   * @param newVar the new value of fechaInicio
   */
  public void setFechaInicio (LocalDate newVar) {
    fechaInicio = newVar;
  }

  /**
   * Get the value of fechaInicio
   * @return the value of fechaInicio
   */
  public LocalDate getFechaInicio () {
    return fechaInicio;
  }

  /**
   * Set the value of fechaFin
   * @param newVar the new value of fechaFin
   */
  public void setFechaFin (LocalDate newVar) {
    fechaFin = newVar;
  }

  /**
   * Get the value of fechaFin
   * @return the value of fechaFin
   */
  public LocalDate getFechaFin () {
    return fechaFin;
  }

  /**
   * Set the value of descripcion
   * @param newVar the new value of descripcion
   */
  public void setDescripcion (String newVar) {
    descripcion = newVar;
  }

  /**
   * Get the value of descripcion
   * @return the value of descripcion
   */
  public String getDescripcion () {
    return descripcion;
  }

  //
  // Other methods
  //

}
