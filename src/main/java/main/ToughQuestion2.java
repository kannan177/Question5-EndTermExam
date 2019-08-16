package main;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class ToughQuestion2 {
            public static void main(String[] args) throws NumberFormatException, IOException {
                        int bread;
                        int butter;
                        int jam;
                        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                        Calories cal=new Calories();
                        System.out.println("1.Bread only\n2.Bread+Jam\n3.Bread+Jam+Butter");
                        System.out.println("Enter the choice");
                        int choice = Integer.parseInt(br.readLine());
                        switch(choice)
                        {
                        case 1 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	//call the function which calculate the calories for only bread
                        	System.out.printf("%.3f",cal.calculateEnergy(cal.calculateCalories(bread)));
                        	System.out.println(" kJ of energy generated from " + cal.returnCalories()+" calories");
                        	break;
                        case 2 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Jam");
                        	jam = Integer.parseInt(br.readLine());
                        	//call the function which calculate the calories for only bread & jam
                        	System.out.printf("%.3f",cal.calculateEnergy(cal.calculateCalories(bread, jam)));
                        	System.out.println(" kJ of energy generated from " + cal.returnCalories()+" calories");
                        	break;
                        case 3 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Jam");
                        	jam = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Butter");
                        	butter = Integer.parseInt(br.readLine());
                        	//call the function which calculate the calories for  bread,jam & butter
                        	System.out.printf("%.3f",cal.calculateEnergy(cal.calculateCalories(bread, jam, butter)));
                        	System.out.println(" kJ of energy generated from " + cal.returnCalories()+" calories");
                        	break;
                        }
                        //System.out.printf("%.3f",ca.calculateEnergy());
                        //System.out.println(" kJ of energy generated from "+ca.returnCalories()+" calories");
            }
}
class Calories {
            private int calories;
            public int calculateCalories(int nBread) {
            	calories = 74 * nBread;
            	return calories;
            }
            
            public int calculateCalories(int nBread, int nJam) {
                	calories = 74 * nBread + 26 * nJam;
                	return calories;
                }
            public int calculateCalories(int nBread, int nJam, int nButter) {
                //you have to overload this function for three parameters refer the question
                	calories = 74 * nBread + 26 * nJam + 102 * nButter;
                	return calories;
                }
            public double calculateEnergy(int calorie) {
            	// Given 1Kcal = 4.1868 KJ
            	// So, 1 calorie = 4.168 J
            	// So, n calorie = n * 4.186 J = n * 4.186 / 1000 KJ
            	return calorie * 4.1868 / 1000;
            }
            public int returnCalories() {
            	return calories;
            }
            
            
            
}