package app.repository;

import app.model.RealEstate;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class RealEstateRepositoryMap implements IRealEstateRepository {


    private final Map<Long, RealEstate> realestates = new HashMap<>();

    public RealEstateRepositoryMap() {
        initData();
    }

    private void initData() {
        realestates.put(1L, new RealEstate(1L, "Apartment", new BigDecimal(4)));
        realestates.put(2L, new RealEstate(2L, "Villa", new BigDecimal(3)));
        realestates.put(3L, new RealEstate(3L, "House", new BigDecimal(6)));

    }

    @Override
    public RealEstate getById(long id) {
        return realestates.get(id);
    }
}
