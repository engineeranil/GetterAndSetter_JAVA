public class GetterSetterDemo {
    private String name;
    public int year;

    public GetterSetterDemo(String name,int year){
        this.name=name;
        this.year=year;
    }

    public void print(){
        System.out.println("REISIN ADI : "+this.name);
        System.out.println("REISIN YASI : "+this.year);
    }

    public String getName(){
            return this.name;
    }
    void setName(String a){
        this.name=a;
    }


}
