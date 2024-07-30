public class MVCPatternTest {
    public static void main(String[] args) {
        // Create the model
        Student model = new Student();
        model.setName("John ");
        model.setId("152");
        model.setGrade("A");

        // Create the view
        StudentView view = new StudentView();

        // Create the controller
        StudentController controller = new StudentController(model, view);

        // Display initial details
        controller.updateView();

        // Update model data
        controller.setStudentName("Jaya");
        controller.setStudentGrade("B+");

        // Display updated details
        controller.updateView();
    }
}
