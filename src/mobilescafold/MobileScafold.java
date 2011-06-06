/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mobilescafold;
import Generator.Generator;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static mobilescafold.util.Constants.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MobileScafold {

    public  static String GENERATE="";
    public  static String DIR_PWD="";
    public  static String PROJECT_NAME="";
    public  static String PACHAGE_NAME=""; 
    public  static String ACTIVITY_NAME=""; 
    public static  Boolean sw=false;
    public static Generator generator;
    
    public static void main(String[] args) {
            sw=false;
            GENERATE=args[0];
            DIR_PWD=System.getProperty("user.dir");    
	    PROJECT_NAME=(args.length>=2 ? args[1] : "MobileExample" ); 
            PACHAGE_NAME=(args.length>=3 ? args[2] : "com.example.MobileExample" ); ; 
            Matcher mat=null;
            Pattern pat=Pattern.compile("\\|([0-9]|([0-1][0-9])|(2[0-3]))\\:[0-5][0-9]\\|");
            //mat=pat.matcher(line);
            //if(!mat.find()){
            
            generator=new Generator();
            
            
            if(GENERATE.equals(GENERATE_APP))
            {
                sw=true;
                DIR_PWD=new File(System.getProperty("java.class.path" )).getParent();
                generator.CreateApp(DIR_PWD, PROJECT_NAME, PACHAGE_NAME);
            
            
            }
            
            if(GENERATE.equals(GENERATE_AUTHETICATE_PAGE))
            {
                sw=true; 
                if(new File(".project").exists()){
                  ACTIVITY_NAME=(args.length>=2 ? args[1] : "LoginPage" );
                  PACHAGE_NAME=(args.length>=3 ? args[2] : PACHAGE_NAME );
                  generator.LoginPage(ACTIVITY_NAME,PACHAGE_NAME);
                }else
                {
                   sw=false;
                   System.out.println("It is not a  Android Project. ");
                   
                } 
           }
            
            if(GENERATE.equals(GENERATE_FORM))
            {
               sw=true;
               String package_name=getCurrentPackageName(System.getProperty("user.dir"));
               if(getPackageIdentifiers(package_name)){
                   System.out.println(package_name);
               }else
               {
                System.out.println("Package name must have at least two identifiers");   
                sw=false;  
               }
            } 
            
     
                
        System.out.println(sw==true ? "Project Crated Succesful." : "Command not found.");
    } 
}
