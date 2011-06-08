/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MobileTemplate;

/**
 *
 * @author oscarrodriguez
 */
public class ComponentTemplate {
    
    
    public ComponentTemplate()
    {
    }
    
    
    public String createTextView(String text,String id)
    {
        String view="";
        view="<TextView android:id='@+id/label_"+id+"'"+"\n";
	view+="android:layout_width='fill_parent' android:layout_height='wrap_content'"+"\n";
	view+="android:textColor='@color/color_text' android:textStyle='bold' android:text='"+text+"' />"+"\n";
        return view;
    }
    
    public String createEditView(String text,String id)
    {
         String view="";
         view="<EditText android:id='@+id/"+id+"' android:layout_width='fill_parent'"+"\n";
	 view+="android:lines='1' android:layout_height='wrap_content'"+"\n";
	 view+="android:background='@android:drawable/editbox_background'"+"\n";
	 view+="android:layout_below='@id/label_"+text+"'"+"\n";
	 view+="android:layout_marginBottom='10px' />"+"\n";
         return view;
    }
    
    public String createCheckBox(String text,String id)
    {
        String view="";
        view+="<CheckBox"+"\n";
        view+="android:id='@+id/"+id+"' android:layout_width='wrap_content'"+"\n";
        view+="android:layout_width='fill_parent' android:text='"+text+"'"+"\n";
        view+="android:layout_height='wrap_content'/>"+"\n";
        return view;
    }
    
    public String createRadioButton(String text,String id)
    {
        String view="";
        view+="<RadioButton"+"\n";
        view+="android:id='@+id/"+id+"' android:layout_width='wrap_content'"+"\n";
        view+="android:layout_width='fill_parent' android:text='"+text+"'"+"\n";
        view+="android:layout_height='wrap_content'/>"+"\n";
        return view;
    }
    
  
    
    
    public String createButton(String text,String id)
    {
       String view="";
       view="<Button android:id='@+id/"+id+"' android:text='"+text+"' android:background='@drawable/sign_up_selector'"+"\n";
       view+="android:layout_width='wrap_content' android:layout_height='wrap_content'"+"\n";
       view+="android:layout_centerInParent='true'" +"\n";
       view+="android:layout_marginRight='1.5px'/>"+"\n";
       return view;
   } 
    
   
   public String createForm()
   {
     return "";  
   }
    
    
}
