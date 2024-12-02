package app.controler;

import app.model.RealEstate;
import app.service.IRealEstateService;
import org.springframework.stereotype.Component;

@Component
public class RealEstateController {
    private IRealEstateService service;

    public RealEstateController(IRealEstateService service) {
        this.service = service;
    }

    public RealEstate getById(long id) {
        return service.getById(id);
    }
}
