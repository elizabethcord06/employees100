package org.first;

public class Employees {
    /*name, empl_id, lastname, year_born, birthplace, salary, status*/
    int empl_id, year_born, salary;
    String name, lastname, birth_place, status;

    public int getEmpl_id() {
        return empl_id;
    }
    public void setEmpl_id(int empl_id) {
        this.empl_id = empl_id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getYear_born() {
        return year_born;
    }
    public void setYear_born(int year_born){
        this.year_born = year_born;
    }

    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getBirth_place(){
        return birth_place;
    }
    public void setBirth_place(String birth_place){
        this.birth_place = birth_place;
    }

    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status = status;
    }
}

class EmployeesMain{
    public static void main(String args[]) {

        Employees empl = new Employees();
        empl.setEmpl_id(101);
        empl.setName("Emma");
        empl.setLastname("Watson");
        empl.setSalary(15000);
        empl.setYear_born(1980);
        empl.setSalary(15000);
        empl.setBirth_place("Santo Domingo");
        empl.setStatus("Married");
        System.out.println(empl);
    }
}



























