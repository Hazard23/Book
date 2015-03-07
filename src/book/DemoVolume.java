package book;
import java.util.Scanner;

public class DemoVolume {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter Volume Name:");
        String volumeName1 = keyboard.nextLine();
        System.out.println("Enter Number of Books:");
        short numberOfBooks1 = Short.parseShort( keyboard.nextLine() );

        Book[] bookstr = new Book[numberOfBooks1];
        System.out.println("Please enter the Title, Author, and Number of pages for book:");
        for (int i = 0; i < numberOfBooks1; i++){
            System.out.println("Title:" );
            String title = keyboard.nextLine();
            System.out.println("Author:");
            String author = keyboard.nextLine();
            System.out.println("Number of Pages:");
            short numberOfPages = Short.parseShort( keyboard.nextLine() );

            bookstr[i] = new Book(title ,author ,(short)numberOfPages);

        }
        Volume volume1 = new Volume(volumeName1,(short) numberOfBooks1, bookstr);
        System.out.println(volume1);

    }
}