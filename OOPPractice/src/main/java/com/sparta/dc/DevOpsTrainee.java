package com.sparta.dc;

public class DevOpsTrainee extends Trainee implements Trainable {
    private String experience;
    private String certifications;
    private String projects;

    public DevOpsTrainee(String name, int age, String email, String phone) {
        super(name, age, email, phone);
    }

    public DevOpsTrainee(String name, int age, String email, String phone, String experience, String certifications, String projects) {
        super(name, age, email, phone);
        this.experience = experience;
        this.certifications = certifications;
        this.projects = projects;
    }

    @Override
    public void train() {
        System.out.println("Alex and Manish are teaching " + getName() + " DevOps.");
    }

    @Override
    public void study() {
        System.out.println("I, " + getName() + ", am studying.");
    }

    //Getters & Setters
    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getCertifications() {
        return certifications;
    }

    public void setCertifications(String certifications) {
        this.certifications = certifications;
    }

    public String getProjects() {
        return projects;
    }

    public void setProjects(String projects) {
        this.projects = projects;
    }
}
