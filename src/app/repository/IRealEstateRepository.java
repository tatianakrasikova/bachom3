package app.repository;

import app.model.RealEstate;
import org.springframework.stereotype.Repository;

@Repository
public interface IRealEstateRepository  {
    RealEstate getById(long id);
}
