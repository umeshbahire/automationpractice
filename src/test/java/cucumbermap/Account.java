package cucumbermap;

import java.util.Hashtable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperation;


public class Account 
{
	@Given("^user opens \"([^\"]*)\" browser and exe \"([^\"]*)\"$")
	public void user_opens_browser_and_exe(String bname, String exe) throws Throwable 
	{
		Object[] input=new Object[2];
        input[0]=bname;
        input[1]=exe;
        SeleniumOperation.browserLaunch(input);
	
	}

	@Given("^user enters url \"([^\"]*)\"$")
	public void user_enters_url(String url) throws Throwable 
	{
		Object[] input1=new Object[1];
        input1[0]=url;      
        SeleniumOperation.openApplication(input1);
        
	}

	@Given("^user click on signin button$")
	public void user_click_on_signin_button() throws Throwable 
	{
		Object[] input2=new Object[1];
        input2[0]="//*[@class='login']";      
        SeleniumOperation.click(input2);
	
	}

	@When("^user enter \"([^\"]*)\" as  emailid$")
	public void user_enter_as_emailid(String email) throws Throwable 
	{
		  Object[] input3=new Object[2];
          input3[0]="//*[@id='email_create']";
          input3[1]=email;
          Hashtable<String,Object> output3=SeleniumOperation.sendKey(input3);
          HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(), "^user enter \"([^\"]*)\" as  emailid$", output3.get("MESSAGE").toString());

	}

	@When("^user click on Create an account button$")
	public void user_click_on_Create_an_account_button() throws Throwable 
	{
		Object[] input4=new Object[1];
        input4[0]="//*[@id='SubmitCreate']";      
        Hashtable<String,Object> output4= SeleniumOperation.click(input4);
        HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(), "^user click on Create an account button$", output4.get("MESSAGE").toString()); 
        
	}

	@Then("^validate account page$")
	public void validate_account_page() throws Throwable 
	{
		 Object[] input5=new Object[2];
         input5[0]="YOUR PERSONAL INFORMATION";
         input5[1]="//*[@id='account-creation_form']/div[1]/h3";
         Hashtable<String,Object> output5= SeleniumOperation.validation(input5);
         HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(), "^validate Login page$", output5.get("MESSAGE").toString()); 
	
	}
	
	@When("^user click on Mr\\. radio button$")
	public void user_click_on_Mr_radio_button() throws Throwable 
	{
		Object[] input6=new Object[1];
        input6[0]="//*[@id='id_gender1']";      
        Hashtable<String,Object> output6= SeleniumOperation.click(input6);
        HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(), "^user click on Mr\\. radio button$", output6.get("MESSAGE").toString()); 

	}

	@When("^user enter \"([^\"]*)\" as firstname$")
	public void user_enter_as_firstname(String fname) throws Throwable 
	{
		 Object[] input7=new Object[2];
         input7[0]="(//*[@type='text'])[2]";
         input7[1]=fname;
         Hashtable<String,Object> output7=SeleniumOperation.sendKey(input7);
         HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(), "^user enter \"([^\"]*)\" as firstname$", output7.get("MESSAGE").toString());	
		
	}

	@When("^user enter \"([^\"]*)\" as lastname$")
	public void user_enter_as_lastname(String lname) throws Throwable 
	{
		 Object[] input8=new Object[2];
         input8[0]="//*[@name='customer_lastname']";
         input8[1]=lname;
         Hashtable<String,Object> output8=SeleniumOperation.sendKey(input8);
         HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(), "^user enter \"([^\"]*)\" as lastname$", output8.get("MESSAGE").toString());	
		
	}

	@When("^user enter \"([^\"]*)\" as password$")
	public void user_enter_as_password(String pwd) throws Throwable 
	{
		 Object[] input9=new Object[2];
         input9[0]="//*[@type='password']";
         input9[1]=pwd;
         Hashtable<String,Object> output9=SeleniumOperation.sendKey(input9);
         HTMLReportGenerator.StepDetails(output9.get("STATUS").toString(), "^user enter \"([^\"]*)\" as password$", output9.get("MESSAGE").toString());		
		
	}

	@When("^user enter \"([^\"]*)\" as company$")
	public void user_enter_as_company(String company) throws Throwable 
	{
		 Object[] input10=new Object[2];
         input10[0]="//*[@id='company']";
         input10[1]=company;
         Hashtable<String,Object> output10=SeleniumOperation.sendKey(input10);
         HTMLReportGenerator.StepDetails(output10.get("STATUS").toString(), "^user enter \"([^\"]*)\" as company$", output10.get("MESSAGE").toString());		
				
	}

	@When("^user enter \"([^\"]*)\" as Address$")
	public void user_enter_as_Address(String add) throws Throwable 
	{
		 Object[] input11=new Object[2];
         input11[0]="//*[@name='address1']";
         input11[1]=add;
         Hashtable<String,Object> output11=SeleniumOperation.sendKey(input11);
         HTMLReportGenerator.StepDetails(output11.get("STATUS").toString(), "^user enter \"([^\"]*)\" as Address$", output11.get("MESSAGE").toString());		
		
	}

	@When("^user enter \"([^\"]*)\" as city$")
	public void user_enter_as_city(String city) throws Throwable 
	{
		 Object[] input12=new Object[2];
         input12[0]="(//*[@type='text'])[10]";
         input12[1]=city;
         Hashtable<String,Object> output12=SeleniumOperation.sendKey(input12);
         HTMLReportGenerator.StepDetails(output12.get("STATUS").toString(), "^user enter \"([^\"]*)\" as city$", output12.get("MESSAGE").toString());		
		
	}

	@When("^user select \"([^\"]*)\" as state$")
	public void user_select_as_state(String state) throws Throwable 
	{
		 Object[] input13=new Object[2];
         input13[0]="//*[@id='id_state']";
         input13[1]=state;
         Hashtable<String,Object> output13=SeleniumOperation.sendKey(input13);
         HTMLReportGenerator.StepDetails(output13.get("STATUS").toString(), "^user select \"([^\"]*)\" as state$", output13.get("MESSAGE").toString());		
		
	}

	@When("^user enter \"([^\"]*)\" as Zip$")
	public void user_enter_as_Zip(String zip) throws Throwable 
	{
		 Object[] input14=new Object[2];
         input14[0]="//*[@id='postcode']";
         input14[1]=zip;
         Hashtable<String,Object> output14=SeleniumOperation.sendKey(input14);
         HTMLReportGenerator.StepDetails(output14.get("STATUS").toString(), "^user enter \"([^\"]*)\" as Zip$", output14.get("MESSAGE").toString());		
		
	}

	@When("^user select \"([^\"]*)\" as country$")
	public void user_select_as_country(String cntry) throws Throwable 
	{
		Object[] input15=new Object[2];
        input15[0]="//*[@id='id_country']";
        input15[1]=cntry;
        Hashtable<String,Object> output15=SeleniumOperation.sendKey(input15);
        HTMLReportGenerator.StepDetails(output15.get("STATUS").toString(), "^user select \"([^\"]*)\" as country$", output15.get("MESSAGE").toString());		
	
		
	}

	@When("^user enter \"([^\"]*)\" as mobileno$")
	public void user_enter_as_mobileno(String mob) throws Throwable 
	{
		Object[] input16=new Object[2];
        input16[0]="//*[@id='phone_mobile']";
        input16[1]=mob;
        Hashtable<String,Object> output16=SeleniumOperation.sendKey(input16);
        HTMLReportGenerator.StepDetails(output16.get("STATUS").toString(), "^user enter \"([^\"]*)\" as mobileno$", output16.get("MESSAGE").toString());		
		
	}

	@When("^user click on Register button$")
	public void user_click_on_Register_button() throws Throwable 
	{
		
		Object[] input17=new Object[1];
        input17[0]="//*[@id='submitAccount']";      
        Hashtable<String,Object> output17= SeleniumOperation.click(input17);
        HTMLReportGenerator.StepDetails(output17.get("STATUS").toString(), "^user click on Register button$", output17.get("MESSAGE").toString()); 

	}

	@Then("^validate authenticate page$")
	public void validate_authenticate_page() throws Throwable 
	{
		Object[] input18=new Object[2];
        input18[0]="Umesh Ahire";
        input18[1]="//*[@id='header']/div[2]/div/div/nav/div[1]/a/span";
        Hashtable<String,Object> output18= SeleniumOperation.validation(input18);
        HTMLReportGenerator.StepDetails(output18.get("STATUS").toString(), "^validate authenticate page$", output18.get("MESSAGE").toString()); 
		
	}



}
