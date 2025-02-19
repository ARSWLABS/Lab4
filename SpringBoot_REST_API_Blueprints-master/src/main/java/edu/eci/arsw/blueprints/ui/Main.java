// filepath: /Users/juancancelado/Documents/GitHub/Lab4/SpringBoot_REST_API_Blueprints-master/src/main/java/edu/eci/arsw/blueprints/ui/Main.java
package edu.eci.arsw.blueprints.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import edu.eci.arsw.blueprints.config.AppConfig;
import edu.eci.arsw.blueprints.model.Blueprint;
import edu.eci.arsw.blueprints.model.Point;
import edu.eci.arsw.blueprints.services.BlueprintsServices;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        BlueprintsServices blueprintsServices = context.getBean(BlueprintsServices.class);

        Point[] pts1 = new Point[]{new Point(10, 10), new Point(20, 20)};
        Blueprint bp1 = new Blueprint("author1", "bp1", pts1);
        blueprintsServices.addNewBlueprint(bp1);

        Point[] pts2 = new Point[]{new Point(30, 30), new Point(40, 40)};
        Blueprint bp2 = new Blueprint("author1", "bp2", pts2);
        blueprintsServices.addNewBlueprint(bp2);

        try {
            System.out.println("Blueprints by author1:");
            for (Blueprint bp : blueprintsServices.getBlueprintsByAuthor("author1")) {
                System.out.println(bp);
            }

            Blueprint retrievedBp = blueprintsServices.getBlueprint("author1", "bp1");
            System.out.println("Retrieved blueprint: " + retrievedBp);
        } catch (Exception e) {
            e.printStackTrace();
        }

        ((AnnotationConfigApplicationContext) context).close();
    }
}