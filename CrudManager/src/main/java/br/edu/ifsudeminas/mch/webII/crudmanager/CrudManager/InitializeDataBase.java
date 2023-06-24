package br.edu.ifsudeminas.mch.webII.crudmanager.CrudManager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import br.edu.ifsudeminas.mch.webII.crudmanager.CrudManager.model.User;
import br.edu.ifsudeminas.mch.webII.crudmanager.CrudManager.model.dao.UserRepository;



@Component
@Transactional

public class InitializeDataBase implements CommandLineRunner{
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User alex = new User();
		alex.setName("Alex");
		alex.setEmail("alex@gmail.com");
		alex.setGender("M");
		
		User maria= new User();
		maria.setName("Maria");
		maria.setEmail("maria@gmail.com");
		maria.setGender("F");
		
		User jose = new User();
		jose.setName("jose");
		jose.setEmail("jose@gmail.com");
		jose.setGender("M");
        
		
		userRepository.save(alex);
		userRepository.save(maria);
		userRepository.save(jose);
		
		List<User> users = userRepository.findAll();
		
		for(User user: users) {
			System.out.println(user.getName());
			System.out.println(user.getEmail());
			System.out.println(user.getGender());
		}
	} 

}

