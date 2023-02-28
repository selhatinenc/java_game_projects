import java.time.LocalDate;
import java.time.Period;

public class FitnessAssessment {
	private  LocalDate localdate;
	public FitnessAssessment(){
		
	}
public void setBirthDate(String date) {
	int year= Integer.valueOf(date.split("-")[0]);
	int month= Integer.valueOf(date.split("-")[1]);
	int day= Integer.valueOf(date.split("-")[2]);
	localdate=LocalDate.of(year, month,day);
}
public String getBirthday() {
	return localdate.toString();
}
public double calculateMaxHeartRate(int age) {
	return 220-age;
	
}
public double	calculateTargetHeartRate(int age) {
	double result= (double) 85.0*calculateMaxHeartRate(age)/100;
	return result;
}
public double calculateWaistHipRatio(double waist,double hip) {
return waist/hip;	
}
public double calculateBMI(double weight ,double height) {
	return weight/(Math.pow(height, 2));
}
public String findBMICategory(double bmi){
	String bmicategory="null";
	if(bmi<20)
		bmicategory="Underweight";
	else if(bmi<25)
		bmicategory="Normal";
	else if(bmi<30)
			bmicategory="Overweight";
	else
		bmicategory="Obese";
	return bmicategory;
}
public int calculateAge(LocalDate date) {
	Period age = Period.between(date, LocalDate.now());
	return age.getYears();

}
public String 	determineFitnessLevel(double bmi,int restingheartrate,double waisthipratio,String gender) {
	String fitnesslevel = null;
	int fitnessindicators=0;
	if(bmi<=24 && bmi>=20)
		fitnessindicators+=1;
	if(restingheartrate<70)
		fitnessindicators+=1;
	if(gender.equals("f")) {
		if(waisthipratio<0.9)
			fitnessindicators+=1;
	}
	else {
		if(waisthipratio<1.0)
			fitnessindicators+=1;
		
	}
	switch(fitnessindicators) {
	case 0: fitnesslevel="POOR";                   break;

	case 1:fitnesslevel="AVERAGE";                  break;

	case 2:fitnesslevel="GOOD";                  break;

	case 3:fitnesslevel="EXCELLENT";                   break;



	}
	return fitnesslevel;
	
}
public LocalDate getlocaldate() {
	return localdate;
	
}

}
