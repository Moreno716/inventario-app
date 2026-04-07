package gm.inventarios;

import gm.inventarios.modelo.Producto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InventariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventariosApplication.class, args);

		//Prueba de Lombok
		Producto producto = new Producto();
		producto.setDescripcion("Zapatos");
		producto.setPrecio(80000.0);
		producto.setExistencia(15);

		//Imprimir el objeto se llama toString de Lombok
		System.out.println(producto);
	}

}
