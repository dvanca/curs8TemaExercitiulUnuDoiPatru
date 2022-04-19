package ro.fasttrackit.tema.lab8;

public class Student {
    private int grade;
    private String name;
    static int sumOfGrade =0;
    static int numberOfStudents=0;

    Student(String name, int grade){
        this.name=name;
        this.grade=grade;
        sumOfGrade=sumOfGrade+grade;
        numberOfStudents+=1;
    }

    static void averageGrade(){
        System.out.println(""+ sumOfGrade/numberOfStudents);
    }
}
