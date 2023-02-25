package br.com.schinaman.mscourse.infra.repositories;

import br.com.schinaman.mscourse.core.domain.Worker;
import br.com.schinaman.mscourse.infra.repositories.DTO.WorkerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<WorkerEntity, Long> {

}
