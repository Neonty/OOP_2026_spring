package superClass;
import java.util.Objects;


public class Software {
    private String name;
    private String version;
    private String vendor;

    public Software(String name, String version, String vendor){
        if (name == null || name.isBlank()){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        
        if (version == null || version.isBlank()){
            throw new IllegalArgumentException("Version cannot be empty");
        }

        if (vendor == null || vendor.isBlank()){
            throw new IllegalArgumentException("Vendor cannot be empty");
        }

        this.name = name;
        this.version = version;
        this.vendor = vendor;
    }

    public String getName(){
        return name;
    }

    public String getVersion(){
        return version;
    }

    public String getVendor(){
        return vendor;
    }

    @Override
    public boolean equals(Object o){
        if (this == o)
            return true;

        if (!(o instanceof Software) || o == null)
            return false;

        Software software = (Software)o;

        return name.equals(software.name) && version.equals(software.version) && vendor.equals(software.vendor);
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, version, vendor);
    }

    @Override
    public String toString(){
        return "Software: " + name + ", Version: " + version + ", Vendor: " + vendor;
    }
}