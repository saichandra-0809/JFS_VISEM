package com.skillnext1;

class student{
    private int id;
    private String name;
    private String email;
    public void setId(int id) {
        this.id = id;
    }
    public student()
    {

    }
    public student(String name, String email, String dept) {
        this.name = name;
        this.email = email;
        this.dept = dept;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    private String dept;
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getDept() {
        return dept;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("student{");
        sb.append("id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", email=").append(email);
        sb.append(", dept=").append(dept);
        sb.append('}');
        return sb.toString();
    }

}