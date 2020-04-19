package emailapp;

public class EmailApp {

    public static void main(String[] args) {
        Email firstMail = new Email("Mohamed", "Yunus");
        System.out.println(firstMail.showInfo());
//        firstMail.setAlternateEmail("fortesting@gmail.com");
//        System.out.println(firstMail.getAlternateEmail());

    }
}
