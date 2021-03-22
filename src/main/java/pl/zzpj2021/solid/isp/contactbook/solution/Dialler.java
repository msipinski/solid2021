package pl.zzpj2021.solid.isp.contactbook.solution;

class Dialler implements PhoneInterface {

    @Override
    public void makeCall(Contact dialable) {

        String telephone = dialable.getTelephone();
        System.out.println("Calling to " + telephone);
        // call using telephone
    }

    @Override
    public void sendMessage(String destinationPhoneNumber, String message) {
        System.out.println("Message: " + message + "\nTo: " + destinationPhoneNumber);
    }
}