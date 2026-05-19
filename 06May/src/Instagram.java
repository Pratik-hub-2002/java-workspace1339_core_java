public class Instagram {

	String username = "pratik_raut", full_name = "Pratik Raut", bio = "Cloud & Java Developer",
			location = "Chhatrapati Sambhajinagar", account_type = "Public";
	long mobile_no = 9370787194l;
	int followers = 5200, following = 890, posts = 145;
	char gender = 'M';

	public static void main(String[] args) {

		Instagram insta = new Instagram();

		System.out.println("========= Instagram Profile Info =========");

		System.out.println("\nEnter your username");
		System.out.println("My username is " + insta.username);

		System.out.println("\nEnter your full name");
		System.out.println("My full name is " + insta.full_name);

		System.out.println("\nEnter your bio");
		System.out.println("My bio is " + insta.bio);

		System.out.println("\nEnter your location");
		System.out.println("My location is " + insta.location);

		System.out.println("\nEnter your account type");
		System.out.println("My account type is " + insta.account_type);

		System.out.println("\nEnter your mobile number");
		System.out.println("My mobile number is " + insta.mobile_no);

		System.out.println("\nEnter your followers count");
		System.out.println("My followers count is " + insta.followers);

		System.out.println("\nEnter your following count");
		System.out.println("My following count is " + insta.following);

		System.out.println("\nEnter your total posts");
		System.out.println("My total posts are " + insta.posts);

		System.out.println("\nEnter your gender");
		System.out.println("My gender is " + insta.gender);
		
		
		
		
	}

}