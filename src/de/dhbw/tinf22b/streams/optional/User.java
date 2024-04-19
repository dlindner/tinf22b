package de.dhbw.tinf22b.streams.optional;

import java.util.Optional;

@FunctionalInterface
public interface User {

	Optional<String> fullName();
}
