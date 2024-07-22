package Training1;
import java.util.Scanner;

public class Supply {
	private int Code;
	private String FoodName,Sticker,FoodType;
	
	private void GetType() {
        switch (Sticker.toLowerCase()) {
            case "green":
                FoodType = "Vegetarian";
                break;
            case "yellow":
                FoodType = "Contains Egg";
                break;
            case "red":
                FoodType = "Non Vegetarian";
                break;
            default:
                FoodType = "Unknown";
                break;
        }
		
	}
	
	 public void FoodIn() {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter Code: ");
	        Code = sc.nextInt();
	        sc.nextLine(); // Consume newline

	        System.out.print("Enter Food Name: ");
	        FoodName = sc.nextLine();

	        System.out.print("Enter Sticker (Green, Yellow, Red): ");
	        Sticker = sc.nextLine();

	        GetType(); // Assign FoodType based on Sticker
	    }
	 
	 public void FoodOut() {
		 System.out.println("The Supply details are:-");
		 System.out.println("Code: "+Code);
		 System.out.println("Food Name: "+FoodName);
		 System.out.println("Sticker: "+Sticker);
		 System.out.println("Food Type: "+FoodType);
	}



}
