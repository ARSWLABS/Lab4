
package edu.eci.arsw.blueprints.ui;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.eci.arsw.blueprints.services.BlueprintsServices;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BlueprintsServices blueprintsServices = context.getBean(BlueprintsServices.class);
    }
}
