package de.dhbw.tinf22b.streams.optional;

import java.io.IOException;
import java.util.Optional;

public interface UserRepository {

	Optional<String> nameOf(String login) throws IOException;
}
