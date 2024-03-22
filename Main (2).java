import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Store store = new Store();
    store.addMovie("123456789012", "The Matrix");
    store.addMovie("098765432109", "Trailer Park Boys: The Movie");
    store.addMovie("234567890123", "A Trailer Park Boys Christmas");
    store.addMovie("374651098476", "The Big Lebowski");
    store.addMovie("184818481848", "Jeremiah Johnson");
    store.addMovie("197819781978", "Deer Hunter");
    store.addMovie("123412341234", "Nacho Libre");
    store.addCustomer("Joe", "Hilditch", "2892012024");
    
    
    while (true){
      
      System.out.println("Welcome! What do you want to do today?");
      String input = scan.nextLine();
      if (input.equalsIgnoreCase("Rent movie")){
        System.out.println("What's your phone number?");
        String phoneNumRent = scan.nextLine();
        System.out.println("What's the barcode of the movie you're renting?");
        String barcodeRent = scan.nextLine();
        store.rentmovie(phoneNumRent, barcodeRent);
      }
      else if (input.equalsIgnoreCase("Add customer")){
        System.out.println("First name: ");
        String fname = scan.nextLine();
        System.out.println("Last name: ");
        String lname = scan.nextLine();
        System.out.println("Phone number: ");
        String phoneNum = scan.nextLine();
        store.addCustomer(fname, lname, phoneNum);
        
      }
      else if (input.equalsIgnoreCase("Return movie")){
        System.out.println("What's your phone number?");
        String phoneNumReturn = scan.nextLine();
        System.out.println("What's the barcode of the movie you're returning?");
        String barcodeReturn = scan.nextLine();
        store.returnmovie(phoneNumReturn, barcodeReturn);
      }
      else if (input.equalsIgnoreCase("Find who rented a movie")){
        System.out.println("What's the title of the movie?");
        String title = scan.nextLine();
        store.check(title);
      }
      else if(input.equalsIgnoreCase("Movie Selection")){
        store.Movies();
      }
      else if(input.equalsIgnoreCase("Add Movie")){
        System.out.println("What is the movie's barcode?");
        String barcode = scan.nextLine();
        System.out.println("What is the movie's title?");
        String title = scan.nextLine();
        store.addMovie(barcode, title);
      }

      else {
        System.out.println("Alright get out of here then");
        break;
      }
    }
    
  }
}