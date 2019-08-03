package com.kodilla.good.patterns.clientService;

import java.time.LocalDateTime;

public interface Provider {

    boolean process(Customer customer, Provider provider, LocalDateTime dateOfOrder, Product product);
}
