public class Main {
    public static void main(String[] args) {
        //ClassCastException
        try{
            Object i = Integer.valueOf(42);
            String s = (String)i;
        }
        catch (ClassCastException e){
            System.out.println(e.getMessage());
        }
        Comedy comedy = new Comedy();
        //NullPointerException
        try{
            comedy = null;
            comedy.yourPage();
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        //NumberFormatException
        try{
            String s = "Books awesome";
            int i = Integer.valueOf((String )s);
        }
        catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
        //ArrayIndexOutOfBoundsException
        try {
            int [] mas = new int[] {1,2,3,4,5,6,7,8};
            System.out.println(mas[9]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}