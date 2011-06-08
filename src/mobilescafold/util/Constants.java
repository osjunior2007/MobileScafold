/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mobilescafold.util;


/**
 *
 * @author oscar rodriguez
 */
public class Constants {
    public static String GENERATE_APP="app";
    public static String GENERATE_FORM="form";
    public static String GENERATE_AUTHETICATE_PAGE="login";
    public static String GENERATE_SIMPLE_LIST="simple_list";
    public static String GENERATE_ICON_LIST="icon_list"; 
    public static String GENERATE_DESCRIPTION_VIEW="description_view";
    public static String GENERATE_MODELS="models";
    public static String MANIFEST="AndroidManifest.xml";
    
  
    public static String getCurrentPackageName(String path)
    {
        int i =0,sw=0,index=0;
        String src_path="";
        String package_name="";
        while(i<=path.length()-1&&sw==0)
        {
            if(!path.substring(i, i+1).equals(System.getProperty("file.separator"))){
                src_path+=path.substring(i, i+1);
            }else
            {
             
             if(src_path.equals("src"))
              {
               index=i;
               sw=1;
              }else{
                src_path="";
              }
            }
            i++;  
        }
       
        if(sw==1){
            i=index+1;
            while(i<=path.length()-1)
            {
                if(!path.substring(i, i+1).equals(System.getProperty("file.separator"))){
                    package_name+=path.substring(i, i+1);
                }else
                {
                 package_name+=".";   
                }
                i++; 
            }
           
        }else
        {
         package_name="";
        }   
         
        return package_name;
    }
    
    
    public static Boolean getPackageIdentifiers(String path)
    {
        int i=0,cont=0;
        while(i<=path.length()-1)
        {
             if(path.substring(i, i+1).equals("."))
             {
                cont++; 
             } 
           i++;  
        }
      return (cont>=1 ? true : false );
    }
    
    
}
