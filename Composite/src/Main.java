public class Main {
    public static void main(String[] args) {
        File resume = new File("resume.docx");
        File photo = new File("photo.png");

        Directory personal = new Directory("Personal");
        personal.add(resume);
        personal.add(photo);

        File project = new File("project.java");

        Directory work = new Directory("Work");
        work.add(project);
        work.add(personal);
        work.showDetails();

        System.out.println("\n--- After Removing photo.png ---");
        personal.remove(photo);
        work.showDetails();
    }
}
