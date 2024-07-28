package me.dio.service;

import java.util.List;

import me.dio.domain.model.User;

public interface UserService extends CrudService<Long, User> {

    List<User> findAll();
    
    User findById(Long id);

    User create(User userToCreate);

    User update(Long id, User userToUpdate);

    void delete(Long id);

}
