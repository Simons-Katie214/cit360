
package applicationcontrollerexample;


public class ApplicationController {
private TVshow TVshow;
	
	public ApplicationController() {
            TVshow = new TVshow();
	}
	
	private boolean isAuthenticshow() {
            System.out.println("TV show verified.");
		return true;
	}
	
	private void trackRequest(String request) {
            System.out.println("Show you have Requested: " + request);
	}
	
	public void showRequest( String request ) {
            trackRequest(request);
		if(isAuthenticshow()) {
                    TVshow.tvshow(request);
		}
	}
}
