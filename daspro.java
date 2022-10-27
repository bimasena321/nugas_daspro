import java.util.Scanner;
public class daspro {
    public static void main(String[] args) {
        String gol;
        int lamat,lamak,umur;
        int hasil;
        Scanner v = new Scanner(System.in);
        System.out.println("golongan kerja: ");
        gol = v.next();
        switch (gol) {
            case "1a":
                System.out.println("lama kerja: ");
                lamak = v.nextInt();
                System.out.println("lama tahun: ");
                lamat = v.nextInt();
                System.out.println("umur: ");
                umur = v.nextInt();
                if (lamak >= 150 ){
                    System.out.println("lembur");
                    hasil = lamak * 50000;
                    System.out.println("================================\n"+"gaji: ");
                    System.out.print(hasil * 2);
                }else if (lamat == 7 && umur == 55){
                    hasil = lamak * 50000;
                    System.out.println("================================\n"+"gaji: ");
                    System.out.print(hasil * 2 + 2.5);
                }else if (lamat == 7 && umur <= 55){
                    hasil = lamak * 50000;
                    System.out.println("================================\n"+"gaji: ");
                    System.out.print(hasil * 2 + 1.5);
                }else if (lamat == 7 && umur >= 17){
                    hasil = lamak * 50000;
                    System.out.println("================================\n"+"gaji: ");
                    System.out.print(hasil * 2 + 1);
                }
                break;
            case "1b":
                System.out.println("lamak kerja: ");
                lamak = v.nextInt();
                System.out.println("lama tahun: ");
                lamat = v.nextInt();
                System.out.println("umur: ");
                umur = v.nextInt();
                if (lamak >= 150){
                    System.out.println("lembur");
                    hasil = lamak * 75000 ;
                    System.out.println("================================\n"+"gaji: ");
                    System.out.print(hasil * 2 + 2.5);
                }else if (lamat == 7 && umur == 55){
                    hasil = lamak * 50000;
                    System.out.println("================================\n"+"gaji: ");
                    System.out.print(hasil * 2 + 2.5);
                }else if (lamat == 7 && umur <= 55){
                    hasil = lamak * 50000;
                    System.out.println("================================\n"+"gaji: ");
                    System.out.print(hasil * 2 + 1.5);
                }else if (lamat == 7 && umur >= 17){
                    hasil = lamak * 50000;
                    System.out.println("================================\n"+"gaji: ");
                    System.out.print(hasil * 2 + 1);
                }
                break;
            case "1c":
                System.out.println("lamak kerja: ");
                lamak = v.nextInt();
                System.out.println("lama tahun: ");
                lamat = v.nextInt();
                System.out.println("umur: ");
                umur = v.nextInt();
                if (lamak >= 150) {
                    System.out.println("lembur");
                    hasil = lamak * 100000;
                    System.out.println("================================\n"+"gaji: ");
                    System.out.print(hasil * 2);
                }else if (lamat == 7 && umur == 55){
                    hasil = lamak * 50000;
                    System.out.println("================================\n"+"gaji: ");
                    System.out.print(hasil * 2 + 2.5);
                }else if (lamat == 7 && umur <= 55){
                    hasil = lamak * 50000;
                    System.out.println("================================\n"+"gaji: ");
                    System.out.print(hasil * 2 + 1.5);
                }else if (lamat == 7 && umur >= 17){
                    hasil = lamak * 50000;
                    System.out.println("================================\n"+"gaji: ");
                    System.out.print(hasil * 2 + 1);
                }
                break;
            case "7a":
                System.out.println("lamak kerja: ");
                lamak = v.nextInt();
                System.out.println("lama tahun: ");
                lamat = v.nextInt();
                System.out.println("umur: ");
                umur = v.nextInt();
                if (lamak >= 150 && lamat != 7) {
                    System.out.println("lembur");
                    hasil = lamak * 175000;
                    System.out.println("================================\n"+"gaji: ");
                    System.out.print(hasil * 2);
                }else if (lamat == 7 && umur == 55){
                    hasil = lamak * 50000;
                    System.out.println("================================\n"+"gaji: ");
                    System.out.print(hasil * 2 + 2.5);
                }else if (lamat == 7 && umur <= 55){
                    hasil = lamak * 50000;
                    System.out.println("================================\n"+"gaji: ");
                    System.out.print(hasil * 2 + 1.5);
                }else if (lamat == 7 && umur >= 17){
                    hasil = lamak * 50000;
                    System.out.println("================================\n"+"gaji: ");
                    System.out.print(hasil * 2 + 1);
                }
                break;
            case "7b":
                System.out.println("lamak kerja: ");
                lamak = v.nextInt();
                System.out.println("lama tahun: ");
                lamat = v.nextInt();
                System.out.println("umur: ");
                umur = v.nextInt();
                if (lamak >= 150 && lamat != 7) {
                    System.out.println("lembur");
                    hasil = lamak * 150000;
                    System.out.println("================================\n"+"gaji: ");
                    System.out.print(hasil * 2 );
                }else if (lamat == 7 && umur == 55){
                    hasil = lamak * 50000;
                    System.out.println("================================\n"+"gaji: ");
                    System.out.print(hasil * 2 + 2.5);
                }else if (lamat == 7 && umur <= 55){
                    hasil = lamak * 50000;
                    System.out.println("================================\n"+"gaji: ");
                    System.out.print(hasil * 2 + 1.5);
                }else if (lamat == 7 && umur >= 17){
                    hasil = lamak * 50000;
                    System.out.println("================================\n"+"gaji: ");
                    System.out.print(hasil * 2 + 1);
                }
                break;
            case "7c":
                System.out.println("lamak kerja: ");
                lamak = v.nextInt();
                System.out.println("lama tahun: ");
                lamat = v.nextInt();
                System.out.println("umur: ");
                umur = v.nextInt();
                if (lamak >= 150 && lamat != 7) {
                    System.out.println("lembur");
                    hasil = lamak * 175000;
                    System.out.println("================================\n"+"gaji: ");
                    System.out.println(hasil * 2);
                }else if (lamat == 7 && umur == 55){
                    hasil = lamak * 50000;
                    System.out.println("================================\n"+"gaji: ");
                    System.out.print(hasil * 2 + 2.5);
                }else if (lamat == 7 && umur <= 55){
                    hasil = lamak * 50000;
                    System.out.println("================================\n"+"gaji: ");
                    System.out.print(hasil * 2 + 1.5);
                }else if (lamat == 7 && umur >= 17){
                    hasil = lamak * 50000;
                    System.out.println("================================\n"+"gaji: ");
                    System.out.print(hasil * 2 + 1);
                }
                break;
        }
    }
}
