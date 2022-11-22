public class Contract {
    int nbChildren;
    boolean married = true;
    int bonusPerChildPerMonth = 0;
    int accumulatedDays = 0;
    double monthlySalary = 0;
    double hourlySalary = 0;
    int accumulatedHours= 0;
    String type = "";

    public double accumulatedSalary(){

        if(type == "permanent") {
            double salary ;

            if(this.married == true){
                salary =  (this.monthlySalary + (double)(bonusPerChildPerMonth *(double)nbChildren))/20;
            }else {
                salary = this.monthlySalary;
            }
            return (salary * (double) (accumulatedDays));
        }
        else if(type == "temporary"){
            return (hourlySalary * (double) (accumulatedHours));
        }else {
            return 0;
        }
    }
}
