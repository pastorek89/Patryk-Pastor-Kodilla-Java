package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface Supplier {

    public boolean order(User user, LocalDateTime localDateTime, Product product);

}
