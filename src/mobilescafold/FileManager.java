/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mobilescafold;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class FileManager {
    
    public FileManager()
    {
    }
    
    
    public void CreateDirectory(String Path)
    {
      if(!new File(Path).exists()){  
       if(!new File(Path).mkdir())
       {
        System.out.println("The Directory "+Path+" not was created.");
       }   
      } 
    }
    
    public void RenameDirectory(String path_origin,String path_dest)
    {
        File f1 = new File(path_origin);
        File f2 = new File(path_dest);
        if(f1.renameTo(f2))
        {
          System.out.println("The file has been renamed correctly.");   
        }else
        {
         System.out.println("Operation faied, the file can't be renamed.");
        }
    
    }
    
    
    
    public static void copyfile(String srFile, String dtFile){
    try{
          InputStream in = new FileInputStream(srFile);
          OutputStream out = new FileOutputStream(dtFile);

        // Transfer bytes from in to out
        byte[] buf = new byte[1024];
        int len;
        while ((len = in.read(buf)) > 0) {
            out.write(buf, 0, len);
        }
          in.close();
         out.close();
        }
        catch(FileNotFoundException ex){
          System.out.println(ex.getMessage() + " in the specified directory.");
          System.exit(0);
        }
        catch(IOException e){
          System.out.println(e.getMessage());      
        }
  }
    
    
    
    public void CreateFile(String Path,String content)
    {
        try {
            FileWriter fichero = new FileWriter(Path);
            fichero.write(content+ "\r\n"); 
            // Cierras el fichero 
            fichero.close();  
        } catch (IOException ex) {
            Logger.getLogger(MobileScafold.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
}
