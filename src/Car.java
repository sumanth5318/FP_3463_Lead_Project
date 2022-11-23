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
        return   "\n\t-make:" + make  + "\n\t-plate:" + plate + "\n\t-color:" + color + "\n\t-category:" + category + "\n\t-gear:"
                + gear +"\n\t-type:"+type;
    }

    public String getGear() {
        return gear;
    }

    public String getType() {
        return type;
    }

}
