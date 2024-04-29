package de.dhbw.tinf22b.streams.optional;

import java.io.IOException;
import java.util.Optional;

public class Main {

	public static void main(String[] args) throws IOException {
		UserDatabase database = s -> {
			if ("admin".equals(s)) {
				return Optional.of(() -> Optional.of("Der Administrator"));
			} else {
				return Optional.empty();
			}
		};
		UserRepository users = new DatabaseBackedUserRepository(
			database
		);
		String login = "amdin";
		Optional<String> benutzername = users.nameOf(login);
		System.out.println(benutzername);
	}
}
