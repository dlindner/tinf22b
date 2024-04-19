package de.dhbw.tinf22b.streams.optional;

import java.io.IOException;
import java.util.Optional;

public class DatabaseBackedUserRepository implements UserRepository {
	
	private final UserDatabase database;
	
	public DatabaseBackedUserRepository(UserDatabase useThis) {
		super();
		this.database = useThis;
	}
	
	@Override
	public Optional<String> nameOf(String login) throws IOException {
		Optional<User> maybeUser = this.database.loadUserWith(login);
		return maybeUser.flatMap(u -> u.fullName());
//		System.out.println(user);
//		if (user == null) {
//			return Optional.empty();
//		}
//		return Optional.of(
//			user.fullName()
//		);
	}
}
