package Seminar2.data;

import java.util.List;

public abstract class User {
    
    private String fio;
    private int birthdate;
    private int passport;

    public User(String fio, int birthdate, int passport){
        this.fio = fio;
        this.birthdate = birthdate;
        this.passport = passport;
    }
    
    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(int birthdate) {
        this.birthdate = birthdate;
    }

    public int getPassport() {
        return passport;
    }

    public void setPassport(int passport) {
        this.passport = passport;
    }

    public void findTheBest(List<User> userList){    
    }
}
