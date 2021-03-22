package pl.zzpj2021.solid.isp.contactbook.solution;

class Emailer implements EmailInterface {


    @Override
    public void sendEmail(Contact emailable, String subject, String body) {
        System.out.println("Email subject: " + subject + "\nEmail message: " + body + "\nTo: "
                + emailable.getEmailAddress());
    }
}