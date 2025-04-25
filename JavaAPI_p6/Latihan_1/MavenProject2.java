public class MavenProject2 {
    
    public static void main(String[] args) {
        BirthdayGUI gui = new BirthdayGUI();
        new BirthdayController(gui);
    }

    @Override
    public String toString() {
        return "MavenProject2 []";
    }
}