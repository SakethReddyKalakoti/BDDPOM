package stepdefs;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import base.TestBase;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;

public class CRMStepDefs extends TestBase {
	LoginPage loginPage;
	HomePage HomePage;



@Given("User is already on Login Page")
public void user_is_already_on_login_page() {
    // Write code here that turns the phrase above into concrete actions
    initialize();
}

@When("User enters Login Credentials")
public void user_enters_login_credentials(DataTable userCred) {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
    // Double, Byte, Short, Long, BigInteger or BigDecimal.
    //
    // For other transformations you can register a DataTableType.
	loginPage = new LoginPage();
	List<Map<String, String>> data = userCred.asMaps();
	loginPage.login(data.get(0).get("username"),data.get(0).get("pwd"));
}
@Then("User is on Home Page")
public void user_is_on_home_page() {
    // Write code here that turns the phrase above into concrete actions
	HomePage= new HomePage();
	    boolean isValidUser= HomePage.isUserLoggedIn();
		Assert.assertTrue(isValidUser);
}

@Then("Close browser")
public void close_browser() {
    // Write code here that turns the phrase above into concrete actions
    driver.close();
}

}
