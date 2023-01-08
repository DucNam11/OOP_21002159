package abstractfactory.pseudocode;

public class ApplicationConfigurator {
    public static void main(String[] args) throws Exception {
        String configOS = "Mac";

        GUIFactory factory;
        if (configOS == "Windows") {
            factory = new WindowsFactory();
        } else if (configOS == "Mac") {
            factory = new MacFactory();
        } else {
            throw new Exception("Error! Unknown operating system.");
        }
        Application app = new Application(factory);
        app.createUI();
        app.paint();
    }
}
