package testing;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/recordings/suites")
public class MyRecordings {
	@GET	
	@Produces(MediaType.APPLICATION_JSON)
	public String sayHtmlHello() {
	return "{\"code\":\"SUCCESS\",\"data\":{\"id\":\"5772900542a2ace908ba36e2\",\"apiKey\":\"b0b0a5d6e56a9858903093e61ad4d499a6758891\"}}";
	}
	
	@POST
	@Path("/tests")
	@Produces(MediaType.APPLICATION_JSON)
	public String getTestss(){
		
		return null;
		
	}
	
}
