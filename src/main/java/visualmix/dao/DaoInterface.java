package visualmix.dao;

import java.util.List;

public interface DaoInterface<T> {
		
	List<T> findAll() throws Exception;
	
	T find(Long codigo) throws Exception;
	
}
