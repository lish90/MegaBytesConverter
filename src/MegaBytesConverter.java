public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        if(kiloBytes <0){
            System.out.println("Invalid Value");
        } else {
            int megabytes = kiloBytes / 1024;
            int remainingKilobytes = kiloBytes % 1024;
            System.out.println( kiloBytes + " KB = "+ megabytes + " MB and "+ remainingKilobytes+" KB");
        }
    }
}



/*
public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes (int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        }
        else {
            int megaBytes = kiloBytes / 1024;
            int kiloBytesLeft = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + kiloBytesLeft + " KB");
        }
    }
}
*/