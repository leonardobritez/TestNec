package service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import model.Matriz;

@Transactional
public interface MatrizRepository extends CrudRepository<Matriz, Integer> {

}
