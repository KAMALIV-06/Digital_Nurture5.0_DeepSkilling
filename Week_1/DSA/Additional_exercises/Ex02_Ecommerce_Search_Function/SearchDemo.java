public class SearchDemo{
 static int linearSearch(Product[] p,String key){
  for(int i=0;i<p.length;i++) if(p[i].productName.equals(key)) return i; return -1;
 }
 static int binarySearch(Product[] p,String key){
  int l=0,r=p.length-1;
  while(l<=r){int m=(l+r)/2; int c=p[m].productName.compareTo(key);
   if(c==0) return m; if(c<0) l=m+1; else r=m-1;}
  return -1;
 }
 public static void main(String[] args){ System.out.println("Search Demo"); }
}