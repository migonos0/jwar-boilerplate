package hi;

import java.io.Serializable;

import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named("helloworld")
@ViewScoped
public class HelloBean implements Serializable {

   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public String getMessage() {
      return "Hello World!";
   }

}