package book;
public class Volume {
    private  String volumeName;
    private  short numberOfBooks;
    private Book[] bookArray;

    

    public Volume(String volumeName, short numberOfBooks, Book[] bookArray) {
        this.volumeName = volumeName;
        this.numberOfBooks = numberOfBooks;
        this.bookArray = bookArray;
    }


    public String getBookArray() {
        String bookstr = "";
        for(int i = 0; i < bookArray.length; i++){
            bookstr += bookArray[i].toString();
        }
        return bookstr;
    }
      
    @Override
    public String toString() {
        return "Volume{" + "Volume Name= " + volumeName + ", Number Of Books= " + numberOfBooks + ", Book Array= " + getBookArray() + '}';
    }

  
    
}
