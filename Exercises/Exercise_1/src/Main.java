import java.util.Arrays;

class Student{

    public double[] getAllStudentScores() {
        return allStudentScores;
    }

    double[] allStudentScores = new double[20] ;

}


class Full_time extends Student{
    double exam_score1=0;
    double exam_score2=0;
    String name;
    double[] fullTimeScores = new double[15]; //for average of quiz scores


    @Override
    public double[] getAllStudentScores() {
        return fullTimeScores;
    }
    public double[] getFullTimeScores() {
        return fullTimeScores;
    }

    public void setFullTimeScores(double[] fullTimeScores) {
        this.fullTimeScores = fullTimeScores.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getExam_score1() {
        return exam_score1;
    }

    public void setExam_score1(double exam_score1) {
        this.exam_score1 = exam_score1;
    }

    public double getExam_score2() {
        return exam_score2;
    }
    public void setExam_score2(double exam_score2) {
        this.exam_score2 = exam_score2;
    }

    void fullTimeStudentInfo(){

        System.out.println("Full-time class student");
    }
}

class Part_time extends Student{
    double exam_score1=0;
    String name;

    double[] partTimeScores = new double[5]; //  to hold some are part-time in a session


    @Override
    public double[] getAllStudentScores() {
        return partTimeScores;
    }

    public double[] getPartTimeScores() {

        return partTimeScores;
    }

    public void setPartTimeScores(double[] partTimeScores) {

        this.partTimeScores = partTimeScores.clone();
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getExam_score1() {
        return exam_score1;
    }

    public void setExam_score1(double exam_score1) {
        this.exam_score1 = exam_score1;
    }


}

class Session{
    Student[] students = new Student[20];

    public void populateStudents(Student []studentsInput) {

        for (int i=0 ; i< studentsInput.length; i++) {
            students[i] = studentsInput[i];
        }

        // students[s1, s2, s3...]
    }

    public double calculateAverageScores(double all_students_scores[]){

        double sum = 0;
        double average = 0;

        for(int i=0; i< all_students_scores.length; i++){
            System.out.println(all_students_scores[i]);

        }

        for(int i=0; i< all_students_scores.length; i++){
            sum = all_students_scores[i] + sum;
        }

        average = sum / all_students_scores.length;

        System.out.println("Average quiz scores for ith score: "+average);

        return average;
    }

    public void ascendingQuizScores(double ascending_quiz_Scores_list[]){

        Arrays.sort(ascending_quiz_Scores_list);
        System.out.println("Quiz score in Ascending order");
        for (int i = 0; i<ascending_quiz_Scores_list.length; i++)
        {
            System.out.println(ascending_quiz_Scores_list[i]);
        }

    }

    //for printing part-time students names
    public void printPartTimeStudentNames(String partTimeStudentsNames[])
    {
        for(int i =0; i<partTimeStudentsNames.length;i++){
            System.out.println(partTimeStudentsNames[i]);
        }

    }


}

public class Main {
    public static void main(String[] args) {

        Full_time name1 = new Full_time();
        name1.setName("Gauri");

        Full_time name2 = new Full_time();
        name2.setName("Anita");

        Full_time name4 = new Full_time();
        name4.setName("Shambhavi");

        Full_time name5 = new Full_time();
        name5.setName("Nadiya");

        Full_time name6 = new Full_time();
        name6.setName("Aishwarya");

        Full_time name7 = new Full_time();
        name7.setName("Divya");

        Full_time name8 = new Full_time();
        name8.setName("Shrusti");

        Full_time name9 = new Full_time();
        name9.setName("Ashish");

        Full_time name10 = new Full_time();
        name10.setName("Noah");

        Part_time pname1 = new Part_time();
        pname1.setName("John");

        Part_time pname2 = new Part_time();
        pname2.setName("Chris");

        Part_time pname3 = new Part_time();
        pname3.setName("Hemsworth");

        Part_time pname4 = new Part_time();
        pname4.setName("Clarie");

        Part_time pname5 = new Part_time();
        pname5.setName("Johnathan");

        Part_time pname6 = new Part_time();
        pname6.setName("Pewdie");

        Part_time pname7 = new Part_time();
        pname7.setName("Mikey");

        Part_time pname8 = new Part_time();
        pname8.setName("Max");

        Part_time pname9 = new Part_time();
        pname9.setName("Julia");

        Part_time pname10 = new Part_time();
        pname10.setName("Robert");

        //full-time students scores
        Full_time f1 = new Full_time();
        f1.setExam_score1(90);

        Full_time f2 = new Full_time();
        f2.setExam_score1(92);

        Full_time f3 = new Full_time();
        f3.setExam_score1(99);

        Full_time f4 = new Full_time();
        f4.setExam_score1(88);

        Full_time f5 = new Full_time();
        f5.setExam_score1(77);

        Full_time f6 = new Full_time();
        f6.setExam_score1(91);

        Full_time f7 = new Full_time();
        f7.setExam_score1(80);

        Full_time f8 = new Full_time();
        f8.setExam_score1(79);

        Full_time f9 = new Full_time();
        f9.setExam_score1(95);

        Full_time f10 = new Full_time();
        f10.setExam_score1(97);

        Part_time p1 = new Part_time();
        p1.setExam_score1(68);

        Part_time p2 = new Part_time();
        p2.setExam_score1(89);

        Part_time p3 = new Part_time();
        p3.setExam_score1(93);

        Part_time p4 = new Part_time();
        p4.setExam_score1(98);

        Part_time p5 = new Part_time();
        p5.setExam_score1(59);

        Part_time p6 = new Part_time();
        p6.setExam_score1(80);

        Part_time p7 = new Part_time();
        p7.setExam_score1(96);

        Part_time p8 = new Part_time();
        p8.setExam_score1(97);

        Part_time p9 = new Part_time();
        p9.setExam_score1(83);

        Part_time p10 = new Part_time();
        p10.setExam_score1(84);

        String[] partTimeNames = {String.valueOf(pname1), String.valueOf(pname2), String.valueOf(pname3),
                String.valueOf(pname4), String.valueOf(pname5),String.valueOf(pname6),String.valueOf(pname7),
                String.valueOf(pname8),String.valueOf(pname9),String.valueOf(pname10)};//

        double[] full_time_student1_scores = {70, 90, 91, 88, 66, 92, 81, 56, 90, 92, 88, 78, 93, 99, 80};
        double[] full_time_student2_scores = {80, 90, 91, 88, 96, 91, 80, 66, 90, 82, 88, 68, 83, 69, 90};
        double[] full_time_student3_scores = {50.5, 98, 96, 78, 66, 90, 83, 96, 90, 72, 98, 88, 73, 79, 70};
        double[] full_time_student4_scores = {89, 97, 94, 68, 76, 94.7, 84, 96, 90, 92, 98, 78, 63, 89, 60};
        double[] full_time_student5_scores = {78, 96, 95, 58, 86.4, 98, 89, 86, 80, 92, 78, 98, 93, 99, 50};
        double[] full_time_student6_scores = {66, 78, 89, 90, 45, 67, 88, 98, 90, 76, 56, 78, 98, 90, 99};

        double[] part_time_student7_scores = {90, 99, 92, 93, 94, 80, 88, 90, 87.6, 67, 90, 93, 92, 91, 88};
        double[] part_time_student8_scores = {89, 88, 87, 56, 76, 67.4, 87, 80, 67, 86, 54, 70, 50, 89, 90};
        double[] part_time_student9_scores = {80, 89, 60, 70, 50, 78, 79, 90, 91.3, 92, 93, 90, 67, 77, 78};
        double[] part_time_student10_scores = {90, 78, 77, 79, 90, 98, 97, 94, 95, 97, 99.9, 78, 60, 66, 92};

        Full_time full_time_stud1 = new Full_time();
        full_time_stud1.setFullTimeScores(full_time_student1_scores);

        Full_time full_time_stud2 = new Full_time();
        full_time_stud2.setFullTimeScores(full_time_student2_scores);

        Full_time full_time_stud3 = new Full_time();
        full_time_stud3.setFullTimeScores(full_time_student3_scores);

        Full_time full_time_stud4 = new Full_time();
        full_time_stud4.setFullTimeScores(full_time_student4_scores);

        Full_time full_time_stud5 = new Full_time();
        full_time_stud5.setFullTimeScores(full_time_student5_scores);

        Full_time full_time_stud6 = new Full_time();
        full_time_stud6.setFullTimeScores(full_time_student6_scores);

        Part_time part_time_stud7 = new Part_time();
        part_time_stud7.setPartTimeScores(part_time_student7_scores);

        Part_time part_time_stud8 = new Part_time();
        part_time_stud8.setPartTimeScores(part_time_student8_scores);

        Part_time part_time_stud9 = new Part_time();
        part_time_stud9.setPartTimeScores(part_time_student9_scores);

        Part_time part_time_stud10 = new Part_time();
        part_time_stud10.setPartTimeScores(part_time_student10_scores);

        Student[] full_part_time_students = {full_time_stud1, full_time_stud2, full_time_stud3, full_time_stud4,
                full_time_stud5, full_time_stud6, part_time_stud7, part_time_stud8, part_time_stud9, part_time_stud10};

        //For part-time students name

        Part_time[] part_time_students_names = {pname1, pname2, pname3, pname4, pname5, pname6, pname7, pname8, pname9, pname10};

        System.out.println("Part-time students name are as follows:");
        for (int i = 0; i < part_time_students_names.length; i++) {
            System.out.println(part_time_students_names[i].getName());
        }

        Session studentSessionObject = new Session();
        studentSessionObject.populateStudents(full_part_time_students);

        //for average scores
        Student allStudentsScoresObj = new Student();
        allStudentsScoresObj.getAllStudentScores();

        double[] allStudentsAverageScoresObjList = new double[20];
        for (int i = 0; i < full_part_time_students.length; i++) {
            allStudentsAverageScoresObjList[i] =
                    studentSessionObject.calculateAverageScores(full_part_time_students[i].getAllStudentScores());
        }

        //for printing scores in ascending order

        System.out.println("Ascending order scores are as follows: ");
        for(int i=0; i < full_part_time_students.length ;i++){
            studentSessionObject.ascendingQuizScores(full_part_time_students[i].getAllStudentScores());
        }

        //full -time students scores
        Full_time[] full_time_students_scores = {f1, f2, f3, f4, f5, f6, f7, f8, f9, f10};

        for (int j = 0; j < full_time_students_scores.length; j++) {

            Full_time f = full_time_students_scores[j];
            System.out.println("Scores of full time student " + j  + " as follows : ");
                System.out.println(f.getExam_score1());
        }
        

    }
}
