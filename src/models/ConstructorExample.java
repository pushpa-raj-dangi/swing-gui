package models;

public class ConstructorExample {
    
    private int id;
    private String name;

    public ConstructorExample(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public ConstructorExample(int id) {
        this(id, null);
    }


    public String getName() {
        return name;
    }

{
    this.id  = 10000;
}

    public void setName(String name) {
        this.name = name;
    }



    public int getId() {
        return id;
    }
}
