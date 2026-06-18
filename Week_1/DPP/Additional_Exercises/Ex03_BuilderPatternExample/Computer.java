public class Computer{
String cpu,ram,storage;
private Computer(Builder b){cpu=b.cpu;ram=b.ram;storage=b.storage;}
public String toString(){return cpu+" "+ram+" "+storage;}
static class Builder{
String cpu,ram,storage;
Builder setCPU(String c){cpu=c;return this;}
Builder setRAM(String r){ram=r;return this;}
Builder setStorage(String s){storage=s;return this;}
Computer build(){return new Computer(this);}
}}