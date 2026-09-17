//public class vehicle {
//
//
//public String name;
//public String model;
//public int noOftyres;
//
//
//    vehicle(){
//        this.name = "";
//        this.model = "";
//        this.noOftyres = -1;
//    }
//
//
//vehicle(String name, String model, int noOftyres){
//    this.name = name;
//    this.model = model;
//    this.noOftyres = noOftyres;
//}
//
//void startEngine(){
//    System.out.printf("Engine is starting of %s : %s\n", name, model);
//}
//
//void stopEngine(){
//    System.out.printf("Engine is stoping of %s : %s\n", name, model);
//}
//
//}


public class vehicle{
    public String name;
    public String model;
    public int noOfTyres;

    vehicle(){
        this.name="";
        this.model="";
        this.noOfTyres=-1;
    }

    vehicle(String name, String model, int noOfTyres){
        this.name = name;
        this.model=model;
        this.noOfTyres=noOfTyres;
    }
    void startengine(){
        System.out.printf("Engine is starting of %s : %s\n", name, model);
    }

    void stopengine(){
        System.out.printf("Engine is stoping of %s : %s\n", name, model);
    }
