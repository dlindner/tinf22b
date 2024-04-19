package de.dhbw.tinf22b.streams.optional;

import java.io.IOException;
import java.util.Optional;

@FunctionalInterface
public interface UserDatabase {

	Optional<User> loadUserWith(String login) throws IOException;
}
