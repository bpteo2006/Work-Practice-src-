public class StudentMain {
    public static void main(String[] args) {

        Student student = new Student();
        student.setName("James Bond");
        student.setDateOfBirth("14/6/1962");
        student.setStudentHousing(true);
        //student.course = new Course();
        student.setCourse(new Course());

        //student.getCourse().setTitle("Computer Science");
        //student.getCourse().setLevel("Undergraduate");
        //student.getCourse().setStartDate("07/03/2021");

        Course c = student.getCourse();
        c.setTitle("Computer Science");
        c.setLevel("Undergraduate");
        c.setStartDate("07/03/2021");

        System.out.println("Name of student is "+student.getName());
        System.out.println("Date of Birth is "+student.getDateOfBirth());
        System.out.println("Housing "+(student.hasStudentHousing() ? "Yes":"No"));
        System.out.println("The student "+student.getName() + " is enrolled on the "+student.getCourse().getTitle()+" course due to start "+student.getCourse().getStartDate());

    }
}
