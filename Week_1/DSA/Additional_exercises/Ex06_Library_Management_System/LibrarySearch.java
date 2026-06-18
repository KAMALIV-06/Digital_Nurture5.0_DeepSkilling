public class LibrarySearch{
 static int linear(Book[] b,String key){
  for(int i=0;i<b.length;i++) if(b[i].title.equals(key)) return i; return -1;
 }
 static int binary(Book[] b,String key){
  int l=0,r=b.length-1;
  while(l<=r){int m=(l+r)/2; int c=b[m].title.compareTo(key);
   if(c==0) return m; if(c<0) l=m+1; else r=m-1;}
  return -1;
 }
 public static void main(String[] args){ System.out.println("Library Search"); }
}