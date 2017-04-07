package biz;

import java.net.HttpURLConnection;
import util.StatusCode;
import java.net.URL;
import java.net.URLEncoder;

import com.sendgrid.SendGrid;
import com.sendgrid.SendGridException;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("key="+System.getenv("JAVA_HOME"));
		String[] recipient=new String[2];
		recipient[0]="8726237064";
		recipient[1]="8181873893";
		//recipient[2]="8726237064";
		  StringBuilder recipientList = new StringBuilder();
          
		         int i = 0;
		                      for ( String phone : recipient )
		                      {
		                      	if ( i> 0) recipientList.append(',');
		                      	recipientList.append(phone);
		                      	i++;
		                      	
		                      }
		  System.out.println(recipientList.toString());
		System.out.println(sendSms(recipientList.toString(),"hi i wants to meet u "));
		String[] recipient2=new String[1];
		recipient2[0]="shiva280295@gmail.com";
		String message="hi";
		String subject="testing";
		System.out.println("mailstatus="+sendMail(recipient2,   message,  subject));

	}
	
	public  static StatusCode sendSms(String recipientList,  String message)
	{     
    	String str;
    	StatusCode status = StatusCode.UnknownError;
    	
            try {
                    
                    String un = "healthok";
                    String p = "qwert123";
                    String originator = "HLTHOK";
                    
                    
                    String requestUrl  = "http://bhashsms.com/api/sendmsg.php?" +
        "&user=" + URLEncoder.encode(un, "UTF-8") +
        "&pass=" + URLEncoder.encode(p, "UTF-8") +
         "&sender=" + URLEncoder.encode(originator, "UTF-8") +
        "&phone=" + URLEncoder.encode(recipientList.toString(), "UTF-8") +
        
        "&text=" + URLEncoder.encode(message, "UTF-8") +
       "&priority=sdnd" +
        "&stype=normal";
      

        

                    URL url = new URL(requestUrl);
                    
                    System.out.println("url="+requestUrl.toString());
                    HttpURLConnection uc = (HttpURLConnection)url.openConnection();
                    str=uc.getResponseMessage();
                    System.out.println(str);

                    uc.disconnect();
                    status = StatusCode.Success;

            } catch(Exception ex) {
            	status = StatusCode.UnknownError;
                   str=ex.getMessage();
                   System.out.println("exception="+ex.toString());
             	

            }
            return status;
    }
	
	
public static StatusCode sendMail(String[] recipient,  String message, String subject)
    
    {
    	
    	SendGrid sendgrid = new SendGrid("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");
     SendGrid.Email email = new SendGrid.Email();
    	
    	
        String str;
    	StatusCode status = StatusCode.UnknownError;
        
    	
        StringBuilder recipientList = new StringBuilder();
        
int i = 0;
        for ( String emailId : recipient )
        {
        	if ( i> 0) recipientList.append(',');
        	recipientList.append(emailId);
        	i++;
        	
        }

        
        email.addTo(recipient);
        email.setFrom("info@health-ok.in");
        email.setFromName("HealthOK");
        email.setSubject(subject);
        email.setHtml(message);

        
        try {
            SendGrid.Response response = sendgrid.send(email);    
            str=response.getMessage();
            System.out.println("response="+str);
            status = StatusCode.Success;
          }
          catch (SendGridException e) {
        	  status = StatusCode.UnknownError;
        	   str=e.getMessage();
        	   System.out.println("error="+str);
          }
        
       return status;

      }     

}
