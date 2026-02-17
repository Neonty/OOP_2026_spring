package Practice3;

public class Person {
    private String name;
    private String address;

    public Person(String _name, String _address){
        if (_name == null || _name.isBlank()){
            throw new IllegalArgumentException("Name cannot be empty");
        }

        if (_address == null || _address.isBlank()){
            throw new IllegalArgumentException("Address cannot be empty");
        }
        
        this.name = _name;
        this.address = _address;
    }

    public String getName(){
        return this.name;
    }

    public String getAddress(){
        return this.address;
    }

    public void setAddress(String _address){
        if (_address == null || _address.isBlank()){
            throw new IllegalArgumentException("Address cannot be empty");
        }

        this.address = _address;
    }

    @Override
    public String toString(){
        return "Person[name=" + this.name + ",address=" + this.address + "]";
    }
}
