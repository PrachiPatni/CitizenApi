package in.prachi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.prachi.entity.Citizen;

public interface CitizenRepo extends JpaRepository<Citizen, Integer> {

}
