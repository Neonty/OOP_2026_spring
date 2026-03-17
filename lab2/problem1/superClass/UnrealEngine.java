package superClass;
import java.util.Objects;

public class UnrealEngine extends Software {
    private boolean supportsNanite;

    public UnrealEngine(String version, boolean supportsNanite) {
        super("Unreal Engine", version, "Epic Games");

        this.supportsNanite = supportsNanite;
    }

    public boolean isSupportsNanite(){
        return supportsNanite;
    }

    @Override
    public boolean equals(Object o){
        if (this == o)
            return true;

        if (!(o instanceof UnrealEngine) || o==null)
            return false;

        if (!super.equals(o))
            return false;

        UnrealEngine ue = (UnrealEngine)o;
        return supportsNanite == ue.supportsNanite;
    }

    @Override
    public int hashCode(){
        return Objects.hash(super.hashCode(), supportsNanite);
    }

    @Override
    public String toString(){
        return super.toString() + ", Nanite Support: " + supportsNanite;
    }
}