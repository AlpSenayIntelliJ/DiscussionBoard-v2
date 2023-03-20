import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NewsFeed nf = new NewsFeed();
        Scanner s = new Scanner(System.in);
        System.out.print("Msg Test 1: ");
        String unameAndMesg = s.nextLine();
        int dashIndex = unameAndMesg.indexOf("-");
        String uname = unameAndMesg.substring(0,dashIndex);
        String msg = unameAndMesg.substring(dashIndex+1);
        Post mp1 = new MessagePost(uname, msg);
        nf.addPost(mp1);

        System.out.print("Msg Test 2: ");
        unameAndMesg = s.nextLine();
        dashIndex = unameAndMesg.indexOf("-");
        uname = unameAndMesg.substring(0,dashIndex);
        msg = unameAndMesg.substring(dashIndex+1);
        Post mp2 = new MessagePost(uname, msg);
        nf.addPost(mp2);

        System.out.print("Photo Test1 1: ");
        String unamePhotoCaption = s.nextLine();
        int dashIndex1 = unamePhotoCaption.indexOf("-");
        int dashIndex2 = unamePhotoCaption.indexOf("-",dashIndex1+1);
        uname = unamePhotoCaption.substring(0,dashIndex1);
        String photoName = unamePhotoCaption.substring(dashIndex1+1, dashIndex2);
        String caption = unamePhotoCaption.substring(dashIndex2+1);
        Post pp = new PhotoPost(uname, photoName, caption);
        nf.addPost(pp);

        System.out.println("++ Test run of the three posts: ++");
        nf.show();




    }


}