public class SortingOrders{
 static void bubbleSort(Order[] a){
  for(int i=0;i<a.length-1;i++) for(int j=0;j<a.length-i-1;j++)
   if(a[j].totalPrice>a[j+1].totalPrice){Order t=a[j];a[j]=a[j+1];a[j+1]=t;}
 }
 static int partition(Order[] a,int low,int high){
  double pivot=a[high].totalPrice; int i=low-1;
  for(int j=low;j<high;j++) if(a[j].totalPrice<pivot){i++; Order t=a[i];a[i]=a[j];a[j]=t;}
  Order t=a[i+1];a[i+1]=a[high];a[high]=t; return i+1;
 }
 static void quickSort(Order[] a,int low,int high){
  if(low<high){int pi=partition(a,low,high); quickSort(a,low,pi-1); quickSort(a,pi+1,high);}
 }
 public static void main(String[] args){ System.out.println("Sorting Orders"); }
}