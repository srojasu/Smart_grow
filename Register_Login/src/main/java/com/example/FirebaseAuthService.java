package com.example;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.UserRecord;

public class FirebaseAuthService {
    
    private final FirebaseAuth firebaseAuth;

    public FirebaseAuthService() {
        firebaseAuth = FirebaseAuth.getInstance();
    }

    public void registerUser(String email, String password) throws FirebaseAuthException {
        UserRecord.CreateRequest request = new UserRecord.CreateRequest()
            .setEmail(email)
            .setPassword(password);
        UserRecord userRecord = firebaseAuth.createUser(request);
        System.out.println("Usuario registrado: " + userRecord.getUid());
    }

}
