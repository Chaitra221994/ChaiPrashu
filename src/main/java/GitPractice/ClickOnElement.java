package GitPractice;

import com.tyss.optimize.common.util.*;
import com.tyss.optimize.nlp.util.*;
import com.tyss.optimize.nlp.util.annotation.*;
import java.util.*;

import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;

@Component("LIC19424_PJT1001_PE_NLPaf04e800-59ad-4fa1-8037-4f1f97e5d70c")
public class ClickOnElement implements Nlp {
    @InputParams({@InputParam(name = "Choose Element", type = "org.openqa.selenium.WebElement")})

    
    @Override
    public List<String> getTestParameters() throws NlpException {
      List<String> params = new ArrayList<>();
      return params;
    }
    
    @Override
    public StringBuilder getTestCode() throws NlpException {
       StringBuilder sb = new StringBuilder();
      return sb;
    }
    
    @Override
      public NlpResponseModel execute(NlpRequestModel nlpRequestModel) throws NlpException {
        
          NlpResponseModel nlpResponseModel = new NlpResponseModel();
          Map<String, Object> attributes = nlpRequestModel.getAttributes();
          WebElement ele=(WebElement)attributes.get("Choose Element");

          try {
           // Your program element business logic starts here ...
        	  ele.click();
              nlpResponseModel.setStatus(CommonConstants.pass);
              nlpResponseModel.setMessage("Clicked on Element");
              }
          catch(Exception e) {
           // Your program element Exception goes here ...
        	  nlpResponseModel.setStatus(CommonConstants.fail);
        	  nlpResponseModel.setMessage("Failed to click on Element"+ e);
              }

          // Your program element business logic ends here ...
          return nlpResponseModel;
      }

  } 