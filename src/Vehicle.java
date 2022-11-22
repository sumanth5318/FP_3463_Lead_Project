public class Vehicle {
    String make;
    String plate;
    String color;
    String category;
    public Vehicle(String make,String plate,String color,String category){
        this.make = make;
        this.plate = plate;
        this.color = color;
        this.category = category;
    }
    //@Override
  /*  public String toString() {
        return  "make='" + make + '\'' +
                ", plate='" + plate + '\'' +
                ", color='" + color + '\'' +
                ", category='" + category + '\'';
    }*/

    public String getMake() {
        return make;
    }

    public String getPlate() {
        return plate;
    }

    public String getColor() {
        return color;
    }

    public String getCategory() {
        return category;
    }

}
