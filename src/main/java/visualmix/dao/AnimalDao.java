package visualmix.dao;

import java.util.List;

import visualmix.model.Animal;

public class AnimalDao extends DaoImplementacao<Animal> implements DaoInterface<Animal> {

	private static AnimalDao pedidoDaoInstance;
	
	public AnimalDao(Class<Animal> persistenceClass) {
		super(persistenceClass);		
	}
			
	public static AnimalDao getInstance(){
		if(pedidoDaoInstance == null){
			pedidoDaoInstance = new AnimalDao(Animal.class);
		}
		
		return pedidoDaoInstance;
	}
	
	public List<Animal> findAll() throws Exception{
		return super.findAll();
	}
}
