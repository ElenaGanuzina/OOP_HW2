package Seminar2.data;

public class Teacher {
    
    private int department;

    public Teacher(String fio, int birthdate, int passport, int department){
        super();
        this.department = department;
    }
    
    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }  
}
