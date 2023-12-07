package Pay.repository;

import Pay.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{
//    Boolean findByNumber(String number);
    User findByUserName(String username);
    public boolean existsByUserName(String userName);

    public boolean existsByPhoneNumber(String phoneNumber);
    User findByPhoneNumber(String phoneNumber);

//    boolean existsByNumber(String phoneNumber);
}
