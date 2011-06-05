/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mobilescafold.util;
import mobilescafold.FileManager;
import mobilescafold.FileManager.*;

public class InputData {
    
    public  static FileManager fileManager;
    
    public InputData()
    {
        fileManager=new FileManager();
    }
    
    public String getPackagePath(String name)
    {
        
        String folder_name="";   
        for(int i=0;i<=name.length()-1;i++)
        {
            if(!name.substring(i,i+1).equals("."))
            {
                folder_name+=name.substring(i,i+1);
     
            }else
            {
              folder_name+="/";
            }
        }
        return folder_name;
    }
    
    
    public void createPackageGen(String PWD,String name)
    {
        String folder_name="";   
        for(int i=0;i<=name.length()-1;i++)
        {
            if(!name.substring(i,i+1).equals("."))
            {
                folder_name+=name.substring(i,i+1);
     
            }else
            {
              fileManager.CreateDirectory(PWD+"/"+folder_name);
              PWD+="/"+folder_name;
              folder_name="";
              
            }
        }
        
       fileManager.CreateDirectory(PWD+"/"+folder_name);
    }
    
    
    public void createPackageFolder(String PWD,String name)
    {
        String folder_name=""; 

        for(int i=0;i<=name.length()-1;i++)
        {
            if(!name.substring(i,i+1).equals("."))
            {
                folder_name+=name.substring(i,i+1);
     
            }else
            {
              fileManager.CreateDirectory(PWD+"/"+folder_name);
              PWD+="/"+folder_name;
              folder_name="";
              
            }
        }
        
       fileManager.CreateDirectory(PWD+"/"+folder_name);
    }
    
}
