package co.empresa.TestBackend.modelo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Servicio implements Serializable {
	private int id;
	private String nombre;
	private String descripcion; 
	private int id_tienda; 
}
