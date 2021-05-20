package co.empresa.TestBackend.modelo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tienda implements Serializable {
	private int id;
	private String nombre;
	private String lema;
	private String descripcion; 
	private String email;
	private String clave;
	private String propietario;
	private String facebook;
	private String web;
	private String imagen;
}
