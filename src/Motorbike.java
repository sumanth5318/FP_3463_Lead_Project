public class Motorbike extends Vehicle{
  boolean sidecar;
    public Motorbike(String make,String plate,String color,String category,boolean sidecar){
        super(make, plate, color, category);
        this.sidecar = sidecar;
    }

    @Override
    public String toString() {
        return "\nEmployee has a motorbike\n"+super.toString() +"\n\t-sidecar:"+(sidecar?"has side car":"no side car");
    }

    public boolean isSidecar() {
        return sidecar;
    }

}
