/**
 * 循环语句for语句以及数组的遍历
 */

public class DataType{
    public static void main (String[] args){
        int[] intArray = new int[10];
        int i,a=0;
        for (i=0;i<10;i++){
            intArray[i] =  a;
            a++;
            System.out.println(intArray[i]);
        }
        System.out.println("the length of this Int ArrayList is "+intArray.length);
        
    }
}