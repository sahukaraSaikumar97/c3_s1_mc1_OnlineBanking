public class FurnitureMart {
    String colour;
    int grade;
    String location;
    String type;
    double cost;
    double discount;

    public void discount(){
        if(location == "outdoor"){
            double temp = cost-cost*5/100;
            System.out.println("total price = " + temp);
        }else
        {
            System.out.println("total price = " + cost);
        }
    }

    public void display(){
        System.out.println("location = " + location);
        System.out.println("colour = " + colour);
        System.out.println("grade = " + grade);
        System.out.println("type = " + type);

    }

    public static void main(String[] args) {
        FurnitureMart obj = new FurnitureMart();
        obj.location = "indoor";
        obj.colour = "red";
        obj.type = "chairs";
        obj.cost = 1000;
        obj.grade = 3;
        obj.display();
        obj.discount();
    }







}
