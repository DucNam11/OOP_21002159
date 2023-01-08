package factory.pseudocode;

public class WindowDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
