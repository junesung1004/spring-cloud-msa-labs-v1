package com.sesac.userservice.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sesac.userservice.entity.User;
import lombok.RequiredArgsConstructor;
import com.sesac.userservice.repository.UserRepository;

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
