package test;

import util.xls_reader;

public class AddContactTest {
	xls_reader reader = new xls_reader("/Users/Gaurav/eclipse-workspace/TechfiosTESTNGArtifact/Data/TESTNG.xlsx");
	String email = reader.getcelldata("Sheet1", "Email", 2);
	
	@Test
	public void Addcontact()
	{
		
	}
	

}
