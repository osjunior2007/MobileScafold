/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Generator;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import mobilescafold.FileManager;
import mobilescafold.util.InputData;
import MobileTemplate.AndroidTemplate;
import mobilescafold.util.XmlParser;
import static mobilescafold.util.Constants.*;

public class Generator {
   
    public  static String DIR_PWD="";
    public  static String PROJECT_NAME="";
    public  static String PACHAGE_NAME=""; 
    public  static InputData data;
    public  static FileManager fileManager;
    public  static AndroidTemplate androidTemplate;
    public  static XmlParser _xmlParser;
    
    public Generator()
    {
        fileManager=new FileManager();
        androidTemplate=new AndroidTemplate();
        _xmlParser=new XmlParser();
            
    }
    
    
    public void CreateApp(String PARENT_PATH,String PROJECT_NAME,String PACHAGE_NAME)
    {
            DIR_PWD=System.getProperty("user.dir");
            fileManager.CreateDirectory(DIR_PWD+"/"+PROJECT_NAME);
            fileManager.CreateFile(DIR_PWD+"/"+PROJECT_NAME+"/AndroidManifest.xml", androidTemplate.CreateAndroidManifes(PACHAGE_NAME,PACHAGE_NAME));
            fileManager.CreateFile(DIR_PWD+"/"+PROJECT_NAME+"/defaul.property", "target=android-7");
            fileManager.CreateFile(DIR_PWD+"/"+PROJECT_NAME+"/.classpath", "");
             fileManager.CreateFile(DIR_PWD+"/"+PROJECT_NAME+"/.project",androidTemplate.createNBProject(PROJECT_NAME));
            fileManager.CreateDirectory(DIR_PWD+"/"+PROJECT_NAME+"/assets");
            fileManager.CreateDirectory(DIR_PWD+"/"+PROJECT_NAME+"/gen");
            fileManager.CreateDirectory(DIR_PWD+"/"+PROJECT_NAME+"/src");
            fileManager.CreateDirectory(DIR_PWD+"/"+PROJECT_NAME+"/res");
            fileManager.CreateDirectory(DIR_PWD+"/"+PROJECT_NAME+"/res/drawable");
            fileManager.CreateDirectory(DIR_PWD+"/"+PROJECT_NAME+"/res/drawable-ldpi");
            fileManager.CreateDirectory(DIR_PWD+"/"+PROJECT_NAME+"/res/drawable-hdpi");
            fileManager.CreateDirectory(DIR_PWD+"/"+PROJECT_NAME+"/res/drawable-mdpi");
            fileManager.CreateDirectory(DIR_PWD+"/"+PROJECT_NAME+"/res/layout");
            fileManager.CreateFile(DIR_PWD+"/"+PROJECT_NAME+"/res/layout/main.xml",androidTemplate.CreateMain());
            fileManager.CreateDirectory(DIR_PWD+"/"+PROJECT_NAME+"/res/values");
            fileManager.CreateFile(DIR_PWD+"/"+PROJECT_NAME+"/res/values/strings.xml",androidTemplate.CreateValues(PROJECT_NAME));
            fileManager.copyfile(PARENT_PATH+"/images/icon72x72.png",DIR_PWD+"/"+PROJECT_NAME+"/res/drawable-hdpi/icon.png");
            fileManager.copyfile(PARENT_PATH+"/images/icon48x48.png",DIR_PWD+"/"+PROJECT_NAME+"/res/drawable-mdpi/icon.png");
            fileManager.copyfile(PARENT_PATH+"/images/icon36x36.png",DIR_PWD+"/"+PROJECT_NAME+"/res/drawable-ldpi/icon.png");
            
            //Create the Package Folder
            data=new InputData();
            data.createPackageGen(DIR_PWD+"/"+PROJECT_NAME+"/gen/",PACHAGE_NAME);
            data.createPackageFolder(DIR_PWD+"/"+PROJECT_NAME+"/src/",PACHAGE_NAME);
            fileManager.CreateFile(DIR_PWD+"/"+PROJECT_NAME+"/src/"+data.getPackagePath(PACHAGE_NAME)+"/"+PROJECT_NAME+".java",androidTemplate.CreateActiviy(PROJECT_NAME,PACHAGE_NAME,"main"));
            fileManager.CreateFile(DIR_PWD+"/"+PROJECT_NAME+"/gen/"+data.getPackagePath(PACHAGE_NAME)+"/R.java",androidTemplate.Create_R_File(PACHAGE_NAME));
            
    }
    
    public void LoginPage(String ActivityName,String PackageName)
    {
          data=new InputData();
          _xmlParser.addActivity(System.getProperty("user.dir")+"/"+MANIFEST,ActivityName);
          data.createPackageFolder(System.getProperty("user.dir")+"/src",PackageName); 
          fileManager.CreateFile(System.getProperty("user.dir")+"/src/"+data.getPackagePath(PackageName)+"/"+ActivityName+".java",androidTemplate.CreateActiviy(ActivityName,PackageName,ActivityName.toLowerCase()));
          
     }
    
    
}
