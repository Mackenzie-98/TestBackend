package co.empresa.TestBackend.modelo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Seguir implements Serializable {
	private int id_tienda;
	private int id_cliente;
}
