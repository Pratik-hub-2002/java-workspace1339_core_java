package abstraction;

public class Google implements Gmail, GDrive, GMap {

	@Override
	public void sendMail(String to, String subject) {

		System.out.println("===== Gmail =====");
		System.out.println("Mail Sent Successfully");
		System.out.println("To : " + to);
		System.out.println("Subject : " + subject);

	}

	@Override
	public void uploadFile(String fileName) {

		System.out.println("\n===== Google Drive =====");
		System.out.println(fileName + " Uploaded Successfully");

	}

	@Override
	public void getDirection(String source, String destination) {

		System.out.println("\n===== Google Map =====");
		System.out.println("Route Found");
		System.out.println(source + " --> " + destination);

	}
}
