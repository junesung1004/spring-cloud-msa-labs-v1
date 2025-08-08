package service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import entity.User;
import lombok.RequiredArgsConstructor;
import repository.UserRepository;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class UserService {

	private final UserRepository userRepository;

	public User findById(Long id) {
		return userRepository.findById(id).orElseThrow(
			() -> new RuntimeException("User not found with id: " + id)
		);
	}
}
