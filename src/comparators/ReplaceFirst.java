package comparators;

public class ReplaceFirst
{
	private static final String SCHUNK_IMAGE_DOMAIN = "http://bqf2-qa\\.api\\.schunk\\.com/";


   public static void main(String args[]){


   	String imageUrl = "http://bqf2-qa.api.schunk.com/medias/IM0010050.png?context=bWFzdGVyfHJvb3R8Mzk0NTF8aW1hZ2UvcG5nfGhmOC9oYjgvODc5NjI4NTMwNDg2Mi5wbmd8ZTZkNjgwYWM4MmMwZTg1ZDlhN2NhZjMwYTYyZTQwMjE3ZGNjNTAxZDJkZDhlMTIwMDYzZTU3NzAyODc2NTlhOA&amp;attachment=true";


   	 System.out.println("IMG URL " + imageUrl);

   	imageUrl = imageUrl.replaceFirst(SCHUNK_IMAGE_DOMAIN, "/bqfimages/");

   	  System.out.println();
   	  System.out.println("IMG URL " + imageUrl);
   	  System.out.println();
   	  System.out.println();
   	  System.out.println();

      String Str = new String("Welcome to Tutorialspoint.com");

      System.out.print("Return Value :" );
      System.out.println(Str.replaceFirst("(.*)Tutorials(.*)",
                         "AMROOD" ));

      System.out.print("Return Value :" );
      System.out.println(Str.replaceFirst("Tutorials", "AMROOD" ));
   }
}