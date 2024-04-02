package com.example;
import com.google.firebase.auth.FirebaseAuthException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FirebaseInitializer.initialize();

            FirebaseAuthService authService = new FirebaseAuthService();

            // Registro de usuario
            authService.registerUser("violeta@gmail.com", "violeta123");

        } catch (IOException | FirebaseAuthException e) {
            e.printStackTrace();
        }
    }
}

