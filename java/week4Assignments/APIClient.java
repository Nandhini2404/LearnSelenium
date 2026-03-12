package week4Assignments;

public class APIClient {
	
	// method overloading
	public void sendRequest(String endPoint) 
	{
		System.out.println("Sending request to endpoint");
		System.out.println("Endpoint :" +"endpoint");
	}
	public void sendRequest(String endPoint,String requestBody, String requestStatus) 
	{
		System.out.println("Sending request to get the endpoint");
	    System.out.println("Sending the request to get the RequestBody");
	    System.out.println("Sending the request to get the RequestStatus");
	}

	public static void main(String[] args) 
	{
		APIClient api = new APIClient();
		api.sendRequest("endpoint");
		api.sendRequest("endPoint", "requestBody", "RequestStatus");

	}

}
