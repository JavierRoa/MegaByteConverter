public class MegaByteConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if(kiloBytes<0) {
            System.out.println("Invalid Value");
            return;
        }
        int valorMegaByte = 1024;
        int megaBytesResultantes = kiloBytes / valorMegaByte;
        int kiloBytesResultantes = kiloBytes % valorMegaByte;

        System.out.println(kiloBytes + " KB = " + megaBytesResultantes + " MB and " + kiloBytesResultantes + " KB");
    }

}
