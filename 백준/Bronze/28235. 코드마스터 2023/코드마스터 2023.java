import java.io.*;
class Main{
    public static void main(String[] a) throws IOException {
        String s = null;
        switch((new BufferedReader(new InputStreamReader(System.in))).readLine()) {
            case "SONGDO" : s = "HIGHSCHOOL"; break;
            case "CODE" : s = "MASTER"; break;
            case "ALGORITHM" : s = "CONTEST"; break;
            default : s = "0611"; break;
        }
        System.out.print(s);
    }
}