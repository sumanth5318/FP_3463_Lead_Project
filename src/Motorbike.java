public class Motorbike extends Vehicle{
  boolean sidecar;
    public Motorbike(String make,String plate,String color,String category,boolean sidecar){
        super(make, plate, color, category);
        this.sidecar = sidecar;
    }

    @Override
    public String toString() {
        return "\n\t-make:" + make  + "\n\t-plate:" + plate + "\n\t-color:" + color + "\n\t-category:" + category+ "\n\t-sidecar:"+(sidecar?"has side car":"no side car");
    }

    public boolean isSidecar() {
        return sidecar;
    }

}
