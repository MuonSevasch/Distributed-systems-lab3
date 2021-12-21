package ru.bmstu.lab3;



public class Airport implements Serializable {
    private final int id;
    private final String name;

    public Airport(int id, String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override

        return "Airport{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
