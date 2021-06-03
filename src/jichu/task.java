package jichu;

import java.util.Scanner;

public class task {
public static void main(String[] args) {
int choice = menu();
float score[] = null;
while(choice != 5){
switch(choice){
case 1:
score = Input();
break;
case 2:
float average = Average(score);
if(average >= 0)
System.out.println("Average=" + average);
break;
case 3:
float max = Max(score);
if(max >= 0)
System.out.println("max=" + max);
break;
case 4:
float min = Min(score);
if(min >= 0)
System.out.println("min=" + min);
break;
default:
System.out.println("Invalid choise");
}
choice = menu();
}
System.out.println("Welcome visit again");
}
public static int menu(){
int choose = 0;

System.out.println("Student Score System:");
System.out.println("1.Enter Students Results");
System.out.println("2.Class Average");
System.out.println("3.Highest Grade");
System.out.println("4.Lowest Grade");
System.out.println("5.Exit");

Scanner scan = new Scanner(System.in);
choose = scan.nextInt();

return choose;
}
public static float[] Input(){
float score[] = new float[5];
Scanner scan = new Scanner(System.in);
for(int i = 0; i < score.length;){
score[i] = scan.nextFloat();
if(score[i] > 100 || score[i] < 0)
System.out.println("Please input valid data!");
else
i++;
}

return score;
}
public static float Average(float score[]){

if(score == null) {
System.out.println("Please enter the score first and then execute the function!");
return -1;
}
float sum = 0;

for(int i = 0; i < score.length; i++){
sum += score[i];
}

return sum / score.length;
}
public static float Max(float score[]){
if(score == null) {
System.out.println("Please enter the score first and then execute the function!");
return -1;
}
float max = score[0];

for(int i = 1; i < score.length; i++){
if(max < score[i]){
max = score[i];
}
}

return max;
}
public static float Min(float score[]){
if(score == null) {
System.out.println("Please enter the score first and then execute the function!");
return -1;
}
float min = score[0];

for(int i = 1; i < score.length; i++){
if(min > score[i]){
min = score[i];
}
}

return min;
}
}