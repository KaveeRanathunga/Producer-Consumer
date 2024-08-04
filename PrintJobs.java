import javax.xml.namespace.QName;

public class PrintJobs {
    private static int printId = 0;
    private int id ;
    private String type = ".txt";


    public PrintJobs (String type){

        if(this.type != type){
            throw new  TypeNotSupportException("This is not a right type for printers.");
        }

        printId = printId+1;
        this.id = printId;
    }

    public String getName(){
        return ""+id;
    }

    public String getType() {
        return type;
    }
}
