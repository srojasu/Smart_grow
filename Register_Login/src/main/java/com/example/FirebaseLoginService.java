package com.example;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.auth.FirebaseAuth;

import java.io.FileInputStream;
import java.io.IOException;

public class FirebaseLoginService {

    private final FirebaseAuth firebaseAuth;

    public FirebaseLoginService() throws IOException {
        FileInputStream serviceAccount = new FileInputStream("E:\\Proyectos_java\\proyectodb\\smartgrow-c91e1-firebase-adminsdk-p0rka-d686573cfc.json");

        FirebaseOptions options = FirebaseOptions.builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .build();

        FirebaseApp.initializeApp(options);
        firebaseAuth = FirebaseAuth.getInstance();
    }

    public void login(String email, String password) {
        try {
            // Autenticar manualmente con el correo electrónico y la contraseña
            firebaseAuth.createCustomToken(email);
        
            System.out.println("Inicio de sesión exitoso para el usuario: " + email);
        } catch (Exception e) {
            System.out.println("Error durante el inicio de sesión: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            FirebaseLoginService loginService = new FirebaseLoginService();

            // Ejemplo de inicio de sesión
            String email = "violeta@gmail.com";
            String password = "violeta123";
            loginService.login(email, password);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
