package Ekim29Exceptons;

public class CustomException {
    public static void main(String[] args) {
         int grade = 101;
        studentGrade(grade);
    }
    public static void studentGrade(int grade ){

       if (grade<0||grade>100){

          try {
              throw new InvalidStudentGradeException("not bu değerleri alamaz");

          }catch (InvalidStudentGradeException e ){
             e.getMessage();
             e.printStackTrace();
          }



       }else {
           System.out.println(grade);
       }




    }



}
