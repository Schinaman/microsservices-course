package br.com.schinaman.mscourse.port.input;

import br.com.schinaman.mscourse.infra.repositories.DTO.WorkerEntity;
import br.com.schinaman.mscourse.infra.repositories.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/workers")
public class WorkerEndpoint {

    @Autowired
    private WorkerRepository workerRepository;

    @GetMapping
    public ResponseEntity<List<WorkerEntity>> findAll(){
        List<WorkerEntity> list = workerRepository.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<WorkerEntity> findById(@PathVariable Long id){
        WorkerEntity workerObj = workerRepository.findById(id).get();
        return ResponseEntity.ok(workerObj);
    }

}
