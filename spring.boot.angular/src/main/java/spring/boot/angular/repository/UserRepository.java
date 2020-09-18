package spring.boot.angular.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import spring.boot.angular.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
