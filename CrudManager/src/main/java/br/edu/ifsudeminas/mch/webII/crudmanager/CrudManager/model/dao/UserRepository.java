package br.edu.ifsudeminas.mch.webII.crudmanager.CrudManager.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifsudeminas.mch.webII.crudmanager.CrudManager.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
