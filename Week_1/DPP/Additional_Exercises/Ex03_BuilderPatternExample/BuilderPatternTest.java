public class BuilderPatternTest{
public static void main(String[] a){
Computer c=new Computer.Builder().setCPU("i7").setRAM("16GB").setStorage("512GB").build();
System.out.println(c);}}