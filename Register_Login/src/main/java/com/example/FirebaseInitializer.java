package com.example;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import java.io.FileInputStream;
import java.io.IOException;

public class FirebaseInitializer {

    public static void initialize() throws IOException {
        FileInputStream serviceAccount = new FileInputStream("Clave_Firebase");

        FirebaseOptions options = FirebaseOptions.builder()
            .setCredentials(GoogleCredentials.fromStream(serviceAccount))
            .setDatabaseUrl("https://smartgrow-c91e1-default-rtdb.firebaseio.com")
            .build();

        FirebaseApp.initializeApp(options);
    }
}



