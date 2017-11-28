package <%= packageName %>.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import entity.RoleAccess;

public interface RoleRepository extends MongoRepository<RoleAccess, String> {

    RoleAccess findByName(String name);

}
