import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class FitnessApp { static double weight; static double height; static double waist; static  double hip;
	static String birthdate;	static String gender; static int restingheart; static FitnessAssessment fitnessassessment;
	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter birthdate (YYYY-MM-DD): ");
		 birthdate=scanner.nextLine();		

		
		System.out.println("Enter gender (f)emale/(m)ale: ");
		 gender=scanner.nextLine();
		
		System.out.println("Enter height(m) weight(kg): ");
		String heightweight=scanner.nextLine();
		height=Double.valueOf(heightweight.split(" ")[0]);
		weight=Double.valueOf(heightweight.split(" ")[1]);

		System.out.println("Enter waist and hip measurments (cm): ");
		String waisthip=scanner.nextLine();
		waist=Double.valueOf(waisthip.split(" ")[0]);
		hip=Double.valueOf(waisthip.split(" ")[1]);

		System.out.println("Enter resting heart rate: ");
		String restingheartstr=scanner.next(); 
				
		restingheart=Integer.valueOf(restingheartstr);
		fitnessassessment=new FitnessAssessment();
		 fitnessassessment.setBirthDate(birthdate);



		show();

	}
	private static void show() {
		while(true){
		System.out.println("--------------MENU--------------\r\n"
				+ "1 - Calculate Target Heart Rate\r\n"
				+ "2 - Calculate Waist/Hip Ratio\r\n"
				+ "3 - Body Mass Index\r\n"
				+ "4 - Display Fitness Level\r\n"
				+ "5 - Quit\r\n"
				+ "Enter choice:");
			Scanner scanner= new Scanner(System.in);
			Integer choice=scanner.nextInt();

			if(choice==1) {
				int age=fitnessassessment.calculateAge(fitnessassessment.getlocaldate());
				double targetheartrate=fitnessassessment.calculateTargetHeartRate(age);
				System.out.println("Target Heart Rate: "+targetheartrate);
				System.out.println();
				}
			else if(choice==2) {
				double waishipratio=fitnessassessment.calculateWaistHipRatio(waist, hip);
				System.out.println("Waist/Hip Ratio: "+waishipratio);
				System.out.println();

			}
			else if(choice==3) {
				double bmi=fitnessassessment.calculateBMI(weight, height);
				BigDecimal bmidecimal=new BigDecimal(bmi).setScale(1, RoundingMode.HALF_EVEN);
				String category=fitnessassessment.findBMICategory(bmi);
				System.out.println("Your BMI is: "+bmidecimal+" Category: "+category);
				System.out.println();

			}
			else if(choice==4) {
				double bmi=fitnessassessment.calculateBMI(weight, height);
				double waishipratio=fitnessassessment.calculateWaistHipRatio(waist, hip);
				String fitnesslevel=fitnessassessment.determineFitnessLevel(bmi, restingheart, waishipratio, gender);
				System.out.println("Your fitness level is: "+fitnesslevel);
				System.out.println();

			}
			else if(choice==5) {
				break;
			}
		}}
	

}
