
public class homework2 {

    static void bubbleSort(int[] vanzator) {
        int n = vanzator.length;
        int temp = 0;

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < (n -i - 1); j++) {
                if (vanzator[j] < vanzator[j+1]) {
                    temp = vanzator[j];
                    vanzator[j] = vanzator[j+1];
                    vanzator[j+1] = temp;
                }
            }
        }
    }
    public static void main(String args[]) {
       int number_of_sales[] = {10, 22, 15, 17};
        int quota_sales[] = {100, 220, 150, 170};


        int vanzator1 = number_of_sales[1] * quota_sales[1];
        int vanzator2 = number_of_sales[2]* quota_sales[3];
        int vanzator3 = number_of_sales[0]* quota_sales[3];
        int vanzator4 = number_of_sales[1]*quota_sales[2];


        int vanzator[]={vanzator1,vanzator2,vanzator3,vanzator4};


        System.out.println("inainte de sortare");
        for(int i=0;i<vanzator.length;i++){
            System.out.print(vanzator[i]+" ");
        }

        bubbleSort(vanzator);
        System.out.println("dupa sortare");
        for(int i=0;i<vanzator.length;i++)
        {
            System.out.print(vanzator[i]+" ");
        }
    }

}
