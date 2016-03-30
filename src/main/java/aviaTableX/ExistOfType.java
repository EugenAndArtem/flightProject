package aviaTableX;

import org.springframework.stereotype.Service;

/**
 * Created by Артём on 26.02.2016.
 */
@Service("Exist")
public class ExistOfType {
    private Type inner;
    private Type world;

    public ExistOfType() {
        inner = new Type(0);
        world = new Type(1);
    }

    public Type getInnerFlight() {
        return inner;
    }

    public Type getWorldFlight() {
        return world;
    }
}
