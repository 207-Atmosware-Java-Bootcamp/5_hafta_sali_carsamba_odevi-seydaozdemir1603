import java.util.Scanner;

public class vizeHesaplama {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Vize notunu girin: ");
		int vizeInput = input.nextInt();
	    System.out.println("Final notunu girin: ");
	    int finalInput = input.nextInt();
	    
	    int ortalama = (vizeInput + finalInput) / 2;
	    
	    if(ortalama < 50) {
	    	System.out.println("Sınıfta kaldı.");
	    }
	    else if( ortalama == 50) {
	    	System.out.println("Geçer not aldı.");
	    }
	    else if(ortalama >= 55 && ortalama <= 70) {
	    	
	    	System.out.println("BB");
	    	
	    }
	    else if(ortalama >= 70 && ortalama <= 84) {
	    	System.out.println("BA");
	    	
	    }
	    else if(ortalama >= 84 && ortalama <= 100) {
	    	System.out.println("AA");
	    	
	    }
	    
	    //-------------------------------------------2w3
        System.out.print("Bir sayi giriniz: ");
        int sayi = input.nextInt();
        int sayac = 0;
        
        for(int i = 2; i < sayi; i++)
        {
            if(sayi % i == 0) {
                sayac++;
            }
        }
        if(sayac == 0) {
            System.out.println(sayi + " Asal bir sayıdır.");
        }
        else {
            System.out.println(sayi + " Asal bir sayı değildir.");
        } 
		
		//-----------------------------------------------
        
        
        int faktoriyel = 1;
        
        System.out.println("Bir sayı giriniz: ");
        int sayi2 = input.nextInt();
        
        for(int i = 1; i <= sayi2; i++)
        {
            faktoriyel = faktoriyel * i;
        }
        System.out.println(sayi2 + "!= " + faktoriyel);
    	}
 	
	}
	
		
		
		
		
		
		
		
		
		
		

