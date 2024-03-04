package com.linkcxo.core;

import com.google.auth.oauth2.ServiceAccountCredentials;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.List;

public class OTPGenerator {

    public static void main(String[] args) throws IOException, GeneralSecurityException {
        // Replace 'path/to/your/service-account.json' with the path to your service account JSON file
        String serviceAccountPath = "path/to/your/service-account.json";
        String userId = "user123"; // Replace with a unique identifier for the user

        // Load the service account credentials
        ServiceAccountCredentials credentials = ServiceAccountCredentials.fromStream(new FileInputStream(serviceAccountPath));

        // Create a GoogleAuthenticator instance
        GoogleAuthenticatorConfig config = new GoogleAuthenticatorConfig.GoogleAuthenticatorConfigBuilder().build();
        GoogleAuthenticator gAuth = new GoogleAuthenticator(config);

        // Create a new key for the user
        GoogleAuthenticatorKey key = gAuth.createCredentials(userId);

        // Print the key's secret (store this securely)
        System.out.println("Secret: " + key.getKey());

        // Generate and print the OTP for testing
        int otp = gAuth.getTotpPassword(key.getKey());
        System.out.println("Generated OTP: " + otp);
    }
}
