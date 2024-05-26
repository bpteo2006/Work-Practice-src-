public class StudentMain2 {
    public static void main(String[] args) {
        Student2 student = new Student2();
        student.setName("Bob");
        student.setDateOfBirth("13/4/1965");
        student.setHasStudentHousing(true);
        student.setCourse(new Course());

        student.getCourse().setTitle("Introduction to Macro Economics");
        student.getCourse().setLevel("Intermediate");
        student.getCourse().setStartDate("1/6/2024");

        System.out.println("Student " + student.getName()+
                " born on " + student.getDateOfBirth()+
                (student.hasStudentHousing()? " has " : " does not have ")+"student housing.");

        System.out.println("Course: " + student.getCourse().getTitle() +
                ", " + student.getCourse().getLevel() + " level" +
                ", is due to start on " + student.getCourse().getStartDate());

    }
}
