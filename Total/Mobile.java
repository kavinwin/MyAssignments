package Total;

public class Mobile {

	public void SendMessages() {
		System.out.println("In chat");
	}
	public void ShareDocument() {
		System.out.println("In pdf");
	}
	public void call() {
		System.out.println("In voice ");
	}
	public static void main(String[] args) {
		Mobile m = new Mobile();
		m.SendMessages();
		m.ShareDocument();
		m.call();
		
	}
}
