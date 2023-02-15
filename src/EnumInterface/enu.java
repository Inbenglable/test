package EnumInterface;

public enum enu {
    a("EnumInterface",1),b("b",2),c("c",3),d("d",4);

    public String name;
    public int number;
   private enu(String name, int number){
        this.number=number;
        this.name=name;
    }
}