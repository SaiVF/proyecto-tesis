package svf.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import svf.com.model.LogInData;

public interface LoginDataDao  extends JpaRepository<LogInData, Integer>{

}

