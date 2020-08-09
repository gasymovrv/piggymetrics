package com.piggymetrics.auth.service.security;

import org.junit.Test;
import org.springframework.security.crypto.password.PasswordEncoder;
import de.mkammerer.argon2.Argon2Factory;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Argon2PasswordEncoderTest {

    private static final PasswordEncoder encoder = new Argon2PasswordEncoder(Argon2Factory.Argon2Types.ARGON2id);

    @Test
    public void shouldReturnTrueWhenPassMatches() {
        String encoded = encoder.encode("pass");
        boolean matches = encoder.matches("pass", encoded);

        assertTrue(matches);
    }

    @Test
    public void shouldReturnFalseWhenPassDoesNotMatch() {
        String encoded = encoder.encode("correct-pass");
        boolean matches = encoder.matches("incorrect-pass", encoded);

        assertFalse(matches);
    }
}