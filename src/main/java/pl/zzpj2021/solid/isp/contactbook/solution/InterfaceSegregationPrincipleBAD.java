package pl.zzpj2021.solid.isp.contactbook.solution;

class InterfaceSegregationPrincipleBAD {
	
	Emailer emailer;
	Dialler dialler;
	
	public InterfaceSegregationPrincipleBAD() {
		emailer = new Emailer();
		dialler = new Dialler();
	}
	
	public static void main(String[] args) {
		
		InterfaceSegregationPrincipleBAD interfaceSegregationPrinciple = new InterfaceSegregationPrincipleBAD();
		interfaceSegregationPrinciple.contactPeople();
		
	}
	
	public void contactPeople() {
		
		Contact contact = new Contact("Jan Kowalski", "Kielce", "jan.kowalski@gmail.com", "83744-23434");
		emailer.sendEmail(contact, "promocja", "tanio dzisiaj!");
		dialler.makeCall(contact);
	}
	

}
