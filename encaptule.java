public class encaptule {
    public static void main(String[] args) {
        area a1=new area(10,20);
        int areac=a1.calculateareas();
        System.out.println("area is"+areac);
        
    }
    
}

class area{

    private int length;
    private int breadth;
    area(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public void setLength(int length){
        this.length = length;
    }
    public int getbreadth(){
        return this.breadth;}
        public int calculateareas(){
            int area = this.breadth*this.length;
            return area;
        }
}

