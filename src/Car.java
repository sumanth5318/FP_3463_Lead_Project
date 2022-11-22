public class Car extends Vehicle{
    String gear;
    String type;
    public Car(String make,String plate,String color,String category,String gear,String type){
        super(make, plate, color, category);
        this.gear = gear;
        this.type = type;
    }

    @Override
    public String toString() {
        return   "\n-make=" + make  + "\n-plate=" + plate + "\n-color=" + color + "\n-category=" + category + "\n-gear="
                + gear +"\n-type="+type;
    }

    public String getGear() {
        return gear;
    }

    public String getType() {
        return type;
    }

}
