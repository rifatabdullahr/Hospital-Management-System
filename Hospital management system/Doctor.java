
package ABhospital;


 abstract public class Doctor implements ICheckReport {
    public void checkReport(Report obj){
        System.out.println(obj.id);
        
    }
    abstract void writePrescriprion();
        
    }
    

