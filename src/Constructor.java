public class Constructor {


    String type = Type.BED.type;
    String name;
    String color;


    Constructor(Type type, String name, String color) {
        this.name = name;
        this.color = color;
    }


    @Override
    public String toString() {
        return "type = " + type +
                " name= " + name +
                " color= " + color;
    }
}
