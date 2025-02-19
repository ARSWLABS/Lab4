package edu.eci.arsw.blueprints.persistence.impl;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Repository;

import edu.eci.arsw.blueprints.model.Blueprint;
import edu.eci.arsw.blueprints.model.Point;
import edu.eci.arsw.blueprints.persistence.BlueprintNotFoundException;
import edu.eci.arsw.blueprints.persistence.BlueprintPersistenceException;
import edu.eci.arsw.blueprints.persistence.BlueprintsPersistence;

@Repository
public class InMemoryBlueprintPersistence implements BlueprintsPersistence {

    private final Map<Tuple<String, String>, Blueprint> blueprints = new HashMap<>();

    public InMemoryBlueprintPersistence() {
        // load stub data
        Point[] pts = new Point[]{new Point(140, 140), new Point(115, 115)};
        Blueprint bp = new Blueprint("_authorname_", "_bpname_", pts);
        blueprints.put(new Tuple<>(bp.getAuthor(), bp.getName()), bp);
    }

    @Override
    public void saveBlueprint(Blueprint bp) throws BlueprintPersistenceException {
        if (blueprints.containsKey(new Tuple<>(bp.getAuthor(), bp.getName()))) {
            throw new BlueprintPersistenceException("The given blueprint already exists: " + bp);
        } else {
            blueprints.put(new Tuple<>(bp.getAuthor(), bp.getName()), bp);
        }
    }

    @Override
    public Set<Blueprint> getBlueprintsByAuthor(String author) throws BlueprintNotFoundException {
        Set<Blueprint> result = new HashSet<>();
        for (Tuple<String, String> key : blueprints.keySet()) {
            if (key.getElem1().equals(author)) {
                result.add(blueprints.get(key));
            }
        }
        if (result.isEmpty()) {
            throw new BlueprintNotFoundException("Author not found: " + author);
        }
        return result;
    }

    @Override
    public Blueprint getBlueprint(String author, String name) throws BlueprintNotFoundException {
        Blueprint bp = blueprints.get(new Tuple<>(author, name));
        if (bp == null) {
            throw new BlueprintNotFoundException("Blueprint not found: " + name);
        }
        return bp;
    }
}