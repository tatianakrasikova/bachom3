package app.service;

import app.model.RealEstate;
import app.repository.IRealEstateRepository;
import app.repository.RealEstateRepositoryMap;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service
@PropertySource("classpath:application.properties")
public class RealEstateServiceImp implements IRealEstateService{

    private IRealEstateRepository repository;
    private String numberPrefix;
    public RealEstateServiceImp(IRealEstateRepository repository, @Value("${number.prefix}") String numberPrefix) {
        this.repository = repository;
        this.numberPrefix = numberPrefix;

    }

    @Override
    public RealEstate getById(long id) {
        RealEstate realEstate = repository.getById(id);
        setNumber(realEstate);
        return realEstate;
    }

    private void setNumber(RealEstate realEstate) {

        String number = String.format("%s-%s-%d", numberPrefix, realEstate.getTitle().charAt(0), realEstate.getId());
        realEstate.setNumber(number);
    }
}
