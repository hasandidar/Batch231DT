package d8;

public class StringManipulations05 {
    public static void main(String[] args) {
        //Ornek 3: Bir String'in belirli bir karakterinden baslayarak belirli bir karaktere kadar
        // tum karakterleri dynamic olarak aliniz. abc@gmail.com ===> gmail

        //1.yol: hard code, tavsiye edilmez
        String a = "abc@gmail.com";
        //System.out.println(a.substring(4, 9)); //gmail

        //2.yol: Dinamik
        String b="abc@gmail.com";
        System.out.println(b.substring(4,9));
        String c=a.split("@")[1].split("\\.")[0];
        //System.out.println(c);
        int baş=a.indexOf("@")+1;
        int bit=a.indexOf(".");
        String ŞİRKET=a.substring(baş+bit);
        System.out.println(ŞİRKET);


    }
}
