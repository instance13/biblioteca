package com.egg.biblioteca.entidades;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "libros")
public class Libro {

  @Id
  private Long isbn;
  private String titulo;
  private Integer ejemplares;

  @Temporal(TemporalType.DATE)
  private Date alta;

  @ManyToOne
  private Autor autor;

  @ManyToOne
  private Editorial editorial;

}