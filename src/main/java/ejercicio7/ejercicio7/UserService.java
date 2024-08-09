package ejercicio7.ejercicio7;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private List<User> users = new ArrayList<>();
    
     @PreAuthorize("hasRole('TAQUILLERO')")
    public List<User> getAllUsers() {
        return users;
    }

    public User createUser(User user) {
        users.add(user);
        return user;
    }
}