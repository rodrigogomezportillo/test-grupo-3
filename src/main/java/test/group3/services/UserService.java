package test.group3.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.group3.entities.Profile;
import test.group3.entities.User;
import test.group3.enums.Rol;
import test.group3.repositories.ProfileRepository;
import test.group3.repositories.UserRepository;

@Service
public class UserService {


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProfileRepository profileRepository;

    public int saveUser(User user){
        User newUser = userRepository.findUserByEmail(user.getEmail());

        if(newUser != null){
            return 1;
        }

        newUser = userRepository.save(user);

        List<Profile> profiles = profileRepository.findProfilesByUserEmail(newUser.getEmail());

        if(profiles.isEmpty()){
            profileRepository.save(new Profile(Rol.CLIENT.toString(), newUser));
        }

        return 0;
        
    }
    
}
