package com.piggymetrics.auth.service.security;

import org.springframework.security.crypto.password.PasswordEncoder;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;

public class Argon2PasswordEncoder implements PasswordEncoder {

    private static final int ITERATIONS = 10;

    private static final int MEMORY = 65536;

    private static final int PARALLELISM = 1;

    private final Argon2 encoder;

    public Argon2PasswordEncoder(Argon2Factory.Argon2Types type) {
        encoder = Argon2Factory.create(type);
    }

    @Override
    public String encode(CharSequence rawPassword) {
        return encoder.hash(ITERATIONS, MEMORY, PARALLELISM, rawPassword.toString().toCharArray());
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        return encoder.verify(encodedPassword, rawPassword.toString().toCharArray());
    }
}
