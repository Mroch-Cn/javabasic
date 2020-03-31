public class CopyArray{
    public static void main(String[] args){
        String[] copyFrom = {"hhkd","cccc","apple","orange","nokia"};
        String[] copyTo = new String[4];
        System.arraycopy(copyFrom, 1, copyTo, 0, 4);
        int i;
        for (i = 0;i<copyTo.length;i++){
            System.out.println(copyTo[i]);
        }
        System.out.println(copyTo.length);

    }
}