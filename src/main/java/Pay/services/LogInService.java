package Pay.services;

import Pay.model.User;
import Pay.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class LogInService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    public Boolean logIn(String password,String username){
//String phoneNumber=countryCode + number;
        User find= userRepository.findByUserName(username);
        return passwordEncoder.matches(password,find.getPassword());
    }

    public User postDetails(User User) {

//        String countryCode= User.getCountryCode();
//        String phoneNumber=User.getNumber();
//        String phoneNumberMerge=countryCode + phoneNumber;
//        User.setPhoneNumber(phoneNumberMerge);
        BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder();
        String encrypt=bCryptPasswordEncoder.encode(User.getPassword()).toString() ;
        User.setPassword(encrypt);
        return userRepository.save(User);
    }

}
