public class Motorbike extends Vehicle{
  boolean sidecar;
    public Motorbike(String make,String plate,String color,String category,boolean sidecar){
        super(make, plate, color, category);
        this.sidecar = sidecar;
    }

    @Override
    public String toString() {
        return "\n-make=" + make  + "\n-plate=" + plate + "\n-color=" + color + "\n-category=" + category+ "\n-sidecar:"+(sidecar?"has side car":"no side car");
    }

    public boolean isSidecar() {
        return sidecar;
    }

}
