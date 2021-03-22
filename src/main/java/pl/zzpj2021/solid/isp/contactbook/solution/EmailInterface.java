package pl.zzpj2021.solid.isp.contactbook.solution;

import java.util.Map;

public interface EmailInterface {

    public void sendEmail(Contact emailable, String subject, String body);

}
