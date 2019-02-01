package visualmix.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import visualmix.controller.AnimalController;
import visualmix.model.Animal;

@Path("ws")
public class AnimalResource {
	
	@GET
	@Path("/animais")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Animal> listarTodos(){
		return new AnimalController().listarTodos();
	}
	
	@GET
	@Path("/encontrar/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Animal encontrar(@PathParam("id") int id) throws Exception{
		return new AnimalController().encontrar(id);
	}

}
