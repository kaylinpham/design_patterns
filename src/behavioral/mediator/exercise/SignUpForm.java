package behavioral.mediator.exercise;

public class SignUpForm {
    private Input username = new Input();
    private Input password = new Input();
    private CheckBox agreement = new CheckBox();
    private Button signUpBtn = new Button();

    public SignUpForm() {
        username.addEventHandler(this::filledOutForm);
        password.addEventHandler(this::filledOutForm);
        agreement.addEventHandler(this::filledOutForm);
    }

    private void filledOutForm() {
        var isMissing = !agreement.isChecked() || username.getContent().isBlank() || password.getContent().isEmpty();
        signUpBtn.setEnabled(!isMissing);
    }

    public void test() {
        username.setContent("giangph");
        password.setContent("se150249");
        agreement.setChecked(!agreement.isChecked());
        agreement.setChecked(!agreement.isChecked());
        password.setContent("");
        System.out.println("Sign up button: " + signUpBtn.isEnabled());
    }
}
