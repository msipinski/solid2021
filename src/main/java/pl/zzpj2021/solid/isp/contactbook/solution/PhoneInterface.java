package pl.zzpj2021.solid.isp.contactbook.solution;

public interface PhoneInterface {

    public void makeCall(Contact dialable);

    public void sendMessage(String destinationPhoneNumber, String message);

}
