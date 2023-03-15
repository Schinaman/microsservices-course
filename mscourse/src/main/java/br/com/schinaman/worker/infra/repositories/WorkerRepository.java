package br.com.schinaman.worker.infra.repositories;

import br.com.schinaman.worker.infra.repositories.DTO.WorkerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<WorkerEntity, Long> {

}
