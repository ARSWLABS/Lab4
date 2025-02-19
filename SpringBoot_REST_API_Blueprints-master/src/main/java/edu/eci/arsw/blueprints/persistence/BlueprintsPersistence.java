
package edu.eci.arsw.blueprints.persistence;



import java.util.Set;

import edu.eci.arsw.blueprints.model.Blueprint;



public interface BlueprintsPersistence {



    void saveBlueprint(Blueprint bp) throws BlueprintPersistenceException;



    Blueprint getBlueprint(String author, String name) throws BlueprintNotFoundException;



    Set<Blueprint> getBlueprintsByAuthor(String author) throws BlueprintNotFoundException;

}
