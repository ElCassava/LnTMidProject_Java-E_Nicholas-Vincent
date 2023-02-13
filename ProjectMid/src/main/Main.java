package main;

import java.util.Scanner;
import java.util.Random;

public class Main {
	Scanner keyboard = new Scanner(System.in);
	String kode, nama, jenis, jabatan;
    int gaji;
    int countManager, countSupervisor, countAdmin;
    
	public Main() {
		 int choice;
		 	
		 do {
	        System.out.println("1. Insert");
	    	System.out.println("2. View");
	    	System.out.println("3. Update");
	    	System.out.println("4. Delete"); 
	    	System.out.println("5. Exit"); 
	        
	    	System.out.print("Input Choice: ");
	        choice = keyboard.nextInt();
	        keyboard.nextLine();
	        
	        
	        switch(choice) {
	        case 1:
		        
		        Random random = new Random();
		        
		        
		        countManager = countSupervisor = countAdmin = 0;

		        System.out.println("Input Data Karyawan");
		        System.out.print("Nama Karyawan: ");
		        nama = keyboard.nextLine();
		        while (nama.length() < 3) {
		            System.out.println("Nama karyawan minimal 3 huruf.");
		            System.out.print("Nama Karyawan: ");
		            nama = keyboard.nextLine();
		        }

		        System.out.print("Jenis Kelamin (Laki-Laki / Perempuan): ");
		        jenis = keyboard.nextLine();
		        while (!jenis.equals("Laki-Laki") && !jenis.equals("Perempuan")) {
		            System.out.println("Jenis kelamin hanya bisa memilih (Laki-Laki / Perempuan)");
		            System.out.print("Jenis Kelamin (Laki-Laki / Perempuan): ");
		            jenis = keyboard.nextLine();
		        }

		        System.out.print("Jabatan (Manager / Supervisor / Admin): ");
		        jabatan = keyboard.nextLine();
		        while (!jabatan.equals("Manager") && !jabatan.equals("Supervisor") && !jabatan.equals("Admin")) {
		            System.out.println("Jabatan hanya bisa memilih (Manager / Supervisor / Admin)");
		            System.out.print("Jabatan (Manager / Supervisor / Admin): ");
		            jabatan = keyboard.nextLine();
		        }

		        if (jabatan.equals("Manager")) {
		            gaji = 8000000;
		            countManager++;
		        } else if (jabatan.equals("Supervisor")) {
		            gaji = 6000000;
		            countSupervisor++;
		        } else {
		            gaji = 4000000;
		            countAdmin++;
		        }

		        if (jabatan.equals("Manager") && countManager % 3 == 0) {
		            gaji += (gaji * 0.1);
		        } else if (jabatan.equals("Supervisor") && countSupervisor % 3 == 0) {
		            gaji += (gaji * 0.075);
		        } else if (jabatan.equals("Admin") && countAdmin % 3 == 0) {
		            gaji += (gaji * 0.05);
		        }

		        kode = "" + (char)('A' + random.nextInt(26)) + (char)('A' + random.nextInt(26)) + "-" + (random.nextInt(9000) + 1000);
		    break;
		    
	        case 2:
	        	System.out.println("Kode: "+kode);
	        	System.out.println("Kode: "+nama);
	        	System.out.println("Kode: "+jenis);
	        	System.out.println("Kode: "+jabatan);
	        	System.out.println("Kode: "+gaji);
	        }
     	
	        
	        }while (choice !=5);
	}

	public static void main(String[] args) {
		new Main();
     

		
      
	}

}
