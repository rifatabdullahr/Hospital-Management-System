
package ABhospital;


public class Patient implements ICheckReport {
    public void checkReport(Report obj){
        System.out.println(obj.id);     
    }
    
}
