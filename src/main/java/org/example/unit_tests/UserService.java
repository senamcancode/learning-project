package org.example.unit_tests;
import java.util.HashMap;
import java.util.Map;

public class UserService {
    private Map<String, User> users = new HashMap<>();

    public void addUser(String username, String email) {
        if (username == null || username.isEmpty()) {
            throw new IllegalArgumentException("Username cannot be empty");
        }
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email format");
        }
        users.put(username, new User(username, email));
    }

    public User getUser(String username) {
        if (!users.containsKey(username)) {
            throw new IllegalArgumentException("User not found");
        }
        return users.get(username);
    }

    public boolean isValidUser(String username) {
        return users.containsKey(username);
    }

    public Map<String, User> getUsersList() {
        return users;
    }
}

