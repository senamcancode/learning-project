//package org.example.unit_tests;
//
//import java.util.List;
//import java.util.Optional;
//
//public class ComplexUserService {
//    private final UserRepository userRepository;
//    private final EmailService emailService;
//
//    public ComplexUserService(UserRepository userRepository, EmailService emailService) {
//        this.userRepository = userRepository;
//        this.emailService = emailService;
//    }
//
//    public User getUserById(int id) {
//        Optional<User> user = userRepository.findById(id);
//        return user.orElseThrow(() -> new IllegalArgumentException("User not found"));
//    }
//
//    public List<User> getAllUsers() {
//        return userRepository.findAll();
//    }
//
//    public boolean deleteUser(int id) {
//        Optional<User> user = userRepository.findById(id);
//        if (user.isPresent()) {
//            userRepository.delete(id);
//            return true;
//        }
//        return false;
//    }
//
//    public User createUser(String username, String email) {
//        if (username == null || username.isBlank()) {
//            throw new IllegalArgumentException("Username cannot be empty");
//        }
//        if (email == null || !email.contains("@")) {
//            throw new IllegalArgumentException("Invalid email format");
//        }
//
//        User newUser = new User(username, email);
//        User savedUser = userRepository.save(newUser);
//
//        emailService.sendWelcomeEmail(savedUser.getEmail());
//
//        return savedUser;
//    }
//
//    public boolean isValidUser(int id) {
//        return userRepository.findById(id).isPresent();
//    }
//}