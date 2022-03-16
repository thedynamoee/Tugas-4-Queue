import java.util.LinkedList;
import java.util.Queue;

public class daffa {
    public static void main(String[] args) {
        System.out.println("========= TUGAS 4 : QUEUE =========");
        System.out.println(" Nama\t: Daffa Abdillah ");
        System.out.println(" NIM\t: 2111521001 ");
        System.out.println("===================================\n");

        //Queue
        Queue<Integer> antrian = new LinkedList<>();
        antrian.add(1);     
        antrian.add(2);     
        System.out.println("Antrian :" + antrian + "\n" );

        //Fungsi Add (Enqueue)
        antrian.add(3);     
        antrian.add(4);     
        antrian.add(5);   
        System.out.println("1. Menambah Queue (Enqueue)");       
        System.out.println("Antrian :" + antrian);
        System.out.println("Elemen Paling Depan : " + antrian.peek() + "\n");

        //Fungsi Remove 
        antrian.remove();     
        antrian.remove(); 
        System.out.println("2. Menghapus Queue (Dequeue)");    
        System.out.println("Antrian :" + antrian);
        System.out.println("Elemen Paling Depan " + antrian.peek() + "\n");
         
        //Fungsi isEmpty
        System.out.println("3. Pengecekan Queue");
        System.out.println("Apakah Antrian Kosong? "+antrian.isEmpty() + "\n");
 
        //Fungsi size
        System.out.println("4. Ukuran Queue");
        System.out.println("Ukuran queue itu adalah " + antrian.size());

    }
}