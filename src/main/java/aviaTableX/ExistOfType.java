package aviaTableX;


import model.Type;

/**
 * Created by Артём on 26.02.2016.
 */
//@Service("Exist")
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

    public Type getInner() {
        return inner;
    }

    public void setInner(Type inner) {
        this.inner = inner;
    }

    public Type getWorld() {
        return world;
    }

    public void setWorld(Type world) {
        this.world = world;
    }

    public Type getWorldFlight() {
        return world;
    }
}
