package Seminar2.data;

import Seminar2.service.DataService;

public class Student extends User {

    private int groupNumber;

    public Student(String fio, int birthdate, int passport, int groupNumber){
        super(fio, birthdate, passport);
        this.groupNumber = groupNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    


}
