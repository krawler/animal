package visualmix.controller;

import java.util.List;

import visualmix.dao.AnimalDao;
import visualmix.model.Animal;

public class AnimalController {
	
	public List<Animal> listarTodos(){		
		List<Animal> animais = null;
		try{
			 animais = AnimalDao.getInstance().findAll();
			 if(animais.size() > 0){
				return animais;
			 }
		}catch(Exception e){
			return null;
		}		
		
		return null;
	}
			
	public Animal encontrar(int id) throws Exception {
		return AnimalDao.getInstance().find(new Long(id).longValue());
	}

}
