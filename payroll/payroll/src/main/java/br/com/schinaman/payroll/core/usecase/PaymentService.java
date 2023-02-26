package br.com.schinaman.payroll.core.usecase;

import br.com.schinaman.payroll.core.domain.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(Long workerId, int days){
        return new Payment("Bob", 100.00, days); //objeto mocado, teria que buscar do outro ms
    }
}
