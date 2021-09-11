import java.util.*;
public class MyClass {
public static void main(String[] args)  
{  
Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
System.out.println("Enter the quantifier or the list of numbers");
System.out.println("After entering the list please Enter percentile to be computed");
int a = sc.nextInt(); 
List<Integer> checkList = new ArrayList<>(); 
for(int i = 0; i < a;i++){
	checkList.add(sc.nextInt());
}
int percentile = sc.nextInt();  
System.out.println(checkList);
int min = findMin(checkList); 
System.out.println("The min value is: " + min);
int max = findMax(checkList);
System.out.println("The max value is: " + max);
double avg = findAvg(checkList); 
System.out.println("The avg value is: " + avg);
double median = findMedian(checkList, checkList.size());
System.out.println("The median value is: " + median);
int newPercentile = findPercentile(checkList, percentile);
System.out.println("The percentile value is: " + newPercentile);
}  
public static int findMin(List<Integer> list){
int min = Integer.MAX_VALUE;
	for(int i : list){
      if(i < min){
      min = i;
      }
	}
	return min;
}
public static int findMax(List<Integer> list){
int max = Integer.MIN_VALUE;
	for(int i : list){
      if(i > max){
      max = i;
      }
	}
	return max;
}
public static double findAvg(List<Integer> list){
int sum = 0;
	for(int i : list){
     sum += i;
	}
	return (double) (sum/list.size());
}
public static double findMedian(List<Integer> list, int size){
 Collections.sort(list);
 int middle=size/2;
  if((size%2)==0){
   double res=(list.get(middle-1)+list.get(middle))/2;
   return res;
  }
  return (double)list.get(middle);      
}
public static int findPercentile(List<Integer> list, double percentile) {
    Collections.sort(list);
    int index = (int) Math.ceil(percentile / 100.0 * list.size());
    return list.get(index-1);
}
}  