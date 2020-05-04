package cn.itcast.travel.dao;

import org.junit.Test;

public class xiashuyu {
    private int grade;
    private String course;
    /*public xiashuyu(){}
    public xiashuyu(int grade, String course){
        this.grade = grade;
        this.course = course;
    }*/


    public String result(String name) {
        return name + "{" +
                "grade=" + grade +
                ", course='" + course + '\'' +
                '}';
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }


    @Test
    public void ss(){
        int i = 0;
        for(;i < 100; i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args){
        int gradeOne = 100;
        String courseOne = "computer science";
        /*xiashuyu xsy = new xiashuyu(gradeOne, courseOne);
        System.out.println(xsy.getGrade());
        System.out.println(xsy.getCourse());
        System.out.println(xsy.result("xsy"));*/
        xiashuyu sy = new xiashuyu();
        sy.setCourse("finance and taxation");
        sy.setGrade(100);
        System.out.println(sy.result("sy"));

    }

}
