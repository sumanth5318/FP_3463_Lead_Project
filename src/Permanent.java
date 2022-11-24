public class Permanent extends Contract{
    private int nbChildren;
    private boolean married = true;
    private int bonusPerChildPerMonth = 0;
    private int accumulatedDays = 0;
    private double monthlySalary = 0;
    private double accumulatedsalary;
    public Permanent(int nbChildren,boolean married,double monthlySalary,int bonusPerChildPerMonth,int accumulatedDays){
        this.nbChildren = nbChildren;
        this.married = married;
        this.bonusPerChildPerMonth = bonusPerChildPerMonth;
        this.accumulatedDays = accumulatedDays;
        this.monthlySalary = monthlySalary;
    }

    public int getNbChildren() {
        return nbChildren;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public int getAccumulatedDays() {
        return accumulatedDays;
    }

    public int getBonusPerChildPerMonth() {
        return bonusPerChildPerMonth;
    }

    public boolean isMarried() {
        return married;
    }

    public double getAccumulatedsalary() {
        return accumulatedsalary;
    }

    public void setAccumulatedsalary(double accumulatedsalary) {
        this.accumulatedsalary = accumulatedsalary;
    }
    @Override
    public String toString() {
        return "he is"+ (isMarried()?" married":" not married") +" and he/she has " +getNbChildren()+
                " children. He/She has worked for "+ getAccumulatedDays()+
                " days and upon contract his/her monthly salary is "+ getMonthlySalary();
    }
    public double accumulatedsalary(){
        accumulatedsalary = getAccumulatedDays()*(getMonthlySalary()*getBonusPerChildPerMonth()*getNbChildren())*12;
        return accumulatedsalary;
    }



}
