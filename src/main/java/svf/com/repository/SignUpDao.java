package svf.com.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import svf.com.model.SignUpData;

public interface SignUpDao extends JpaRepository<SignUpData, Integer> {

	public Optional<SignUpData> findByUserName(String userName);
	
	
	
}