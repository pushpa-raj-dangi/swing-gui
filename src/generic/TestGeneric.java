package generic;

public class TestGeneric<T,R,V> {
    private T name;
    private R roll;
    private V address;
    
    public TestGeneric(T name, R roll, V address) {
        this.setName(name);
        this.setRoll(roll);
        this.setAddress(address);
    }

    public V getAddress() {
        return address;
    }

    public void setAddress(V address) {
        this.address = address;
    }

    public R getRoll() {
        return roll;
    }

    public void setRoll(R roll) {
        this.roll = roll;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }
    
    
}
