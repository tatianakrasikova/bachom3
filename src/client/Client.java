package client;

import app.controler.RealEstateController;
import app.model.RealEstate;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Client {
    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext("app");

        RealEstateController controller = context.getBean(RealEstateController.class);

        RealEstate realestate = controller.getById(2);

        System.out.println(realestate);



    }
}
