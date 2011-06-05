/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MobileTemplate;

/**
 *
 * @author oscarrodriguez
 */
public class AndroidTemplate {
    
    public AndroidTemplate()
    {
    }
    
    
    
    public String createNBProject(String name)
    {
        String template="";
        template+="<?xml version='1.0' encoding='UTF-8'?>"+"\n";
        template+="<projectDescription>"+"\n";
	template+="<name>"+name+"</name>"+"\n";
	template+="<comment></comment>"+"\n";
	template+="<projects>"+"\n";
	template+="</projects>"+"\n";
	template+="<buildSpec>"+"\n";
	template+="	<buildCommand>"+"\n";
	template+="		<name>com.android.ide.eclipse.adt.ResourceManagerBuilder</name>"+"\n";
	template+="		<arguments>"+"\n";
	template+="		</arguments>"+"\n";
	template+="	</buildCommand>"+"\n";
	template+="	<buildCommand>"+"\n";
	template+="		<name>com.android.ide.eclipse.adt.PreCompilerBuilder</name>"+"\n";
	template+="		<arguments>"+"\n";
	template+="		</arguments>"+"\n";
	template+="	</buildCommand>"+"\n";
	template+="	<buildCommand>"+"\n";
	template+="		<name>org.eclipse.jdt.core.javabuilder</name>"+"\n";
	template+="		<arguments>"+"\n";
	template+="		</arguments>"+"\n";
	template+="	</buildCommand>"+"\n";
	template+="	<buildCommand>"+"\n";
	template+="		<name>com.android.ide.eclipse.adt.ApkBuilder</name>"+"\n";
	template+="		<arguments>"+"\n";
	template+="		</arguments>"+"\n";
	template+="	</buildCommand>"+"\n";
	template+="</buildSpec>"+"\n";
	template+="<natures>"+"\n";
	template+="	<nature>com.android.ide.eclipse.adt.AndroidNature</nature>"+"\n";
	template+="	<nature>org.eclipse.jdt.core.javanature</nature>"+"\n";
	template+="</natures>"+"\n";
        template+="</projectDescription> "+"\n";
        return template;
    }
    
    
    public String CreateValues(String name)
    {
        String template="";
        template+="<?xml version='1.0' encoding='utf-8'?>"+"\n";
        template+="<resources>"+"\n";
        template+="<string name='hello'>Hello World, AndroidExample!</string>"+"\n";
        template+="<string name='app_name'>"+name+"</string>"+"\n";
        template+="</resources>"+"\n";
        return template;
    }
    
    public String CreateMain()
    {
        String template="";
        template+="<?xml version='1.0' encoding='utf-8'?>"+"\n";
        template+="<LinearLayout xmlns:android='http://schemas.android.com/apk/res/android'"+"\n";
        template+="android:orientation='vertical'"+"\n";
        template+="android:layout_width='fill_parent'"+"\n";
        template+="android:layout_height='fill_parent'>"+"\n";
        template+="<TextView"+"\n"; 
        template+="android:layout_width='fill_parent'"+"\n"; 
        template+="android:layout_height='wrap_content'"+"\n"; 
        template+="android:text='@string/hello'"+"\n";
        template+="/>"+"\n";
        template+="</LinearLayout>"+"\n";
        return template;            
    }
    
    public String CreateAndroidManifes(String package_name,String app_name)
    {
        String template="<?xml version='1.0' encoding='utf-8'?>"+"\n";
        
        template+="<manifest xmlns:android='http://schemas.android.com/apk/res/android'"+"\n";
        template+="package='"+package_name+"'"+"\n";
        template+="android:versionCode='1'"+"\n";
        template+="android:versionName='1.0'>"+"\n";
        template+="<application android:icon='@drawable/icon' android:label='@string/app_name'>"+"\n";
        template+="<activity android:name='."+app_name+"'"+"\n";
        template+="android:label='@string/app_name'>"+"\n";
        template+="<intent-filter>"+"\n";
        template+="<action android:name='android.intent.action.MAIN' />"+"\n";
        template+="        <category android:name='android.intent.category.LAUNCHER' />"+"\n";
        template+="       </intent-filter>"+"\n";
        template+=" </activity>"+"\n";
        template+=" </application>"+"\n";
        template+="<uses-sdk android:minSdkVersion='7' />"+"\n";
        template+="</manifest>"+"\n";
        return template;
    }
    
    
    public String CreateActiviy(String name,String package_name,String layout)
    {
        String template="";
        template += "package "+package_name+";" + "\n";
        template += "import android.app.Activity;" + "\n";
        template += "import android.os.Bundle;" + "\n"+ "\n";
        template += "public class "+name+" extends Activity {" + "\n";
        template += "    /** Called when the activity is first created. */" + "\n";
        template += "    @Override" + "\n";
        template += "    public void onCreate(Bundle savedInstanceState) {" + "\n";
        template += "        super.onCreate(savedInstanceState);" + "\n";
        template += "        setContentView(R.layout."+layout+");" + "\n";
        template += "    }" + "\n";
        template += "}" + "\n";
        return template;
    }
    
    
    public String Create_R_File(String package_name)
    {  
        
        String template="";
        template += " /* AUTO-GENERATED FILE.  DO NOT MODIFY." + "\n";
        template += "*" + "\n";
        template +="* This class was automatically generated by the" + "\n";
        template +="* aapt tool from the resource data it found.  It"+"\n";
        template+="* should not be modified by hand."+"\n";
        template+=" */"+"\n";
        template+="package "+package_name+";"+"\n"+"\n";
        template+="public final class R {"+"\n";
        template+="public static final class attr {"+"\n";
        template+=" }"+"\n";
        template+="}"+"\n";
        return template; 
    }
    
    
    public String creatLoginPageView()
    {
        String template="";
    
        template+="<?xml version='1.0' encoding='utf-8'?>"+"\n";
        template+="<RelativeLayout xmlns:android='http://schemas.android.com/apk/res/android'"+"\n";
	template+="android:layout_width='fill_parent' android:layout_height='fill_parent'"+"\n";
	template+="android:paddingLeft='30px' android:paddingRight='30px'>"+"\n";
	template+="<LinearLayout android:id='@+id/header'"+"\n";
	template+="android:orientation='horizontal' android:layout_width='fill_parent'"+"\n";
	template+="android:layout_height='wrap_content' android:layout_marginTop='10px'"+"\n";
	template+="android:layout_marginBottom='20px' android:weightSum='1.0'>"+"\n";
	template+="</LinearLayout>"+"\n";
	template+="<LinearLayout android:id='@+id/layout_forms'"+"\n";
	template+="android:layout_below='@+id/header' android:orientation='vertical'"+"\n";
	template+="android:layout_width='fill_parent' android:layout_height='wrap_content'"+"\n";
	template+="android:layout_marginTop='15px' android:weightSum='1.0'>"+"\n";
	template+="<TextView android:id='@+id/label_username'"+"\n";
	template+="android:layout_width='fill_parent' android:layout_height='wrap_content'"+"\n";
	template+="android:textColor='@color/color_text' android:textStyle='bold' android:text='Email' />"+"\n";
        
        template+="<EditText android:id='@+id/username' android:layout_width='fill_parent'"+"\n";
	template+="android:lines='1' android:layout_height='wrap_content'"+"\n";
	template+="android:background='@android:drawable/editbox_background'"+"\n";
	template+="android:layout_below='@id/label_username'"+"\n";
	template+="android:layout_marginBottom='10px' />"+"\n";

        template+="<TextView android:id='@+id/label_password'"+"\n";
        template+="android:layout_width='fill_parent' android:layout_height='wrap_content'"+"\n";
        template+="android:text='Password' android:textStyle='bold' android:textColor='@color/color_text'"+"\n";
        template+="android:layout_below='@id/username' />"+"\n";

        template+="<EditText android:id='@+id/password' android:layout_width='fill_parent'"+"\n";
        template+="android:inputType='textPassword' android:layout_height='wrap_content'"+"\n";
        template+="android:background='@android:drawable/editbox_background'"+"\n";
        template+="android:layout_marginBottom='10px' android:layout_below='@id/label_password' />"+"\n";

        template+="<LinearLayout android:id='@+id/layout_buttons'"+"\n";
        template+="android:layout_width='fill_parent' android:layout_height='wrap_content'"+"\n";
        template+="android:layout_below='@id/password' android:layout_marginBottom='10px'"+"\n";
        template+="android:weightSum='1.0'>"+"\n";

        template+="<RelativeLayout android:layout_weight='.5'"+"\n";
        template+="android:layout_width='wrap_content' android:layout_height='wrap_content'>"+"\n";
        template+="<Button android:id='@+id/sign_up' "+"\n";
        template+="android:layout_width='wrap_content' android:layout_height='wrap_content'"+"\n";
        template+="android:layout_centerInParent='true' "+"\n";
        template+="android:layout_marginRight='1.5px'/>"+"\n";
        template+="</RelativeLayout>"+"\n";

        template+="<RelativeLayout android:layout_weight='.5'"+"\n";
	template+="android:layout_width='wrap_content' android:layout_height='wrap_content'>"+"\n";
	template+="<Button android:id='@+id/login_btn' "+"\n";
	template+="android:layout_marginLeft='1.5px'"+"\n";
	template+="android:layout_width='wrap_content' android:layout_height='wrap_content'"+"\n";
	template+="android:layout_centerInParent='true' />"+"\n";
	template+="</RelativeLayout>"+"\n";
	template+="</LinearLayout>"+"\n";
        template+="</LinearLayout>"+"\n";
        template+="</LinearLayout>"+"\n";
        template+="</RelativeLayout>"+"\n";
        
        return template;
    
    }
    
    
}
