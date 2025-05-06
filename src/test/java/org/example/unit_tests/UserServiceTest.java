package org.example.unit_tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {
    public UserService userService;

    @BeforeEach
    public void init() {
        userService = new UserService();
    }

    @Test
    public void addUser() {
        String username = "senamD";
        String email = "senamd@gmail.com";

        userService.addUser(username, email);

        assertNotNull(userService.getUsersList());
        assert(userService.getUsersList().size() == 1);

        assertTrue(userService.getUsersList().containsKey("senamD"));


    }

    @Test
    public void emptyUsernameInAddUserMethodThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            String username = "";
            String email = "senamd@gmail.com";

            userService.addUser(username, email);
        });

        String expectedMessage = "Username cannot be empty";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

    }


    @Test
    public void nullUsernamThrowsIllegalArgumentExceptionTest() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            String username = null;
            String email = "senamd@gmail.com";

            userService.addUser(username, email);
        });

        String expectedMessage = "Username cannot be empty";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }


    @Test
    public void nullEmailInAddUserMethodThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            String username = "senamD";
            String email = null;

            userService.addUser(username, email);
        });

        String expectedMessage = "Invalid email format";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void invalidEmailInAddUserMethodThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            String username = "senamD";
            String email = "senamdanielgmail.com";

            userService.addUser(username, email);
        });

        String expectedMessage = "Invalid email format";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }


    @Test
    public void getUser() {
        String username = "senamD";
        String email = "senamd@gmail.com";

        userService.addUser(username, email);

        assert(userService.getUsersList() != null);
        User user = userService.getUser(username);

        assertNotNull(user);
        assertEquals("senamD", user.getUsername());
        assertEquals("senamd@gmail.com", user.getEmail());
    }


    @Test
    public void emptyUsernameInGetUserThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            String username = "";

            userService.getUser(username);
        });

        String expectedMessage = "User not found";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

    }

    @Test
    public void isValidUser () {
        String username = "senamD";
        String email = "senamd@gmail.com";

        userService.addUser(username, email);

        Boolean result = userService.isValidUser(username);

        assertEquals(true, result);

    }

}
