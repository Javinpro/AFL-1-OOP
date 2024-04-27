import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;
import java.time.LocalDate;

public class main {
    //Bagian CD
    private static ArrayList<cd> listCd = new ArrayList<>(); // ArrayList untuk menyimpan objek-objek cd
    private static ArrayList<mahasiswa> listMhs = new ArrayList<>(); // ArrayList untuk menyimpan objek-objek mahasiswa
    private static ArrayList<dosen_staff> listDS = new ArrayList<>(); // ArrayList untuk menyimpan objek-objek dosen_staff
    private static ArrayList<buku_majalah> listBM = new ArrayList<>(); // ArrayList untuk menyimpan objek-objek buku_majalah
    private static ArrayList<member> listMember = new ArrayList<>(); // ArrayList untuk menyimpan objek-objek member
    private static ArrayList<penerbit> listPenerbit = new ArrayList<>(); // ArrayList untuk menyimpan objek-objek penerbit
    private static ArrayList<pengarang> listPengarang = new ArrayList<>(); // ArrayList untuk menyimpan objek-objek pengarang
    private static ArrayList<pustakawan> listPustakawan = new ArrayList<>(); // ArrayList untuk menyimpan objek-objek pustakawan
    private static ArrayList<transaksi> listTransaksi = new ArrayList<>(); // ArrayList untuk menyimpan objek-objek transaksi


    private static Scanner scanner = new Scanner(System.in); // Scanner untuk input
    private static SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");

    public static void main(String[] args) {
        
        int pilihan;
        boolean jalan = true;
        while (jalan) {
            System.out.println("\nOpsi program kami:");
            System.out.println("1. Tambah CD");
            System.out.println("2. Tambah Mahasiswa");
            System.out.println("3. Tambah Dosen/Staff");
            System.out.println("4. Tambah Buku Majalah");
            System.out.println("5. Tambah Member");
            System.out.println("6. Tambah Penerbit");
            System.out.println("7. Tambah Pengarang");
            System.out.println("8. Tambah Pustakawan");
            System.out.println("9. Tambah Transaksi");

            System.out.println("10. Lihat Tabel CD");
            System.out.println("11. Lihat Tabel Mahasiswa");
            System.out.println("12. Lihat Tabel Dosen/Staff");
            System.out.println("13. Lihat Tabel Buku Majalah");
            System.out.println("14. Lihat Tabel Member");
            System.out.println("15. Lihat Tabel Penerbit");
            System.out.println("16. Lihat Tabel Pengarang");
            System.out.println("17. Lihat Tabel Pustakawan");
            System.out.println("18. Lihat Tabel Transaksi");

            System.out.println("19. Print Tabel CD");
            System.out.println("20. Print Tabel Mahasiswa");
            System.out.println("21. Print Tabel Dosen/Staff");
            System.out.println("22. Print Tabel Buku Majalah");
            System.out.println("23. Print Tabel Member");
            System.out.println("24. Print Tabel Penerbit");
            System.out.println("25. Print Tabel Pengarang");
            System.out.println("26. Print Tabel Pustakawan");
            System.out.println("27. Print Tabel Transaksi");

            System.out.print("Pilihan Anda: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    tambahCd();
                    break;
                case 2:
                    tambahMhs();
                    break;
                case 3:
                    tambahDS();
                    break;
                case 4:
                    tambahBuku();
                    break;
                case 5:
                    tambahMember();
                    break;
                case 6:
                    tambahPenerbit();
                    break;
                case 7:
                    tambahPengarang();
                    break;
                case 8:
                    tambahPustakawan();
                    break;
                case 9:
                    tambahTransaksi();
                    break;
                case 10:
                    tampilkanTabelCd();
                    break;
                case 11:
                    tampilkanTabelMhs();
                    break;
                case 12:
                    tampilkanTabelDS();
                    break;
                case 13:
                    tampilkanTabelBuku();
                    break;
                case 14:
                    tampilkanTabelMember();
                    break;
                case 15:
                    tampilkanTabelPenerbit();
                    break;
                case 16:
                    tampilkanTabelPengarang();
                    break;
                case 17:
                    tampilkanTabelPustakawan();
                    break;
                case 18:
                    tampilkanTabelTransaksi();
                    break;
                case 19:
                    tampilkanFileCD();
                    break;
                case 20:
                    tampilkanFileMahasiswa();
                    break;
                case 21:
                    tampilkanFileDosen();
                    break;
                case 22:
                    tampilkanFileBuku();
                    break;
                case 23:
                    tampilkanFileMember();
                    break;
                case 24:
                    tampilkanFilePener();
                    break;
                case 25:
                    tampilkanFilePengar();
                    break;
                case 26:
                    tampilkanFilePusta();
                    break;
                case 27:
                    tampilkanFileTrans();
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
            System.out.print("Masih ingin lanjut? (ya/tidak) : ");
            String input = scanner.next();
            if (!input.equalsIgnoreCase("ya")){
                jalan = false;
            }    
        } 
        System.out.println("Terimakasih telah menggunakan program kami!");
        scanner.close();
    }

    // CD
    private static void tambahCd() {
        System.out.print("Masukkan jumlah cd yang akan dimasukkan: ");
        int jumlahCd = scanner.nextInt();
        scanner.nextLine(); // Mengonsumsi newline

        for (int i = 0; i < jumlahCd; i++) {
            System.out.print("\nMasukkan data untuk CD ke- " + (i+1) + ": \n");

            System.out.print("Masukkan kode CD: ");
            int kd_cd = scanner.nextInt();
            scanner.nextLine(); // Mengonsumsi newline

            System.out.print("Masukkan judul CD: ");
            String judul = scanner.nextLine();

            System.out.print("Masukkan tahun terbit: ");
            int tahun_terbit = scanner.nextInt();

            System.out.print("Masukkan jumlah total CD: ");
            int j_total = scanner.nextInt();

            System.out.print("Masukkan jumlah CD tersedia: ");
            int j_tersedia = scanner.nextInt();

            System.out.print("Masukkan jumlah CD dipinjam: ");
            int j_pinjam = scanner.nextInt();

            System.out.print("Masukkan jumlah CD rusak: ");
            int j_rusak = scanner.nextInt();

            // Membuat objek cd dan menambahkannya ke ArrayList
            cd item = new cd(kd_cd, judul, tahun_terbit, j_total, j_tersedia, j_pinjam, j_rusak);
            listCd.add(item);
        }
    }

    private static void tampilkanTabelCd() {
        // Menampilkan header tabel
        System.out.println("Kode CD |       Judul       | Tahun Terbit | Jumlah Total | Jumlah Tersedia | Jumlah Dipinjam | Jumlah Rusak");
        System.out.println("----------------------------------------------------------------------------------------------------------");

        // Menampilkan data cd
        for (cd item : listCd) {
            System.out.printf("%7d | %-17s | %12d | %12d | %15d | %15d | %11d%n", item.getKd_cd(), item.getJudul(), item.getTahun_terbit(), item.getJ_total(), item.getJ_tersedia(), item.getJ_pinjam(), item.getJ_rusak());
        }
    }

    private static void tampilkanFileCD() {
        String namaFile = "data_cd.txt";
        try (PrintWriter writer = new PrintWriter(new FileWriter(namaFile))) {
            // Menulis header
            writer.println("Kode CD |       Judul       | Tahun Terbit | Jumlah Total | Jumlah Tersedia | Jumlah Dipinjam | Jumlah Rusak");
            writer.println("----------------------------------------------------------------------------------------------------------");

            // Menulis data CD
            for (cd item : listCd) {
                writer.printf("%7d | %-17s | %12d | %12d | %15d | %15d | %11d%n", item.getKd_cd(), item.getJudul(), item.getTahun_terbit(), item.getJ_total(), item.getJ_tersedia(), item.getJ_pinjam(), item.getJ_rusak());
            }

            System.out.println("Data CD berhasil disimpan ke dalam file " + namaFile);
        } catch (IOException e) {
            System.err.println("Terjadi kesalahan saat menyimpan data ke file: " + e.getMessage());
        }
    }

    //Mahasiswa
    private static void tambahMhs() {
        System.out.print("Masukkan jumlah mahasiswa yang akan dimasukkan: ");
        int jumlahMhs = 0;
        try {
            jumlahMhs = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline
        } catch (Exception e) {
            System.out.println("Masukkan harus berupa bilangan bulat.");
            scanner.nextLine(); // Membersihkan buffer
            tambahMhs(); // Mengulang pemanggilan tambahMhs() untuk meminta input kembali
            return; // Menghentikan eksekusi tambahMhs() yang sedang berjalan
        }
    
        for (int i = 0; i < jumlahMhs; i++) {
            System.out.print("\nMasukkan data untuk mahasiswa ke- " + (i+1) + ": \n");

            System.out.print("Masukkan NIM : ");
            String nim = scanner.nextLine();
    
            String nama = "";
            while (true) {
                System.out.print("Masukkan Nama : ");
                if (scanner.hasNextInt()) {
                    System.out.println("Nama harus berupa string.");
                    scanner.nextLine(); // Membersihkan buffer
                } else {
                    nama = scanner.nextLine();
                    break; // Keluar dari loop jika input sudah sesuai
                }
            }

            String fak_dep = "";
            while (true) {
                System.out.print("Masukkan Fak/Dep : ");
                if (scanner.hasNextInt()) {
                    System.out.println("Fak/Dep harus berupa string.");
                    scanner.nextLine(); // Membersihkan buffer
                } else {
                    fak_dep = scanner.nextLine();
                    break; // Keluar dari loop jika input sudah sesuai
                }
            }

            String prodi = "";
            while (true) {
                System.out.print("Masukkan Prodi : ");
                if (scanner.hasNextInt()) {
                    System.out.println("Prodi harus berupa string.");
                    scanner.nextLine(); // Membersihkan buffer
                } else {
                    prodi = scanner.nextLine();
                    break; // Keluar dari loop jika input sudah sesuai
                }
            }
    
            // Membuat objek mahasiswa dan menambahkannya ke ArrayList
            mahasiswa mhs = new mahasiswa(nim, nama, fak_dep, prodi); // Mengatur nilai atribut-atribut mahasiswa
            listMhs.add(mhs);
        }
    }
    
    private static void tampilkanTabelMhs() {
        // Menampilkan header tabel
        System.out.println("NIM      |       Nama       | Fak/Dep          | Prodi");
        System.out.println("---------------------------------------------------------");
    
        // Menampilkan data mahasiswa
        for (mahasiswa mhs : listMhs) {
            System.out.printf("%-8s | %-16s | %-16.5s | %s%n", mhs.getNim(), mhs.getNama(), mhs.getFak_dep(), mhs.getProdi());
        }
    }
    
    private static void tampilkanFileMahasiswa() {
        String namaFile = "data_mahasiswa.txt";
        try (PrintWriter writer = new PrintWriter(new FileWriter(namaFile))) {
            // Menulis header
            writer.println("NIM      |       Nama       | Fak/Dep          | Prodi");
            writer.println("---------------------------------------------------------");

            // Menulis data mahasiswa
            for (mahasiswa mhs : listMhs) {
                writer.printf("%-8s | %-16s | %-16.5s | %s%n", mhs.getNim(), mhs.getNama(), mhs.getFak_dep(), mhs.getProdi());
            }

            System.out.println("Data Mahasiswa berhasil disimpan ke dalam file " + namaFile);
        } catch (IOException e) {
            System.err.println("Terjadi kesalahan saat menyimpan data ke file: " + e.getMessage());
        }
    }

    //Dosen_Staff
    private static void tambahDS() {
        System.out.print("Masukkan jumlah dosen/staff yang akan dimasukkan: ");
        int jumlahDosenStaff = 0;
        try {
            jumlahDosenStaff = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline
        } catch (Exception e) {
            System.out.println("Masukkan harus berupa bilangan bulat.");
            scanner.nextLine(); // Membersihkan buffer
            tambahDS(); // Mengulang pemanggilan tambahDosenStaff() untuk meminta input kembali
            return; // Menghentikan eksekusi tambahDosenStaff() yang sedang berjalan
        }

        for (int i = 0; i < jumlahDosenStaff; i++) {
            System.out.print("\nMasukkan data untuk dosen/staff ke- " + (i+1) + ": \n");

            System.out.print("Masukkan NIK : ");
            int nik = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline

            System.out.print("Masukkan Nama : ");
            String nama = scanner.nextLine();

            String fak_dep = "";
            while (true) {
                System.out.print("Masukkan Fak/Dep : ");
                if (scanner.hasNextInt()) {
                    System.out.println("Fak/Dep harus berupa string.");
                    scanner.nextLine(); // Membersihkan buffer
                } else {
                    fak_dep = scanner.nextLine();
                    break; // Keluar dari loop jika input sudah sesuai
                }
            }

            String prodi = "";
            while (true) {
                System.out.print("Masukkan Prodi : ");
                if (scanner.hasNextInt()) {
                    System.out.println("Prodi harus berupa string.");
                    scanner.nextLine(); // Membersihkan buffer
                } else {
                    prodi = scanner.nextLine();
                    break; // Keluar dari loop jika input sudah sesuai
                }
            }

            // Membuat objek dosen_staff dan menambahkannya ke ArrayList
            dosen_staff ds = new dosen_staff(nik, nama, fak_dep, prodi); // Mengatur nilai atribut-atribut dosen_staff
            listDS.add(ds);
        }
    }

    private static void tampilkanTabelDS() {
        // Menampilkan header tabel
        System.out.println("NIK      |       Nama       | Fak/Dep          | Prodi");
        System.out.println("---------------------------------------------------------");
    
        // Menampilkan data dosen_staff
        for (dosen_staff ds : listDS) {
            System.out.printf("%-8s | %-16s | %-16.5s | %s%n", ds.getNik(), ds.getNama(), ds.getFak_dep(), ds.getProdi());
        }
    }
    
    private static void tampilkanFileDosen() {
        String namaFile = "data_dosen_staff.txt";
        try (PrintWriter writer = new PrintWriter(new FileWriter(namaFile))) {
            // Menulis header
            writer.println("NIK      |       Nama       | Fak/Dep          | Prodi");
            writer.println("---------------------------------------------------------");

            // Menulis data dosen_staff
            for (dosen_staff ds : listDS) {
                writer.printf("%-8s | %-16s | %-16.5s | %s%n", ds.getNik(), ds.getNama(), ds.getFak_dep(), ds.getProdi());
            }

            System.out.println("Data Dosen/Staff berhasil disimpan ke dalam file " + namaFile);
        } catch (IOException e) {
            System.err.println("Terjadi kesalahan saat menyimpan data ke file: " + e.getMessage());
        }
    }

    //Buku Majalah
    private static void tambahBuku() {
        System.out.print("Masukkan jumlah Buku Majalah yang akan dimasukkan: ");
        int jumlahBukuMajalah = 0;
        try {
            jumlahBukuMajalah = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline
        } catch (Exception e) {
            System.out.println("Masukkan harus berupa bilangan bulat.");
            scanner.nextLine(); // Membersihkan buffer
            tambahBuku(); // Mengulang pemanggilan tambahDosenStaff() untuk meminta input kembali
            return; // Menghentikan eksekusi tambahDosenStaff() yang sedang berjalan
        }

        for (int i = 0; i < jumlahBukuMajalah; i++) {
            System.out.print("\nMasukkan data untuk buku majalah ke- " + (i+1) + ": \n");

            System.out.print("Masukkan ISBN/ISSN : ");
            int ISBN_ISSN = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline

            System.out.print("Masukkan judul : ");
            String judul = scanner.nextLine();

            System.out.print("Masukkan Tahun Terbit : ");
            int tahun_terbit = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline

            String edisi = "";
            while (true) {
                System.out.print("Masukkan Edisi buku : ");
                if (scanner.hasNextInt()) {
                    System.out.println("Edisi buku harus berupa string.");
                    scanner.nextLine(); // Membersihkan buffer
                } else {
                    edisi = scanner.nextLine();
                    break; // Keluar dari loop jika input sudah sesuai
                }
            }

            String jenis_sampul = "";
            while (true) {
                System.out.print("Masukkan Jenis Sampul : ");
                if (scanner.hasNextInt()) {
                    System.out.println("Jenis Sampul harus berupa string.");
                    scanner.nextLine(); // Membersihkan buffer
                } else {
                    jenis_sampul = scanner.nextLine();
                    break; // Keluar dari loop jika input sudah sesuai
                }
            }

            System.out.print("Masukkan jumlah rusak : ");
            int j_rusak = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline

            System.out.print("Masukkan jumlah pinjam : ");
            int j_pinjam = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline

            System.out.print("Masukkan jumlah tersedia : ");
            int j_tersedia = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline

            System.out.print("Masukkan jumlah total : ");
            int j_total = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline


            // Membuat objek dosen_staff dan menambahkannya ke ArrayList
            buku_majalah bm = new buku_majalah( ISBN_ISSN,  judul,  tahun_terbit,  edisi,  jenis_sampul,  j_rusak,  j_pinjam,  j_tersedia,  j_total); // Mengatur nilai atribut-atribut buku_majalah
            listBM.add(bm);
        }
    }

    private static void tampilkanTabelBuku() {
        // Menampilkan header tabel
        System.out.println("ISBN/ISSN |      Judul      | Tahun Terbit |   Edisi   | Jenis Sampul | Rusak | Pinjam | Tersedia |  Total");
        System.out.println("-----------------------------------------------------------------------------------------------------------------");

        // Menampilkan data buku_majalah
        for (buku_majalah bm : listBM) {
            System.out.printf("%-10s| %-16s| %-13s| %-10s| %-13s| %-6d| %-7d| %-9d| %d%n", bm.getISBN_ISSN(), bm.getJudul(), bm.getTahun_terbit(), bm.getEdisi(), bm.getJenis_sampul(), bm.getJ_rusak(), bm.getJ_pinjam(), bm.getJ_tersedia(), bm.getJ_total());
        }
    }
    
    private static void tampilkanFileBuku() {
        String namaFile = "data_buku_majalah.txt";
        try (PrintWriter writer = new PrintWriter(new FileWriter(namaFile))) {
            // Menulis header
            writer.println("ISBN/ISSN |      Judul      | Tahun Terbit |   Edisi   | Jenis Sampul | Rusak | Pinjam | Tersedia |  Total");
            writer.println("-----------------------------------------------------------------------------------------------------------------");

            // Menulis data buku majalah
            for (buku_majalah bm : listBM) {
                writer.printf("%-10s| %-16s| %-13s| %-10s| %-13s| %-6d| %-7d| %-9d| %d%n", bm.getISBN_ISSN(), bm.getJudul(), bm.getTahun_terbit(), bm.getEdisi(), bm.getJenis_sampul(), bm.getJ_rusak(), bm.getJ_pinjam(), bm.getJ_tersedia(), bm.getJ_total());
            }

            System.out.println("Data Buku Majalah berhasil disimpan ke dalam file " + namaFile);
        } catch (IOException e) {
            System.err.println("Terjadi kesalahan saat menyimpan data ke file: " + e.getMessage());
        }
    }

    //Member
    private static void tambahMember() {
        System.out.print("Masukkan jumlah member yang akan dimasukkan: ");
        int jumlahMember = 0;
        try {
            jumlahMember = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline
        } catch (Exception e) {
            System.out.println("Masukkan harus berupa bilangan bulat.");
            scanner.nextLine(); // Membersihkan buffer
            tambahMember(); // Mengulang pemanggilan tambahMember() untuk meminta input kembali
            return; // Menghentikan eksekusi tambahMember() yang sedang berjalan
        }

        for (int i = 0; i < jumlahMember; i++) {
            System.out.print("\nMasukkan data untuk member ke- " + (i+1) + ": \n");

            System.out.print("Masukkan ID Member : ");
            int id_member = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline

            System.out.print("Masukkan NIK : ");
            int nik = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline

            System.out.print("Masukkan NIM : ");
            String nim = scanner.nextLine();

            System.out.print("Masukkan Posisi Denda : ");
            String p_denda = scanner.nextLine();

            System.out.print("Masukkan Jumlah Denda : ");
            int j_denda = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline

            // Membuat objek member dan menambahkannya ke ArrayList
            member mb = new member(id_member, nik, nim, p_denda, j_denda); // Mengatur nilai atribut-atribut member
            listMember.add(mb);
        }
    }

    private static void tampilkanTabelMember() {
        // Menampilkan header tabel
        System.out.println("ID Member |   NIK   |    NIM    | Posisi Denda | Jumlah Denda");
        System.out.println("------------------------------------------------------------");

        // Menampilkan data member
        for (member mb : listMember) {
            System.out.printf("%-10d| %-8d| %-10s| %-13s| %d%n", mb.getId_member(), mb.getNik(), mb.getNim(), mb.getP_denda(), mb.getJ_denda());
        }
    }

    private static void tampilkanFileMember() {
        String namaFile = "data_member.txt";
        try (PrintWriter writer = new PrintWriter(new FileWriter(namaFile))) {
            // Menulis header
            writer.println("ID Member |   NIK   |    NIM    | Posisi Denda | Jumlah Denda");
            writer.println("------------------------------------------------------------");

            // Menulis data pustakawan
            for (member mb : listMember) {
                writer.printf("%-10d| %-8d| %-10s| %-13s| %d%n", mb.getId_member(), mb.getNik(), mb.getNim(), mb.getP_denda(), mb.getJ_denda());
            }

            System.out.println("Data Member berhasil disimpan ke dalam file " + namaFile);
        } catch (IOException e) {
            System.err.println("Terjadi kesalahan saat menyimpan data ke file: " + e.getMessage());
        }
    }

    //Penerbit
    private static void tambahPenerbit() {
        System.out.print("Masukkan jumlah penerbit yang akan dimasukkan: ");
        int jumlahPenerbit = 0;
        try {
            jumlahPenerbit = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline
        } catch (Exception e) {
            System.out.println("Masukkan harus berupa bilangan bulat.");
            scanner.nextLine(); // Membersihkan buffer
            tambahPenerbit(); // Mengulang pemanggilan tambahPenerbit() untuk meminta input kembali
            return; // Menghentikan eksekusi tambahPenerbit() yang sedang berjalan
        }

        for (int i = 0; i < jumlahPenerbit; i++) {
            System.out.print("\nMasukkan data untuk penerbit ke- " + (i+1) + ": \n");

            System.out.print("Masukkan ID Penerbit : ");
            int id_penerbit = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline

            System.out.print("Masukkan Nama Penerbit : ");
            String nama = scanner.nextLine();

            System.out.print("Masukkan Alamat Penerbit : ");
            String alamat = scanner.nextLine();

            System.out.print("Masukkan Email Penerbit : ");
            String email = scanner.nextLine();

            System.out.print("Masukkan Nomor Telepon Penerbit : ");
            String no_telp = scanner.nextLine();

            // Membuat objek penerbit dan menambahkannya ke ArrayList
            penerbit pb = new penerbit(id_penerbit, nama, alamat, email, no_telp); // Mengatur nilai atribut-atribut penerbit
            listPenerbit.add(pb);
        }
    }

    private static void tampilkanTabelPenerbit() {
        // Menampilkan header tabel
        System.out.println("ID Penerbit |       Nama       |         Alamat         |          Email          |   No. Telepon");
        System.out.println("-----------------------------------------------------------------------------------------------------");

        // Menampilkan data penerbit
        for (penerbit pb : listPenerbit) {
            System.out.printf("%-12d| %-17s| %-23s| %-23s| %s%n", pb.getId_penerbit(), pb.getNama(), pb.getAlamat(), pb.getEmail(), pb.getNo_telp());
        }
    }

    private static void tampilkanFilePener() {
        String namaFile = "data_penerbit.txt";
        try (PrintWriter writer = new PrintWriter(new FileWriter(namaFile))) {
            // Menulis header
            writer.println("ID Penerbit |       Nama       |         Alamat         |          Email          |   No. Telepon");
            writer.println("-----------------------------------------------------------------------------------------------------");

            // Menulis data penerbit
            for (penerbit pb : listPenerbit) {
                writer.printf("%-12d| %-17s| %-23s| %-23s| %s%n", pb.getId_penerbit(), pb.getNama(), pb.getAlamat(), pb.getEmail(), pb.getNo_telp());
            }

            System.out.println("Data Penerbit berhasil disimpan ke dalam file " + namaFile);
        } catch (IOException e) {
            System.err.println("Terjadi kesalahan saat menyimpan data ke file: " + e.getMessage());
        }
    }


    //Pengarang
    private static void tambahPengarang() {
        System.out.print("Masukkan jumlah pengarang yang akan dimasukkan: ");
        int jumlahPengarang = 0;
        try {
            jumlahPengarang = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline
        } catch (Exception e) {
            System.out.println("Masukkan harus berupa bilangan bulat.");
            scanner.nextLine(); // Membersihkan buffer
            tambahPengarang(); // Mengulang pemanggilan tambahPengarang() untuk meminta input kembali
            return; // Menghentikan eksekusi tambahPengarang() yang sedang berjalan
        }

        for (int i = 0; i < jumlahPengarang; i++) {
            System.out.print("\nMasukkan data untuk penerbit ke- " + (i+1) + ": \n");

            System.out.print("Masukkan ID Pengarang : ");
            int id_pengarang = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline

            System.out.print("Masukkan Nama Pengarang : ");
            String nama = scanner.nextLine();

            System.out.print("Masukkan Alamat Pengarang : ");
            String alamat = scanner.nextLine();

            System.out.print("Masukkan Email Pengarang : ");
            String email = scanner.nextLine();

            System.out.print("Masukkan Nomor Telepon Pengarang : ");
            String no_telp = scanner.nextLine();

            // Membuat objek pengarang dan menambahkannya ke ArrayList
            pengarang pg = new pengarang(id_pengarang, nama, alamat, email, no_telp); // Mengatur nilai atribut-atribut pengarang
            listPengarang.add(pg);
        }
    }

    private static void tampilkanTabelPengarang() {
        // Menampilkan header tabel
        System.out.println("ID Pengarang |       Nama       |         Alamat         |          Email          |   No. Telepon");
        System.out.println("-----------------------------------------------------------------------------------------------------");

        // Menampilkan data pengarang
        for (pengarang pg : listPengarang) {
            System.out.printf("%-13d| %-17s| %-23s| %-23s| %s%n", pg.getId_pengarang(), pg.getNama(), pg.getAlamat(), pg.getEmail(), pg.getNo_telp());
        }
    }

    private static void tampilkanFilePengar() {
        String namaFile = "data_pengarang.txt";
        try (PrintWriter writer = new PrintWriter(new FileWriter(namaFile))) {
            // Menulis header
            writer.println("ID Pengarang |       Nama       |         Alamat         |          Email          |   No. Telepon");
            writer.println("-----------------------------------------------------------------------------------------------------");

            // Menulis data pengarang
            for (pengarang pg : listPengarang) {
                writer.printf("%-13d| %-17s| %-23s| %-23s| %s%n", pg.getId_pengarang(), pg.getNama(), pg.getAlamat(), pg.getEmail(), pg.getNo_telp());
            }

            System.out.println("Data Pengarang berhasil disimpan ke dalam file " + namaFile);
        } catch (IOException e) {
            System.err.println("Terjadi kesalahan saat menyimpan data ke file: " + e.getMessage());
        }
    }


    //Pustakawan
    private static void tambahPustakawan() {
        System.out.print("Masukkan jumlah pustakawan yang akan dimasukkan: ");
        int jumlahPustakawan = 0;
        try {
            jumlahPustakawan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline
        } catch (Exception e) {
            System.out.println("Masukkan harus berupa bilangan bulat.");
            scanner.nextLine(); // Membersihkan buffer
            tambahPustakawan(); // Mengulang pemanggilan tambahPustakawan() untuk meminta input kembali
            return; // Menghentikan eksekusi tambahPustakawan() yang sedang berjalan
        }

        for (int i = 0; i < jumlahPustakawan; i++) {
            System.out.print("\nMasukkan data untuk pustakawan ke- " + (i+1) + ": \n");

            System.out.print("Masukkan ID Pustakawan : ");
            int id_pus = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline

            System.out.print("Masukkan Nama Pustakawan : ");
            String nama = scanner.nextLine();

            System.out.print("Masukkan Username : ");
            String username = scanner.nextLine();

            System.out.print("Masukkan Password : ");
            String password = scanner.nextLine();

            System.out.print("Masukkan Jenis Kelamin (L/P) : ");
            char j_kel = scanner.next().charAt(0);
            scanner.nextLine(); // Membersihkan newline

            System.out.print("Masukkan Nomor Telepon : ");
            String no_telp = scanner.nextLine();

            System.out.print("Masukkan Nama File Foto : ");
            String photo = scanner.nextLine();

            System.out.print("Masukkan Level : ");
            String level = scanner.nextLine();

            System.out.print("Masukkan Email : ");
            String email = scanner.nextLine();

            // Membuat objek pustakawan dan menambahkannya ke ArrayList
            pustakawan pw = new pustakawan(id_pus, nama, username, password, j_kel, no_telp, photo, level, email); // Mengatur nilai atribut-atribut pustakawan
            listPustakawan.add(pw);
        }
    }

    private static void tampilkanTabelPustakawan() {
        // Menampilkan header tabel
        System.out.println("ID Pustakawan |     Nama     |   Username   |   Password   | Jenis Kelamin | No. Telepon |    Photo    | Level | Email");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");

        // Menampilkan data pustakawan
        for (pustakawan pw : listPustakawan) {
            System.out.printf("%-14d| %-13s| %-13s| %-13s| %-14s| %-12s| %-12s| %-6s| %s%n", pw.getId_pus(), pw.getNama(), pw.getUsername(), pw.getPassword(), pw.getJ_kel(), pw.getNo_telp(), pw.getPhoto(), pw.getLevel(), pw.getEmail());
        }
    }

    private static void tampilkanFilePusta() {
        String namaFile = "data_pustakawan.txt";
        try (PrintWriter writer = new PrintWriter(new FileWriter(namaFile))) {
            // Menulis header
            writer.println("ID Pustakawan |     Nama     |   Username   |   Password   | Jenis Kelamin | No. Telepon |    Photo    | Level | Email");
            writer.println("-------------------------------------------------------------------------------------------------------------------");

            // Menulis data pustakawan
            for (pustakawan pw : listPustakawan) {
                writer.printf("%-14d| %-13s| %-13s| %-13s| %-14s| %-12s| %-12s| %-6s| %s%n", pw.getId_pus(), pw.getNama(), pw.getUsername(), pw.getPassword(), pw.getJ_kel(), pw.getNo_telp(), pw.getPhoto(), pw.getLevel(), pw.getEmail());
            }

            System.out.println("Data Pustakawan berhasil disimpan ke dalam file " + namaFile);
        } catch (IOException e) {
            System.err.println("Terjadi kesalahan saat menyimpan data ke file: " + e.getMessage());
        }
    }


    private static void tambahTransaksi() {
        System.out.print("Masukkan jumlah transaksi yang akan dimasukkan: ");
        int jumlahTransaksi = 0;
        try {
            jumlahTransaksi = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline
        } catch (Exception e) {
            System.out.println("Masukkan harus berupa bilangan bulat.");
            scanner.nextLine(); // Membersihkan buffer
            tambahTransaksi(); // Mengulang pemanggilan tambahTransaksi() untuk meminta input kembali
            return; // Menghentikan eksekusi tambahTransaksi() yang sedang berjalan
        }

        for (int i = 0; i < jumlahTransaksi; i++) {
            System.out.println("\nMasukkan data untuk transaksi ke-" + (i+1) + ": ");

            System.out.print("Masukkan Kode Transaksi: ");
            int kd_transaksi = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline

            System.out.print("Masukkan Tanggal Pinjam (format: yyyy-MM-dd): ");
            Date tgl_pinjam = null;
            try {
                tgl_pinjam = dateFormatter.parse(scanner.nextLine());
            } catch (ParseException e) {
                System.out.println("Format tanggal tidak valid. Gunakan format yyyy-MM-dd.");
                continue; // Mengulangi loop untuk meminta input kembali
            }
            
            System.out.print("Masukkan Tanggal Kembali (format: yyyy-MM-dd): ");
            Date tgl_kembali = null;
            try {
                tgl_kembali = dateFormatter.parse(scanner.nextLine());
            } catch (ParseException e) {
                System.out.println("Format tanggal tidak valid. Gunakan format yyyy-MM-dd.");
                continue; // Mengulangi loop untuk meminta input kembali
            }

            System.out.print("Masukkan Tanggal Transaksi (format: yyyy-MM-dd): ");
            Date tgl_transaksi = null;
            try {
                tgl_transaksi = dateFormatter.parse(scanner.nextLine());
            } catch (ParseException e) {
                System.out.println("Format tanggal tidak valid. Gunakan format yyyy-MM-dd.");
                continue; // Mengulangi loop untuk meminta input kembali
            }

            System.out.print("Masukkan Total Denda: ");
            int total_denda = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline

            System.out.print("Masukkan Jenis Pembayaran: ");
            String jenis_pembayaran = scanner.nextLine();

            System.out.print("Masukkan Total Barang Rusak: ");
            int total_barang_rusak = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline

            System.out.print("Masukkan Total Bayar: ");
            int total_bayar = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline

            System.out.print("Masukkan Status Buku: ");
            String status_buku = scanner.nextLine();

            System.out.print("Masukkan Total Pinjam: ");
            int total_pinjam = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline

            System.out.print("Masukkan Id Pustakawan: ");
            int id_pus = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline

            System.out.print("Masukkan ISBN/ISSN: ");
            int ISBN_ISSN = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline

            System.out.print("Masukkan NIK: ");
            int nik = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline

            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();

            System.out.print("Masukkan Id Member: ");
            int id_member = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline
        }
    }

    private static void tampilkanTabelTransaksi() {
        // Menampilkan header tabel
        System.out.println("Kode Transaksi | Tanggal Pinjam | Tanggal Kembali | Tanggal Transaksi | Total Denda | Jenis Pembayaran | Total Barang Rusak | Total Bayar | Status Buku | Total Pinjam | ID Pustakawan | ISBN/ISSN | NIK | NIM | ID Member");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    
        // Menampilkan data transaksi
        for (transaksi trans : listTransaksi) {
            System.out.printf("%-14d| %-15s| %-16s| %-18s| %-12d| %-17s| %-19d| %-12d| %-12s| %-14d| %-14d| %-10d| %-5d| %-5s| %-9d%n",
                    trans.getKd_transaksi(),
                    dateFormatter.format(trans.getTgl_pinjam()),
                    dateFormatter.format(trans.getTgl_kembali()),
                    dateFormatter.format(trans.getTgl_transaksi()),
                    trans.getTotal_denda(),
                    trans.getJenis_pembayaran(),
                    trans.getTotal_barang_rusak(),
                    trans.getTotal_bayar(),
                    trans.getStatus_buku(),
                    trans.getTotal_pinjam(),
                    trans.getId_pus(),
                    trans.getISBN_ISSN(),
                    trans.getNik(),
                    trans.getNim(),
                    trans.getId_member());
        }
    }    

    private static void tampilkanFileTrans() {
        String namaFile = "data_transaksi.txt";
        try (PrintWriter writer = new PrintWriter(new FileWriter(namaFile))) {
            // Menulis header
            writer.println("Kode Transaksi | Tanggal Pinjam | Tanggal Kembali | Tanggal Transaksi | Total Denda | Jenis Pembayaran | Total Barang Rusak | Total Bayar | Status Buku | Total Pinjam | ID Pustakawan | ISBN/ISSN | NIK | NIM | ID Member");
            writer.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

            // Menulis data transaksi
            for (transaksi trans : listTransaksi) {
                writer.printf("%-14d| %-15s| %-16s| %-18s| %-12d| %-17s| %-19d| %-12d| %-12s| %-14d| %-14d| %-10d| %-5d| %-5s| %-9d%n",
                trans.getKd_transaksi(),
                dateFormatter.format(trans.getTgl_pinjam()),
                dateFormatter.format(trans.getTgl_kembali()),
                dateFormatter.format(trans.getTgl_transaksi()),
                trans.getTotal_denda(),
                trans.getJenis_pembayaran(),
                trans.getTotal_barang_rusak(),
                trans.getTotal_bayar(),
                trans.getStatus_buku(),
                trans.getTotal_pinjam(),
                trans.getId_pus(),
                trans.getISBN_ISSN(),
                trans.getNik(),
                trans.getNim(),
                trans.getId_member());
            }

            System.out.println("Data Transaksi berhasil disimpan ke dalam file " + namaFile);
        } catch (IOException e) {
            System.err.println("Terjadi kesalahan saat menyimpan data ke file: " + e.getMessage());
        }
    }

}
