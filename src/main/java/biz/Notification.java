package biz;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import com.sendgrid.SendGrid;
import com.sendgrid.SendGridException;



public class Notification {
	
	public  StatusCode sendSms(String recipientList,  String message)
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
                    
                    
                    HttpURLConnection uc = (HttpURLConnection)url.openConnection();
                    str=uc.getResponseMessage();
                 

                    uc.disconnect();
                    status = StatusCode.Success;

            } catch(Exception ex) {
            	status = StatusCode.UnknownError;
                   str=ex.getMessage();
             	

            }
            return status;
    }

	
    public  StatusCode sendMail(String[] recipient,  String message, String subject)
    
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
            status = StatusCode.Success;
          }
          catch (SendGridException e) {
        	  status = StatusCode.UnknownError;
        	   str=e.getMessage();
          }
        
       return status;

      }     

}
