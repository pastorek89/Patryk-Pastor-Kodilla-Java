package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class AirportsData {

    public Map<String,Boolean> addAirports() {
        Map<String,Boolean> airports = new HashMap<String,Boolean>();

        String airport1 = "Warsaw";
        String airport2 = "Cracow";
        String airport3 = "Amsterdam";

        Boolean available1 = true;
        Boolean available2 = false;
        Boolean available3 = true;

        airports.put(airport1,available1);
        airports.put(airport2,available2);
        airports.put(airport3,available3);

        return airports;
    }


}
